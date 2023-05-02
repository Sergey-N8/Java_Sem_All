package Java_Sem_All.Home_Work.HW_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// import java.util.HashMap;
/**
Заполнить список названиями планет Солнечной системы в произвольном порядке с 
повторениями. Вывести название каждой планеты и количество его повторений в списке.
 */
public class Task_3 {
    public static void main(String[] args) {
        int size = 30;
        List<String> startList = new ArrayList<>();
        startList.add("Меркурий");
        startList.add("Венера");
        startList.add("Земля");
        startList.add("Марс");
        startList.add("Юпитер");
        startList.add("Сатурн");
        startList.add("Уран");
        startList.add("Нептун");

        List<String> listRnd = randomList(size, startList);
        System.out.println(listRnd);
        List<Object> listRtsult = listRtsultCreate(listRnd);
        listRtsultPrint(listRtsult);
        // HashMap<String, Integer> dect = listRtsultCreate(resultList);
        // System.out.println(dect);
    }

    public static List<String> randomList(int size, List<String> startList) {
        List<String> listRnd = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            listRnd.add(startList.get(random.nextInt(startList.size())));
        }
        return listRnd;
    }

    // public static HashMap<String, Integer> listRtsultCreate(List<String> listRnd){
    //     HashMap<String, Integer> dect = new HashMap<>();
    //     for (String i : listRnd) {
    //         if (!dect.containsKey(i)) {
    //             dect.put(i, 1);
    //         } else {
    //             dect.put(i, dect.get(i) + 1);
    //         }
    //     }
    //     return dect;
    // }
    public static List<Object> listRtsultCreate(List<String> listRnd) {
        List<Object> listRtsult = new ArrayList<Object>();
        for (String i : listRnd) {
            if (!listRtsult.contains(i)) {
                listRtsult.add(i);
                listRtsult.add(1);
            } else {
                listRtsult.set(listRtsult.indexOf(i) + 1, (int)listRtsult.get(listRtsult.indexOf(i) + 1) + 1);
            }
        }
        return listRtsult;
    }
    
    public static void listRtsultPrint(List<Object> listRtsult) {
        for (int i = 0; i < listRtsult.size(); i += 2) {
            System.out.print(listRtsult.get(i) + " = " + listRtsult.get(i + 1) + ", ");
        }
    }
}
