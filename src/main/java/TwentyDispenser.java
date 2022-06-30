public class TwentyDispenser extends PaperCurrencyDispenser {

    public TwentyDispenser() {
        super();
    }

    @Override
    public String dispense(PaperCurrency currency) {
        String saida = null;
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 20) {
                int count = amount / 20;
                remainder = amount % 20;
                saida = " - 20$ " + count;
            }
            if (remainder > 0 && this.nextDispenser != null) {
                saida = saida + this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
        return saida;
    }
}