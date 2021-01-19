public class Application {

    String name = "Adam";
    double age = 40.5;
    double height = 178;

    public Application(String name, double age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkPerson() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application application = new Application ("Adam", 40.5, 178);
        System.out.println(application.name + " " + application.age + " " + application.height);
        application.checkPerson();

    }

}
