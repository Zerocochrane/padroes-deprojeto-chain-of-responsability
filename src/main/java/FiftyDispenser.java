public class FiftyDispenser extends PaperCurrencyDispenser {

    public FiftyDispenser() {
        super();
    }

    @Override
    public String dispense(PaperCurrency currency) {
        String saida = null;
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 50) {
                int count = amount / 50;
                remainder = amount % 50;
                saida = " - 50$ " + count;
            }
            if (remainder > 0 && this.nextDispenser != null) {
                saida = saida + this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
        return saida;
    }
}