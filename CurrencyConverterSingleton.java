class CurrencyConverterSingleton {
    private static CurrencyConverterSingleton instance;
    private CurrencyExchangeStrategy exchangeStrategy;

    private CurrencyConverterSingleton() {
        this.exchangeStrategy = new DirectCurrencyExchangeStrategy();
    }

    public static CurrencyConverterSingleton getInstance() {
        if (instance == null) {
            instance = new CurrencyConverterSingleton();
        }
        return instance;
    }

    public void setExchangeStrategy(CurrencyExchangeStrategy exchangeStrategy) {
        this.exchangeStrategy = exchangeStrategy;
    }

    public CurrencyConverter getCurrencyConverter() {
        return new CurrencyConverter(exchangeStrategy);
    }
}