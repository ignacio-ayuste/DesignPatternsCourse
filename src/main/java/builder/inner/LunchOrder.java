package builder.inner;

public class LunchOrder {

    private String bread;
    private String condiments;
    private String meat;

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    //Inner Builder
    public static class Builder{
        private String bread;
        private String condiments;
        private String meat;

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

    }

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.meat = builder.meat;
    }

}