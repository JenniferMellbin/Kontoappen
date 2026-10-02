import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    // LISTA:
    // Här sparas alla Account-objekt.
    // private betyder att listan tillhör AccountRegister
    // och inte ska ändras direkt från Main.
    private List<Account> accounts = new ArrayList<>();


    // FACTORY:
// createAccount skapar ett nytt Account och lägger det i listan.
// new Account står här eftersom AccountRegister ansvarar för att skapa och spara kontona.
// Main skickar bara in namn och startsaldo och behöver därför
// inte skapa Account-objekt själv.
    public void createAccount(String owner, double startBalance) {

        Account account = new Account(owner, startBalance);

        accounts.add(account);
    }

    // LISTA ALLA KONTON:
    // Loopen går igenom alla Account som finns i listan.
    // Getters används för att läsa owner och balance.
    public void printAll() {

        for (int i = 0; i < accounts.size(); i++) {

            Account account = accounts.get(i);

            System.out.println(
                    account.getOwner() + ": " + account.getBalance());
        }
    }

    // HITTA KONTO:
    // Söker igenom listan efter rätt owner.
    // Returnerar Account-objektet om namnet hittas.
    public Account findAccount(String owner) {

        for (int i = 0; i < accounts.size(); i++) {

            Account account = accounts.get(i);

            if (account.getOwner().equalsIgnoreCase(owner)) {

                return account;
            }
        }

        // Om inget konto med namnet hittades.
        return null;
    }
}