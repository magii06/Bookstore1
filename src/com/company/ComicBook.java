package com.company;

public class ComicBook extends Book {
    String characterName;
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    ComicBook() {
        characterName=" ";
    }
    ComicBook(String characterName) {
        this.characterName=characterName;
    }
    @Override
    public double getPrice() {
        return getPrice(0.6);
    }
    public double getPrice(double sale) {
        double price=super.getPrice();
        price=price*sale;
        System.out.println("Книгата е на цена: " + getPrice());
        return price;
    }
}
