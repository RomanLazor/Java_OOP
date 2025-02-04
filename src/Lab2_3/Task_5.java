package Lab2_3;

public class Task_5 {
    public static void main(String[] args) {
        int c = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String timeStr = String.format("%02d:%02d", h, m);
                if (new StringBuilder(timeStr).reverse().toString().equals(timeStr)) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
