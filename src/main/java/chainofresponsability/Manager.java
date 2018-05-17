package chainofresponsability;

public class Manager extends Handler{

    public void handleRequest(Loan loan) {
        if(loan.getAmount() >= 5000 && loan.getAmount() <= 10000){
            System.out.println("The Manager handle your Request");
        }else{
            successor.handleRequest(loan);
        }
    }
}
