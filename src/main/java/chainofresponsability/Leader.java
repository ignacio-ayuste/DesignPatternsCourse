package chainofresponsability;

public class Leader extends Handler{

    public void handleRequest(Loan loan) {
        if(loan.getAmount() <= 5000){
            System.out.println("The Leader handle your request");
        }else{
            successor.handleRequest(loan);
        }
    }

}