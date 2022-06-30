public abstract class PaperCurrencyDispenser {
    protected PaperCurrencyDispenser nextDispenser;

    public void setNextDispenser(PaperCurrencyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract String dispense(PaperCurrency currency);
}