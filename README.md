Kontoappen

1. Inkapsling

Inkapsling innebär att man skyddar 
information i koden. I Account har jag
gjort owner och balance private så att
de inte kan ändras direkt från Main. 
Om balance inte hade varit private 
hade man kunnat ändra saldot direkt.

2. Factory

Jag använder createAccount i AccountRegister
för att skapa nya konton. Det är där 
new Account finns istället för i Main. 
Main skickar bara vidare namnet och 
startsaldot när ett konto ska skapas.

3. Datalogiskt menyval

När man väljer att sätta in pengar 
skriver man först vem som äger kontot.
findAccount letar upp rätt konto och sedan 
används deposit för att sätta in 
pengarna. Efter det visas det nya saldot med 
getBalance.

AI-reflektion

Jag har använt AI för att bryta ner instrujtionerna
och när jag har fastnat 
för att få koden förklarad steg för steg. 
Ett exempel var när jag fick felet 
balance has private access in Account. 
Först förstod jag inte varför jag inte 
kunde använda balance direkt. Jag ändrade 
då koden så att jag använde getBalance() 
istället och testade att det fungerade i 
IntelliJ.