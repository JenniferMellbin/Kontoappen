Kontoappen
Länk redovisning: https://teams.microsoft.com/l/meetingrecap?driveId=b%21p9byWfPFmEWR8VpVV6aRkuEAmquQgQtFpLYEdzCT6g8iasw_Q5FWTbADlsV3gRoO&driveItemId=01UNCLKEBHAQSKP6YKPNHI2Q77FO6TDFC7&sitePath=https%3A%2F%2Ffunet-my.sharepoint.com%2F%3Av%3A%2Fg%2Fpersonal%2F3kdyhapp26_mellje_folkuniversitetet_nu%2FIQAnBCSn-wp7To1D_yu9MZRfASClK6TUjrbY6Z1t2uj50Zk&fileUrl=https%3A%2F%2Ffunet-my.sharepoint.com%2F%3Av%3A%2Fg%2Fpersonal%2F3kdyhapp26_mellje_folkuniversitetet_nu%2FIQAnBCSn-wp7To1D_yu9MZRfASClK6TUjrbY6Z1t2uj50Zk&threadId=19%3Ameeting_YmIzYzIxNjUtYjA0My00ZDI3LTg5MWEtNGUzMzJlNTNmZTMy%40thread.v2&organizerId=72c68972-37dd-4176-9ad6-560b5646c202&tenantId=a4d3b9bf-2082-4eee-ab79-fd407faef1e5&callId=8d95cb36-9cb1-4d67-8fe3-24114a49ad17&threadType=Meeting&meetingType=MeetNow&subType=RecapSharingLink_RecapChiclet
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

Jag har använt AI för att bryta ner instrutionerna
och när jag har fastnat 
för att få koden förklarad steg för steg. 
Ett exempel var när jag fick felet 
balance has private access in Account. 
Först förstod jag inte varför jag inte 
kunde använda balance direkt. Jag ändrade 
då koden så att jag använde getBalance() 
istället och testade att det fungerade i 
IntelliJ. AI har även fått hjälpa mig att pusha 
upp till github då jag fortfarande inte förstår
riktigt och tycker det är lite svårt att
komma ihåg dom olika stegen