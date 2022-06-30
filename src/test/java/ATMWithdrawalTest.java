import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMWithdrawalTest {
    @Test
    public void deveRetornar1111(){
        assertEquals("100$ 1 - 50$ 1 - 20$ 1 - 10$ 1", ATMWithdrawal.withdraw(new PaperCurrency(180)));
    }

    @Test
    public void deveRetornar1120(){
        assertEquals("100$ 1 - 50$ 1 - 20$ 2", ATMWithdrawal.withdraw(new PaperCurrency(190)));
    }


}