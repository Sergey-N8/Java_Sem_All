package Java_Sem_All.Home_Work.HW_4;
import java.util.*;
/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
Используйте итератор
 */
public class Task_3 {
    public static void main(String[] args) {
        int size = 20;
        LinkedList<Integer> list_start = startListCreate(size);
        System.out.println("Начальный список " + list_start);
        Integer summ = SumList(list_start);
        System.out.println("Сумма всех элементов " + summ);
        System.out.println("Наличие элементов в изначальном листе " + list_start);
    }

    public static LinkedList<Integer> startListCreate(int size) {
        LinkedList<Integer> list_start = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list_start.add(random.nextInt(21));
        }
        return list_start;
    }

    public static Integer SumList(LinkedList<Integer> list) {
        Integer summ = 0;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            summ = summ + iterator.previous();
        }
        return summ;
    }
}
