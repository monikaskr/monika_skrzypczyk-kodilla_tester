public class LeapYear {
    public static void main(String[] args) {
        int yearNumber = 2021;
        System.out.println(yearNumber);

        if (yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0) {
            System.out.println("Rok przestępny!");
        } else {
            System.out.println("Rok nie przestepny!");
        }
    }
}
