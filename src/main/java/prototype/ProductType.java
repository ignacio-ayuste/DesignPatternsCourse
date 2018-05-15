package prototype;

public enum ProductType {

    GAME_OF_THRONES("GOT"),
    HARRY_POTTER("HRP"),
    JORGITO("JOR");    
    
    private String code;

    private ProductType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
}