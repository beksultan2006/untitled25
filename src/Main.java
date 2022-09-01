import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        int number = 8;

    Car lexus = new Car(2006, "LX - 570", 5.7);

        lexus.makeSignal();
        Car toyota = new Car();
        toyota.year = 2010;
        toyota.model = "Corolla";
        toyota.volume = 2.4;

        toyota.move("Bishkek");

        System.out.println(lexus.year +" "+ lexus.volume +" "+ lexus.model);
        System.out.println(toyota.year +" "+ toyota.volume +" "+ toyota.model);






















    }

}