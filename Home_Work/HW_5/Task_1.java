package Java_Sem_All.Home_Work.HW_5;
import java.util.*;

public class Task_1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 
    человек может иметь несколько телефонов. Нужны методы добавления новой 
    записи в книгу и метод поиска записей в телефонной книге.
    123456 Иванов
    321456 Васильев
    234561 Петрова
    234432 Иванов
    654321 Петрова
    345678 Иванов
     */
    public static void main(String[] args) {
        Map<String, List<String>> listPhones = new HashMap<>();
        addPhone(listPhones, "123456", "Иванов");
        addPhone(listPhones, "321456", "Васильев");
        addPhone(listPhones, "234561", "Петрова");
        addPhone(listPhones, "234432", "Иванов");
        addPhone(listPhones, "654321", "Петрова");
        addPhone(listPhones, "345678", "Иванов");
        System.out.println(listPhones);
        String lineName = "Иванов";
        System.out.println(findName(listPhones, lineName));
        String linePhone = "654321";
        System.out.println(findPhones(listPhones, linePhone));

    }

    static Map<String, List<String>> addPhone(Map<String, List<String>> map, String phone, String name){
        if (map.containsKey(name)){
            List<String> list = map.get(name);
            list.add(phone);
        } 
        else {
            List<String> list = new ArrayList<>();
            list.add(phone);
            map.put(name, list);
        }
        return map;
    }
    static String findName(Map<String, List<String>> map, String lineName){
        String result = map.get(lineName).toString();
        result = result.replace("[", "");
        result = result.replace("]", "");
        return "Все телефоны " + lineName.toString() + ": " + result;
    }

    static String findPhones(Map<String, List<String>> map, String linePhone){
        List<String> list = new ArrayList<>();
        for (String i : map.keySet()) {
            list = map.get(i);
            for (String j : list){
                if (j.contains(linePhone)) {
                    return "Владелец телефона " + linePhone.toString() + ": " + i.toString();
                }
            }
        }
        return "Этого телефона нет в справочнике";
    }
}