package Lab3_1;

public class BakingSettings {
    public static void main(String[] args) {
        CookieProperties bake1 = new CookieProperties(15.3, 30, 180);
        MuffinProperties bake2 = new MuffinProperties(10.5, 45, 210);
        PieProperties bake3 = new PieProperties(30.6, 60, 240);

        System.out.println("Your receipts for baking:");
        System.out.println("Cookie" + bake1);
        System.out.println("Muffin" + bake2);
        System.out.println("Pie" + bake3);
    }
}


