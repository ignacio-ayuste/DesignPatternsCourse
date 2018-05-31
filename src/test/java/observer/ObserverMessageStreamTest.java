package observer;

import org.junit.Test;

public class ObserverMessageStreamTest {

    @Test
    public void testClients(){

        Subject messageStream = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(messageStream);
        DesktopClient desktopClient = new DesktopClient(messageStream);

        phoneClient.addMessage("New Message");
        desktopClient.addMessage("Other Message");

    }



}
