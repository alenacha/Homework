import org.w3c.dom.ls.LSOutput;

public class Lesson6 {
    public static void main(String[] args) {
        Animal tiger = new Animal(false, "Meat", 4);
        printAnimal(tiger);
        Cat rag_doll = new Cat(false, "Cat food", 4, "White");
        printCat(rag_doll);
        Cat maine_coon= new Cat(false, "People's food",4);
        printCat(maine_coon);
    }

    private static void printAnimal(Animal tiger) {
        System.out.println("Vegetarian= "+tiger.getVegetarian());
        System.out.println("Eats= "+tiger.getEats());
        System.out.println("NoOfLegs= "+tiger.getNoOfLegs());
    }

    public static void printCat(Cat rag_doll) {
        System.out.println("Vegetarian= "+rag_doll.getVegetarian());
        System.out.println("Eats= "+rag_doll.getEats());
        System.out.println("NoOfLegs= "+rag_doll.getNoOfLegs());
        System.out.println("Color= "+rag_doll.getColor());
    }

    }