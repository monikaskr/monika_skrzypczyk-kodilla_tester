public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies [0] = "Michał";
        movies [1] = "Aga";
        movies [2] = "Ewa";
        movies [3] = "Ania";
        movies [4] = "Tomek";

        System.out.println(movies [2]);

        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}
