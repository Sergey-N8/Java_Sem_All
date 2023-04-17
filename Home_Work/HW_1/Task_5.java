package Java_Sem_All.Home_Work.HW_1;
import java.util.Scanner;
/**
Task_6
Вводится массив (сначала количество элементов, потом сами элементы). Найдите 
сумму его элементов с чётными индексами и выведите её. А потом выведите числа, 
которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
}
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        String word = sc.nextLine();
        int size = Integer.parseInt(word);
        int[] nambers = new int[size];
        int count = 0;
        int summ_1 = 0;
        for (int index = 0; index < size; index++) {
            System.out.println("Введите элемент массива: ");
            String word_1 = sc.nextLine();
            int i = Integer.parseInt(word_1);
            nambers[index] = i;
                if (index % 2 != 0){
                    count++;
                    summ_1 = summ_1 + nambers[index];
                }
        }
        System.out.println(summ_1);
        int[] chet_nambers = new int[count];
        int count_2 = 1;
        for (int index = 0; index < count; index++) {
            chet_nambers[index] = nambers[count_2];
            count_2 = count_2 + 2;
            System.out.println(chet_nambers[index]);
        }
        sc.close();
    }
}