package mediator;

public class TabletColleague extends Colleague{

    public TabletColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Tablet received: " + message);
    }
}
