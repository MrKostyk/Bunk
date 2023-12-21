class DirectCurrencyExchangeStrategy implements CurrencyExchangeStrategy {
    @Override
    public double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}

