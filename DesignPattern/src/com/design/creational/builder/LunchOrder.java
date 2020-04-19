package com.design.creational.builder;

public class LunchOrder {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
            // We can mandate the mandatory parameters for Lunch Order in this constructor.
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread == null ? "" : bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments == null ? "" : condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing == null ? "" : dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat == null ? "" : meat;
            return this;
        }

    }


    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread == null ? "" : builder.bread;
        this.condiments = builder.condiments == null ? "" : builder.condiments;
        this.dressing = builder.dressing == null ? "" : builder.dressing;;
        this.meat = builder.meat == null ? "" : builder.meat;;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
