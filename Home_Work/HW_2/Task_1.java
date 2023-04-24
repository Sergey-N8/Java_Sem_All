package Java_Sem_All.Home_Work.HW_2;
/**
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.

Пример: s = “cba”, index = [3,2,1] result “abc”
 */
public class Task_1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index_1 = new int[] {3,2,1};
        String resultt = "";
        for (int i = 0; i < index_1.length; i++) {
            char c = s.charAt(index_1[i] - 1);
            resultt = resultt + c;
        }
        System.out.println(resultt);
    }
}

