import java.util.Scanner;

public class Colors {

    public static String getColors() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą, małą literę koloru: ");
            String name = scanner.nextLine().trim();

            switch(name) {
                case "b":
                    System.out.println("biały");
                    break;
                case "c":
                    System.out.println("czarny/czerwony");
                    break;
                case "n":
                    System.out.println("niebieski");
                    break;
                case "ż":
                    System.out.println("żółty");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Colors getColors = new Colors();
        System.out.println(getColors());
    }
}
