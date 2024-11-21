# Gruppe-17-software-engineering
Gruppe 17 sin repository for Software Engineering og Testing.

For å teste programmet, er det bare å kjøre "Main.java", så burde alt fungere.

Når programmet starter vil flere vinduer (moduler) komme opp:
remote - Dette er fjernkontrollen. For å bruke programmet må dette vinduet være i fokus (klikk på det) før den kan registrere trykk på knapper.
terminal - Dette vinduet er for demonstrasjon at trykk av knapper blir registrert, og å fortelle hva de gjør.
lamp1 - En generisk lampe som kan skrus av og på.
lamp2 - Det samme som lamp1, for å demonstrere at det går ann å benytte flere av samme enhet.
lamp3 - Ligner lamp1 og lamp2, men har muligheten til å dimme lysstyrke opp og ned.
outlet1 - Simulerer at en stikkontakt skrus av og på.
door1 - Simulerer at en dør åpnes og låses.

Det er også mulighet for å koble opp mot en Phillips HUE lampe, men det blir vanskelig å gjøre når koden testes uten å ordne med API og authentication selv. En video av at dette fungerer blir vedlagt.

Fjernkontrollen har 3 profiler som alle gjør forskjellige ting. 
Her er bruksanvisningen til de forskjellige profilene:

Standardprofil (Profilen programmet startes med):
1: Lyst på
2: Lys av
3: Lys toggle
4: Lås dør
5: Lås opp dør
6: Dørlås toggle
7: Stikkontakt på
8: Stikkontakt av
9: Stikkontakt toggle
Q: Lys dim opp
W: Lys dim ned
E: Phillips Hue på 
R: Phillips Hue av 
T: Phillips Hue toggle
Y: Phillips Hue dim opp
U: Phillips Hue dim ned

Profil en:
O: Lyst på
F: Lys av
1: Lys toggle
L: Lås dør
U: Lås opp dør
2: Dørlås toggle
E: Stikkontakt på
S: Stikkontakt av
3: Stikkontakt toggle
Pil opp: Lys dim opp
Pil ned: Lys dim ned
Q: Phillips Hue på 
A: Phillips Hue av 
4: Phillips Hue toggle
Pil høyre: Phillips Hue dim opp
Pil venstre: Phillips Hue dim ned

Profil to:
Denne profilen er helt tom, for å demonstrere hva som skjer når en profil ikke er satt opp av brukeren enda (Knappene blir registrert, men ingen signal sendes.)

Disse knappene er standarisert blandt alle profilene:
B: Bytt til standard profil
N: Bytt til profil en
M: Bytt til profil to
Enter: Veksler mellom profilene
Backspace: Lagre instillinger, og skru av fjernkontrollen. (Lukker også alle moduler.)

Hvis man velger å avbryte porgrammet via ItelliJ eller ved å trykke på X knappen på ett av vinduene, vil programmet avsluttes uten at noen av instillingene lagres.
