public class Cat extends Animal{
    private String color;
    public Cat(Boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }
    public Cat(Boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color= "Red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

