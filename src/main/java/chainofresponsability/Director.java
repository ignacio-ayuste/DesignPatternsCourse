package chainofresponsability;

public class Director extends Handler{

    @Override
    public void handleRequest(Loan loan) {
        if(loan.getAmount() >= 10000){
            System.out.println("The Director handle the Request");
        }
    }

}