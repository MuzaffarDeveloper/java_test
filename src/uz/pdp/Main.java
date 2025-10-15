package uz.pdp;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(">>> 1. Default constructor bilan User yaratish:\n");
        User user1 = new User();
        user1.printInfo();

        System.out.println("\n>>> 2. Name va Phone bilan User yaratish:\n");
        User user2 = new User("Aziz Azizov", "+998901112233");
        user2.printInfo();

        System.out.println("\n>>> 3. To'liq ma'lumotlar bilan User yaratish:\n");
        Location location = new Location("Samarqand viloyati", "Samarqand shahri", "12-uy");
        User user3 = new User("Bobur Boburov", "+998905556677", location);
        user3.printInfo();

        System.out.println("\n>>> 4. Location uchun default qiymatlar:\n");
        Location defaultLocation = new Location(null, null, null);
        System.out.println(defaultLocation);

        System.out.println("\n>>> 5. Setter metodlar orqali o'zgartirish:\n");
        user1.setName("Muzaffar Khadjimukhamedov");
        user1.setPhone("+998970000007");
        user1.setLocation(new Location("Toshkent shahar", "Yakkasaroy tumani", "45-uy"));
        user1.printInfo();


        double num1 = 35;
        double num2 = 23.34;
        System.out.printf("%f %f", num1, num2);
    }
}