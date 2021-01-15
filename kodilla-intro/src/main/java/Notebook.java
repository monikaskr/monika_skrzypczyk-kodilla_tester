public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("Light.");
        } else if (this.weight >= 800 && this.weight <= 1700) {
            System.out.println("Not very heavy.");
        } else {
            System.out.println("Heavy.");
        }

    }

    public void checkYear() {
        if (this.year >= 2021 && this.price <=  1400 ) {
            System.out.println("Super okazja.");
        } else if (this.year >= 2020 && this.price >= 1400) {
            System.out.println("Rozważ propozycję.");
        } else {
            System.out.println("Laptop nie spełnia twoich oczekiwań.");
        }

    }
}
