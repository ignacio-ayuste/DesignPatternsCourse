package builder.inner;


import org.junit.Test;

public class LunchOrderTest {

    @Test
    public void createLunchOrder(){

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("small")
                .condiments("mustard")
                .meat("cow");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);
    }

}