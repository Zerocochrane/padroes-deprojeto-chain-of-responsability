public class TenDispenser extends PaperCurrencyDispenser {

    public TenDispenser() {
        super();
    }

    @Override
    public String dispense(PaperCurrency currency) {
        String saida = null;
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 10) {
                int count = amount / 10;
                remainder = amount % 10;
                saida = " - 10$ " + count;
            }
            if (remainder > 0 && this.nextDispenser != null) {
                saida.concat(this.nextDispenser.dispense(new PaperCurrency(remainder)));
            }
        }
        return saida;
    }

}