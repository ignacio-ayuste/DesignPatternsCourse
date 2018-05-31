package template;

public abstract class OrderTemplate {

    public boolean isGift;
    protected abstract void checkout();
    protected abstract void payment();
    protected abstract void receipt();
    protected abstract void delivery();

    public final void processOrder(){
        checkout();
        payment();
        if(isGift){
            wrapGift();
        }else {
            receipt();
        }
        delivery();
    }

    private void wrapGift() {
        System.out.println("Gift wrapped");
    }


}
