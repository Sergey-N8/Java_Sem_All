package Java_Sem_All.Home_Work.HW_1;
import java.util.Scanner;
/**
Вывести все простые числа от 1 до 1000
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        String word = sc.nextLine();
        int n = Integer.parseInt(word);
        for (int i = 2; i <= n; i ++) {
            int k = 0;
            for (int j = 1; j <= n; j ++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
