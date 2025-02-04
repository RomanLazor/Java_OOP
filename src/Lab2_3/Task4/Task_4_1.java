package Lab2_3.Task4;

public class Task_4_1 {
    public static void main(String[] args) {
        int n,f;
        f = 1;
        n = 10;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        System.out.println(n+"! = "+f);
    }
}
