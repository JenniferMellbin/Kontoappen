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

        while (choice != 5) {

            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");

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
            // while-loopen avslutas eftersom choice nu är 5.
            else if (choice == 5) {

                System.out.println("Programmet avslutas.");
            }


            // Om användaren skriver ett annat menyval.
            else {

                System.out.println("Ogiltigt val.");
            }
        }


        // Stänger Scanner när programmet är färdigt.
        scanner.close();
    }
}