public class User {

    String imie;
    int wiek;

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        User aga = new User("Aga", 20);
        User beti = new User("Beti", 33);
        User tom = new User("Tom", 58);
        User michal = new User("Michał", 13);
        User ewa = new User("Ewa", 18);
        User monika = new User("Monika", 45);

        User[] users = {aga, beti, tom, michal, ewa, monika};

        int sum = 0;
        for (int i = 0; i < users.length; i++) sum = sum + users[i].wiek;
        System.out.println();
        System.out.println("Suma : " + sum);

        int avg = sum / users.length;
        System.out.println();
        System.out.println("Średnia : " + avg);

        for (int i = 0; i < users.length; i++) {
            if (users[i].wiek > avg) {
                System.out.println(users[i].imie);
            }
        }
    }
}
