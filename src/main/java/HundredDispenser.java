public class HundredDispenser extends PaperCurrencyDispenser {

    public HundredDispenser() {
        super();
    }

    @Override
    public String dispense(PaperCurrency currency) {
        String saida = null;
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 100) {
                int count = amount / 100;
                remainder = amount % 100;
                saida = "100$ " + count;
            }
            if (remainder > 0 && this.nextDispenser != null) {
                saida = saida + this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
        return saida;
    }
}
