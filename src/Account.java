
public class Account {

    // INKAPSLING:
    // Private skyddar informationen så Main inte kan ändra den direkt.
    //Inkapsling finns i Account.java

    private String owner;
    private double balance;


    // KONSTRUKTOR:
    // Körs när ett nytt Account skapas.
    // Sätter ägare och startsaldo.
    public Account(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }


    // GETTER:
    // GETTER är ett sätt att få läsa något som är skyddat.
    // Gör att Main kan läsa ägarens namn trots att owner är private.
    public String getOwner() {
        return owner;
    }

    // GETTER:
    // Gör att Main kan läsa saldot trots att balance är private.
    public double getBalance() {
        return balance;
    }

    // DEPOSIT:
    // Sätter in pengar genom att öka saldot.
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }


    // WITHDRAW:
    // Kontrollerar först om det finns tillräckligt med pengar.
    public void withdraw(double amount) {

        if (amount > this.balance) {

            // För stort uttag stoppas och saldot ändras inte.
            System.out.println("Uttag medges ej - beloppet är större än saldot.");

        } else {

            // Uttaget är tillåtet och pengarna dras från saldot.
            this.balance = this.balance - amount;
        }
    }
}
