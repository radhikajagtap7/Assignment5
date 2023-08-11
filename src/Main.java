// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("MH12RS6031","Thar","Black",2, 4);
        c1.display();
        CheckPost.checkVehicle(c1);

        Bus b1 = new Bus("MH12GH8723","BharatBenz",55);
        b1.display();
        CheckPost.checkVehicle(b1);

    }
}