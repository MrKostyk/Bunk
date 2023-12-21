class CurrencyConverter {
    private CurrencyExchangeStrategy exchangeStrategy;

    public CurrencyConverter(CurrencyExchangeStrategy exchangeStrategy) {
        this.exchangeStrategy = exchangeStrategy;
    }

    public double convert(double amount, double exchangeRate) {
        return exchangeStrategy.convert(amount, exchangeRate);
    }
}