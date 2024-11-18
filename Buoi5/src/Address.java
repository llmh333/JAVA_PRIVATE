import java.util.Scanner;

public class Address {
    Scanner scanner = new Scanner(System.in);
    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    void input() {
        System.out.print("Commune: ");
        commune = scanner.nextLine();

        System.out.print("district: ");
        district = scanner.nextLine();

        System.out.print("city: ");
        city = scanner.nextLine();
    }

    void output() {
        System.out.printf("%-15s %-15s %-15s\n", commune , district, city);
    }

}

