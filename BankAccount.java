class BankAccount {
    private final User owner;
    private Currency currency;
    private double balance;
    private double interestRate;
    private double creditLimit;
    private final CurrencyConverter currencyConverter;

    public BankAccount(User owner, Currency currency, CurrencyConverter currencyConverter) {
        this.owner = owner;
        this.currency = currency;
        this.balance = 0;
        this.interestRate = 0;
        this.creditLimit = 0;
        this.currencyConverter = currencyConverter;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " " + currency.getCode());
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " " + currency.getCode());
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        System.out.println("Interest rate set to " + interestRate + "%");
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
        System.out.println("Credit limit set to " + creditLimit + " " + currency.getCode());
    }

    public void convertBalance(Currency newCurrency) {
        balance = currencyConverter.convert(balance, newCurrency.getExchangeRate());
        currency = newCurrency;
        System.out.println("Balance converted to " + newCurrency.getCode());
    }

    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Owner: " + owner.getFullName());
        System.out.println("Currency: " + currency.getCode());
        System.out.println("Balance: " + balance + " " + currency.getCode());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Credit Limit: " + creditLimit + " " + currency.getCode());
    }
}
