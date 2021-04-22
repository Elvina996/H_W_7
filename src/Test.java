public class Test {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(name: "Рыжик");
        cats[1] = new Cat(name: "Мурзик");
        cats[2] = new Cat(name: "Маркиз");

        Plate plate = new Plate( food:75);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.addFood(100);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

    }
}
