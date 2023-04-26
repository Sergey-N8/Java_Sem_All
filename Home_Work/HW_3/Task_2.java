package Java_Sem_All.Home_Work.HW_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task_2 {
    /*
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
    арифметическое из этого списка. Collections.max()
     */
    public static void main(String[] args) {
        int size = 20;
        List<Integer> list_1 = startListCreate(size);
        System.out.println(list_1);
        List<String> listRes = result(list_1);
        System.out.println(listRes);
    }

    public static List<Integer> startListCreate(int size) {
        List<Integer> list_1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list_1.add(random.nextInt(21));
        }
        return list_1;
    }

    public static List<String> result(List<Integer> list_1) {
        List<String> listRes = new ArrayList<>();
        listRes.add(Integer.toString(Collections.max(list_1)));
        listRes.add(Integer.toString(Collections.min(list_1)));
        listRes.add(Double.toString( list_1.stream().mapToInt(Integer::intValue)
        .average().orElse(0)));
        return listRes;
    }
}
