package za.ac.cput.entity;

/**
 * Food.java
 * Entity for the Food
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    private int foodId;
    private String name, category;
    private double price;

    protected Food() {}

    private Food(Builder builder)
    {
        this.foodId = builder.foodId;
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Builder
        public static class Builder{

        @Id
        private int foodId;
        private String name, category;
        private double price;

        public Builder setFoodId(int foodId) {
            this.foodId = foodId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Food build()
        {
            return new Food(this);
        }

        public Builder copy(Food food)
        {
            this.foodId = food.foodId;
            this.name = food.name;
            this.category = food.category;
            this.price = food.price;

            return this;
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
