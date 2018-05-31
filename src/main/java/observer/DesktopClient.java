package observer;

public class DesktopClient extends Observer {

    public DesktopClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " - Sent from desktop");
    }

    @Override
    void update() {
        System.out.println("Desktop Stream: " + subject.getState());
    }
}
