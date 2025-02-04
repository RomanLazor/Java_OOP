public class Main {
    public static void main(String[] args) {
        Practice fr = new Practice(10.5, 10);
        Practice fr2 = new Practice(20, 21.5);
        double s = fr.length * fr.width;
        double s2 = fr2.length * fr2.width;

        System.out.println(s);
        System.out.println(s2);
    }
}