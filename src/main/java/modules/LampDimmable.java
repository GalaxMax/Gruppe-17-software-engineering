package modules;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import settingsSaver.SettingsReader;
import settingsSaver.SettingsWriter;
import java.util.HashMap;

public class LampDimmable extends Lamp {
    private int brightness = 255;
    private JLabel label;
    private BufferedImage lampImage;
    private ImageIcon lampIcon;

    public LampDimmable(String name) {
        super(name);
        initializeLampIcon();
    }

    public LampDimmable(String name, TextModule terminal) {
        super(name, terminal);
        initializeLampIcon();
    }

    private void initializeLampIcon() {
        try {
            lampImage = ImageIO.read(new File("src/main/resources/icons/lampOn.png"));
            lampIcon = new ImageIcon(scaleImage(lampImage, 200, 150));
        } catch (IOException e) {
            System.out.println("Error loading lamp icon: " + e.getMessage());
        }

        label = new JLabel();
        label.setIcon(lampIcon);
        label.setBounds(100, 75, 200, 150);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        outputWindow.getContentPane().removeAll();
        outputWindow.add(label);
        outputWindow.revalidate();
        outputWindow.repaint();
    }

    private void updateLampIconBrightness() {
        if (lampImage == null) return;

        BufferedImage dimmedImage = new BufferedImage(
                lampImage.getWidth(), lampImage.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int x = 0; x < lampImage.getWidth(); x++) {
            for (int y = 0; y < lampImage.getHeight(); y++) {
                int rgb = lampImage.getRGB(x, y);
                Color color = new Color(rgb, true);

                int red = (color.getRed() * brightness) / 255;
                int green = (color.getGreen() * brightness) / 255;
                int blue = (color.getBlue() * brightness) / 255;

                Color dimmedColor = new Color(red, green, blue, color.getAlpha());
                dimmedImage.setRGB(x, y, dimmedColor.getRGB());
            }
        }

        lampIcon = new ImageIcon(scaleImage(dimmedImage, 200, 150));
        label.setIcon(lampIcon);
        label.repaint();
    }

    private Image scaleImage(BufferedImage original, int width, int height) {
        return original.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public void setBrightness(int newBrightness) {
        this.brightness = Math.max(0, Math.min(255, newBrightness));
        updateLampIconBrightness();
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void lightDimUp() {
        if (brightness <= 238) brightness += 17;
        else brightness = 255;
        terminalAccess("Lys dimmet opp");
        updateLampIconBrightness();
    }

    public void lightDimDown() {
        if (brightness >= 17) brightness -= 17;
        else brightness = 0;
        terminalAccess("Lys dimmet ned");
        updateLampIconBrightness();
    }

    @Override
    public void lightOn() {
        setBrightness(255);
        terminalAccess("Lys på");
        setState(true);
    }

    @Override
    public void lightOff() {
        setBrightness(0);
        terminalAccess("Lys av");
        setState(false);
    }

    @Override
    protected void refresh() {
        if (getState()) lightOn();
        else lightOff();
    }

    @Override
    public boolean loadSettings() {
        HashMap<String, Integer> savedSettings = SettingsReader.readJSON(this.name);
        if (!savedSettings.isEmpty()) {
            setState(savedSettings.get("state") == 1);
            setBrightness(savedSettings.get("brightness"));
            return true;
        }
        return false;
    }

    @Override
    public void saveSettings() {
        settings.put("state", this.state ? 1 : 0);
        settings.put("brightness", this.brightness);
        SettingsWriter.writeJSON(this.name, this.settings);
    }
}
