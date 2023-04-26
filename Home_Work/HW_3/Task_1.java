package Java_Sem_All.Home_Work.HW_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_1 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {
        System.out.println(start_list_create());
        System.out.println(result_list_create(start_list_create()));
    }

    static List<Integer> start_list_create(){
        int size = 10;
        Random rand = new Random();
        List<Integer> start_list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            start_list.add(rand.nextInt(11));
        }
        return start_list;
    }

    static List<Integer> result_list_create(List<Integer> start_list){
        List<Integer> result_list = new ArrayList<>();
        for (int i : start_list) {
            if (i % 2 != 0) {
                result_list.add(i);
            }
        }
        return result_list;
    }
}