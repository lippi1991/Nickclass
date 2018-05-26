/**
 * Created by User on 5/26/2018.
 */
public class Nick {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int a = 2;
        int b = 3;
        System.out.println("Task 1 result=" + Task1(a, b));
        System.out.println("Task 2");
        int a1 = 3;
        Task2(a1);

    }

    public static int Task1(int a, int b) {
        if (a % 2 == 0) {
            int S = a * b / 2;
            return S;
        } else {
            int S1 = a * b;
            return S1;
        }

    }

    public static void Task2(int a) {
        if (a >= 0 && a < 10) {
            System.out.println("Промежуток1");
        } else {
            if (a >= 10 && a < 100) {
                System.out.println("Промежуток2");
            } else {
                if (a >= 100 && a < 1000) {
                    System.out.println("Промежуток3");
                } else {
                    System.out.println("Не попадает");
                }


            }
        }
    }
}