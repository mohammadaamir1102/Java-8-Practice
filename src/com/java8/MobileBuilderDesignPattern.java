package com.java8;

public class MobileBuilderDesignPattern {
    private String mobileName;
    private String processor;
    private String ram;
    private Double price;


    public String getMobileName() {
        return mobileName;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public Double getPrice() {
        return price;
    }

    private MobileBuilderDesignPattern(Builder builder) {
        this.mobileName = builder.mobileName;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.price = builder.price;
    }

    public static class Builder {

        private String mobileName;
        private String processor;
        private String ram;
        private Double price;

        public MobileBuilderDesignPattern build() {
            return new MobileBuilderDesignPattern(this);
        }

        public Builder setMobileName(String mobileName) {
            this.mobileName = mobileName;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }
    }


    @Override
    public String toString() {
        return "MobileBuilderDesignPattern{" +
                "mobileName='" + mobileName + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }
}
