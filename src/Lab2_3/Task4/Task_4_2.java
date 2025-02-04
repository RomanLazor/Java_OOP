package Lab2_3.Task4;

public class Task_4_2 {
    public static void main(String[] args) {
        int n,f,i;
        f = 1;
        n = 10;
        i = 1;
        while (i <= n){
            f*=i;
            i++;
        }
        System.out.println(n+"! = "+f);
    }
}
