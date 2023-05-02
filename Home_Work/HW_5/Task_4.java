package Java_Sem_All.Home_Work.HW_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
*Реализовать алгоритм сортировки слиянием
 */
public class Task_4 {
    public static void main(String[] args) {
        int size = 20;
        List<Integer> s = startListCreate(size);
        System.out.println(mergeSort(s));
    }
    public static List<Integer> startListCreate(int size) {
        List<Integer> listRnd = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            listRnd.add(random.nextInt(201) - 100);
        }
        return listRnd;
    }

    public static List<Integer> mergeTwoList(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                c.add(a.get(i));
                i += 1;
            } else {
                c.add(b.get(j));
                j += 1;
            }
        }
        if (i < a.size()) {
            c.addAll(a.subList(i, a.size()));
        }
        if (j < b.size()) {
            c.addAll(b.subList(j, b.size()));
        }
        return c;
    }

    public static List<Integer> mergeSort(List<Integer> s) {
        if (s.size() == 1) {
            return s;
        }
        int middle = s.size() / 2;
        List<Integer> left = mergeSort(s.subList(0, middle));
        List<Integer> right = mergeSort(s.subList(middle, s.size()));
        return mergeTwoList(left, right);
    }
}