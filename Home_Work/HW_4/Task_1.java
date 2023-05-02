package Java_Sem_All.Home_Work.HW_4;
import java.util.*;

public class Task_1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
    “перевернутый” список. Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list_start = new LinkedList<>();
        list_start.add(10);
        list_start.add(2);
        list_start.add(4);
        list_start.add(8);
        list_start.add(9);
        System.out.println("Начальный список " + list_start);
        LinkedList<Integer> list_result = ListRevers(list_start);
        System.out.println("Готовый список " + list_result);
    }
    public static LinkedList<Integer> ListRevers(LinkedList<Integer> list) {
        LinkedList<Integer> result_list = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            result_list.add(iterator.previous());
        }
        return result_list;
        
    }
}