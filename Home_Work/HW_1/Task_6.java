package Java_Sem_All.Home_Work.HW_1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только 
один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
}
 */
public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите через пробел числа массива: ");
        String word = sc.nextLine();
        String[] words = word.split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        List<String> x = new ArrayList<String>();
        for (String i : wordsList) {
            if (wordsList.indexOf(i) == wordsList.lastIndexOf(i)) {
                x.add(i);
            }
        }
        System.out.println(x);
        sc.close();
    }
}
