package mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {

    private List<Colleague> colleagueList;

    public ApplicationMediator() {
        colleagueList = new ArrayList<Colleague>();
    }

    @Override
    public void send(String message, Colleague originColleague) {
        for(Colleague colleague : colleagueList){
            //The colleague don't send a message to himself.
            if(colleague != originColleague){
                colleague.receive(message);
            }
        }
    }

    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }
}