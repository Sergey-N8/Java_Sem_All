package Java_Sem_All.Home_Work.HW_1;
import java.util.Scanner;
/**
Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить
.
.
.
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String word = sc.nextLine();
        int x = Integer.parseInt(word);
        System.out.println("Введите второе число: ");
        String word_1 = sc.nextLine();
        int y = Integer.parseInt(word_1);
        System.out.println("Выберите операцию: " + "\n1 - сложить" 
        + "\n2 - умножить" + "\n3 - отнять" + "\n4 - разделить");
        String word_2 = sc.nextLine();
        int eval_1 = Integer.parseInt(word_2);
        if (eval_1 == 1) {
            System.out.println(x + y);
        }
        if (eval_1 == 2) {
            System.out.println(x * y);
        }
        if (eval_1 == 3) {
            System.out.println(x - y);
        }
        if (eval_1 == 4) {
            Double q = Double.parseDouble(word);
            Double r = Double.parseDouble(word_1);
            System.out.println(q / r);
        }
        sc.close();
    }
}

