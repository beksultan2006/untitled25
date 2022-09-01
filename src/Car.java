public class Car {
    // 1 элемент класса - поля
    public int year;
    public String model;
    public double volume; // объём двигателя

    // 2 элемент - конструктор
    // конструктор поумолчанию


    public Car() {
    }

    public Car(int year, String model, double volume) {
        this.year = year;
        this.model = model;
        this.volume = volume;


        // 3 элемент метод
    }
    public void makeSignal(){

            System.out.println(this.model + " Beeeeeeeeeeeee beeeeeep");
    }

    public void move(){
        System.out.println("Car "+ this.model + "poehala");
    }
    public void  move(String city){
        System.out.println("Car "+ this.model + " poehala " + city);
    }
}
