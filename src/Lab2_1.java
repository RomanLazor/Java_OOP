public class Lab2_1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int a = 15;
        int b = 6;

        int solve_1 = a / b;
        int solve_2 = a % b;
        System.out.println(solve_1);
        System.out.println(solve_2);


        System.out.println("Task 2");
        int c = 89;

        int solve_3 = c / 10;
        int solve_4 = c % 10;

        int sum = solve_3 + solve_4;
        System.out.println(sum);

        System.out.println("Task 3");
        double d = 88.7;

        int solve_5 = (int) (d + 0.5);
        System.out.println(solve_5);
    }
}
