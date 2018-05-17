package chainofresponsability;

public class Bank {

    public void requestLoan(int amount){

        //build the chain
        Leader leader = new Leader();
        Manager manager = new Manager();
        Director director = new Director();

        leader.setSuccessor(manager);
        manager.setSuccessor(director);

        leader.handleRequest(new Loan(amount));
    }


}