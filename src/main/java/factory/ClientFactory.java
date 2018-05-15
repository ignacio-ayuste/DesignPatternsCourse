package factory;

/* Es responsabilidad del clientFactory decidir que subclase de
 cliente se va a instanciar. */
public class ClientFactory {

    public static Client createClient(ClientType clientType) {

        switch (clientType) {
            case BASIC:
                return new BasicClient();
            case PREMIUM:
                return new PremiumClient();
            default:
                return null;
        }
    }

    //method validate

}