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
        double price=super.getPrice();
        price=price*0.6;
        return price;
    }
    public double getPrice(double sale) {
        return sale;
    }
}
