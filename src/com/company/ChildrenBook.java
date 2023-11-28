package com.company;

public class ChildrenBook extends Book {
    int age;
    ChildrenBook() {
        age=0;
    }
    ChildrenBook(int age) {
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public double getPrice() {
        double price = super.getPrice();
        price=price*0.7;
        return price;
    }
}
