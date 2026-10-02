import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner används för att läsa vad användaren skriver i konsolen.
        Scanner scanner = new Scanner(System.in);


        // AccountRegister håller reda på alla konton.
        // Main behöver därför inte själv ha en lista med konton.
        AccountRegister register = new AccountRegister();


        // Programmet fortsätter tills användaren väljer 5.
        int choice = 0;

        while (choice != 6) {
// Lite snyggare utskrift

            System.out.println();
            System.out.println("===== KONTOAPPEN =====");
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Överför pengar");
            System.out.println("6. Avsluta");
            System.out.println("======================");

            System.out.print("Välj: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            // VAL 1:
            // Användaren skriver ägare och startsaldo.
            // Main skickar sedan informationen till createAccount.
            if (choice == 1) {

                System.out.print("Ange ägarens namn: ");
                String owner = scanner.nextLine();

                System.out.print("Ange startsaldo: ");
                double startBalance = scanner.nextDouble();
                scanner.nextLine();

                // FACTORY:
                // Main gör INTE new Account här.
                // AccountRegister ansvarar för att skapa objektet.
                register.createAccount(owner, startBalance);

//Snygga till utskriften lite

                System.out.println("Kontot har skapats för " + owner + ".");
                System.out.println("Startsaldo: " + startBalance + " kr");
            }


            // VAL 2:
            // Ber registret skriva ut alla konton.
            else if (choice == 2) {

                register.printAll();
            }


            // VAL 3:
            // Hittar rätt konto och sätter in pengar på det.
            else if (choice == 3) {

                System.out.print("Ange ägarens namn: ");
                String owner = scanner.nextLine();

                Account account = register.findAccount(owner);

                if (account != null) {

                    System.out.print("Belopp att sätta in: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    account.deposit(amount);

                    System.out.println(
                            "Nytt saldo: " + account.getBalance()
                    );

                } else {
                    System.out.println("Kontot hittades inte.");
                }
            }


            // VAL 4:
// Hittar rätt konto och försöker göra ett uttag.
            else if (choice == 4) {

                System.out.print("Ange ägarens namn: ");
                String owner = scanner.nextLine();

                Account account = register.findAccount(owner);

                if (account != null) {

                    System.out.print("Belopp att ta ut: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    account.withdraw(amount);

                    System.out.println(
                            "Saldo: " + account.getBalance()
                    );

                } else {
                    System.out.println("Kontot hittades inte.");
                }
            }


            // VAL 5:
// Överför pengar mellan två konton.
            else if (choice == 5) {

                System.out.print("Från vilket konto: ");
                String fromOwner = scanner.nextLine();

                System.out.print("Till vilket konto: ");
                String toOwner = scanner.nextLine();

                Account fromAccount = register.findAccount(fromOwner);
                Account toAccount = register.findAccount(toOwner);

                if (fromAccount != null && toAccount != null) {

                    System.out.print("Belopp att överföra: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    if (amount > 0 && amount <= fromAccount.getBalance()) {

                        fromAccount.withdraw(amount);
                        toAccount.deposit(amount);

                        System.out.println("Överföringen är klar.");
                        System.out.println(
                                "Nytt saldo för " + fromOwner + ": "
                                        + fromAccount.getBalance()
                        );

                    } else {
                        System.out.println("Överföringen kunde inte genomföras.");
                    }

                } else {
                    System.out.println("Ett eller båda kontona hittades inte.");
                }
            }


// VAL 6:
// Avslutar programmet.
            else if (choice == 6) {

                System.out.println("Programmet avslutas.");
            }


// Om användaren skriver ett annat menyval.
            else {

                System.out.println("Ogiltigt val.");
            }

        }

        scanner.close();
    }
}