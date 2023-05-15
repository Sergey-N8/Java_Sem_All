package Java_Sem_All.Home_Work.HW_5;
import java.util.*;

public class Task_2 {
    /*
    Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, 
    Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
    Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
    Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
    которая найдет и выведет повторяющиеся имена с количеством повторений. 
    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
     */
    public static void main(String[] args) {
        Map<String, Integer> listTree1 = new TreeMap<>();

        String line = "Иван Иванов, Светлана Петрова, Кристина Белова,\n" +
        "Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,\n" +
        "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,\n" +
        "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        System.out.println(add(listTree1, line));
        povtorenie(listTree1);
        //System.out.println(valueSort(listTree1));
        System.out.println(popul(listTree1));
    }

    static Map<String, Integer> add(Map<String, Integer> map, String line){
        line = line.replace("\n", " ");
        String[] words = line.split(", ");
        for (String word: words){
            if (map.containsKey(word.split(" ")[0])){
                map.put(word.split(" ")[0], map.get(word.split(" ")[0]) + 1);
            } 
            else {
                map.put(word.split(" ")[0], 1);
            }
        }
        return map;
    }
    
    static void povtorenie(Map<String, Integer> map){
        System.out.println();
        System.out.println("Повторяющиеся значения в списке:");
        for (String i : map.keySet()) {
            if (map.get(i) > 1) {
                System.out.println(i + " = " + map.get(i));
            }
        }   
    }

    // public static <K, V extends Comparable<V>> Map<K, V> valueSort(final Map<K, V> map){
    //     Comparator<K> valueComparator = new Comparator<K>(){
    //         public int compare(K k1, K k2){
    //             int comp = map.get(k1).compareTo(map.get(k2));
    //             if (comp == 0){
    //                 return 1;
    //             }
    //             else{
    //                 return comp;
    //             }
    //         }
    //     };
    //     Map<K, V> sorted = new TreeMap<K, V>( Comparator.reversed());
    //     sorted.putAll(map);
    //     return sorted;
    // }
    static Map<Integer, List<String>> popul(Map<String, Integer> map){
        Map<Integer, List<String>> listTreeResalt = new TreeMap<>(Comparator.reverseOrder());
        for (String i : map.keySet()) {
            if (listTreeResalt.containsKey(map.get(i))){
                List<String> list = listTreeResalt.get(map.get(i));
                list.add(i);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(i);
                listTreeResalt.put(map.get(i), list);
            }
        }
        return listTreeResalt;
    }
}