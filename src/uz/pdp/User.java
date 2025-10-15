package uz.pdp;

public class User {
    private String name;
    private String phone;
    private Location location;

    {
        this.name = "Ism kiritilmagan";
        this.phone = "+998901234567";
        this.location = new Location("Toshkent shahar", "Yakkasaroy tumani", "74");
        System.out.println("Default qiymatlar");
    }

    public User() {
        System.out.println("Default constructor ishladi");
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
        System.out.println("Parametrli constructor (name, phone) ishladi");
    }

    public User(String name, String phone, Location location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        System.out.println("To'liq parametrli constructor ishladi");
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }

    public void printInfo() {
        System.out.println("\n=== Foydalanuvchi Ma'lumotlari ===");
        System.out.println("Ism: " + name);
        System.out.println("Telefon: " + phone);
        System.out.println("Manzil:");
        System.out.println("  - Viloyat: " + location.regionName());
        System.out.println("  - Tuman: " + location.districtName());
        System.out.println("  - Uy raqami: " + location.homeNumber());
        System.out.println("================================\n");
    }
}
