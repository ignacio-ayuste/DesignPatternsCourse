package chainofresponsability;

import org.junit.Test;

public class BankTest {

    public static final int LEADER_MAX_AMOUNT = 5000;
    public static final int MANAGER_MAX_AMOUNT = 10000;
    public static final int DIRECTOR_MIN_AMOUNT = 10001;

    @Test
    public void testLeaderApprove(){
        Bank bank = new Bank();
        bank.requestLoan(LEADER_MAX_AMOUNT);
    }

    @Test
    public void testManagerApprove(){
        Bank bank = new Bank();
        bank.requestLoan(MANAGER_MAX_AMOUNT);
    }

    @Test
    public void testDirectorApprove(){
        Bank bank = new Bank();
        bank.requestLoan(DIRECTOR_MIN_AMOUNT);
    }

}