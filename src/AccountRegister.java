import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    // LISTA:
    // Här sparas alla Account-objekt.
    // private betyder att listan tillhör AccountRegister
    // och inte ska ändras direkt från Main.
    private List<Account> accounts = new ArrayList<>();


    // FACTORY:
    // Den här metoden skapar ett nytt Account.
    // Därför står "new Account" här och inte i Main.
    // Det nya kontot läggs sedan till i listan.
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
                    account.getOwner() + ": " + account.getBalance()
            );
        }
    }


    // HITTA KONTO:
    // Söker igenom listan efter rätt owner.
    // Returnerar Account-objektet om namnet hittas.
    public Account findAccount(String owner) {

        for (int i = 0; i < accounts.size(); i++) {

            Account account = accounts.get(i);

            if (account.getOwner().equals(owner)) {

                return account;
            }
        }

        // Om inget konto med namnet hittades.
        return null;
    }
}