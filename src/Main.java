import java.util.Random;

public class Main {
    public static String goWalk(int personAge, int temperature) {
        System.out.println("Возраст человека = " + generateRandomAge() + " Температура на улице = " + temperature);
        if (personAge > 20 && personAge < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (personAge < 20 && temperature >= 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (personAge > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "Возраст человека = " + personAge + " Температура на улице = " + temperature;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(55) + 1;
        return x;
    }

    public static void main(String[] args) {

        goWalk(44,12);
        goWalk(50,20);
        goWalk(35,10);
        goWalk(10,-25);
        goWalk(25,12);
        generateRandomAge();

    }

}