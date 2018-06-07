package mediator;

import org.junit.Test;

public class ApplicationMediatorTest {

    @Test
    public void testChat(){

        ApplicationMediator applicationMediator = new ApplicationMediator();
        Colleague desktop = new ConcreteColleague(applicationMediator);
        Colleague mobile = new MobileColleague(applicationMediator);
        Colleague tablet = new TabletColleague(applicationMediator);

        applicationMediator.addColleague(desktop);
        applicationMediator.addColleague(mobile);
        applicationMediator.addColleague(tablet);

        desktop.sendMessage("Buen dia!");
        mobile.sendMessage("Hola, como estas?");
        tablet.sendMessage("good bye!");

    }



}