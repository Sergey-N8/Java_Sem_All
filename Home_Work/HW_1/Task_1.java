package Java_Sem_All.Home_Work.HW_1;
import java.util.Scanner;
/**
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        String word = sc.nextLine();
        int n = Integer.parseInt(word);
        int summ = 0;
        int product = 1;
        for (int i = 1; i < n; i++) {
            summ = summ + (i * (i + 1)) / 2;
            product = product * (i * (i + 1)) / 2;
        }
        System.out.println("Сумма триугольный чисел до n (не включительно) " + summ);
        System.out.println("Произведение триугольный чисел до n (не включительно) " + product);
        System.out.println("Число n " + (n * (n + 1)) / 2);
        sc.close();
    }
}

