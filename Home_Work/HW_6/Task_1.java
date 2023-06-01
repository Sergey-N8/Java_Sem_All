package Java_Sem_All.Home_Work.HW_6;
import java.util.*;

public class Task_1 {

    public static void main(String[] args) {
        note note1 = new note(4, 128, "linux", "черный");
        note note2 = new note(8, 256, "Windows 10", "серый");
        note note3 = new note(8, 128, "linux", "синий");
        note note4 = new note(16, 256, "Windows 10", "серый");
        note note5 = new note(16, 512, "Windows 11", "черный");
        note note6 = new note(32, 1024, "Windows 10", "красный");
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println(note4);
        System.out.println(note5);
        System.out.println(note6);


        Set<note> notes = new HashSet<>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);

        int maxRam = 32;
        int minRam = 4;
        int maxHdd = 1024;
        int minHdd = 128;

        Set<String> listOS = new HashSet<>();
        Set<String> listColor = new HashSet<>();

        for (note note: notes){
            listOS.add(note.getOS());
            listColor.add(note.getColor());
        }

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите пункт списка:" + 
            "\n1 - ОЗУ (от " + minRam + " до " + maxRam + ")" + 
            "\n2 - Объем ЖД (от " + minHdd + " до " + maxHdd + ")" + 
            "\n3 - Операционная система " + listOS +
            "\n4 - Цвет " + listColor + 
            "\n5 - Показать подходящие модели");

            String word = sc.nextLine();
            if (word.equals("1")){
                minRam = getMINint();
                maxRam = getMAXint();
            }
            if (word.equals("2")){
                minHdd = getMINint();
                maxHdd = getMAXint();
            }
            if (word.equals("3")){
                getListOS(listOS);
            }
            if (word.equals("4")){
                getListColor(listColor);
            }
            if (word.equals("5")){
                System.out.println();
                System.out.println("Подходящая Вам модель:");
                System.out.println(getChose(notes, maxRam, minRam, maxHdd, minHdd, listOS, listColor));
                System.out.println();
            }
        }
    }

    static int getMINint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальное значение: ");
        String word = sc.nextLine();
        int m = Integer.parseInt(word);
        return m;
    }

    static int getMAXint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальное значение: ");
        String word = sc.nextLine();
        int m = Integer.parseInt(word);
        return m;
    }

    static Set<String> getListOS(Set<String> listOS) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете через пробел желаемую OS:" + 
        "\n1 - linux" +
        "\n2 - Windows 10" +
        "\n3 - Windows 11");
        String word = sc.nextLine();
        listOS.clear();
        for (String i : word.split(" ")){
            if (i.equals("1")){
                listOS.add("linux");
            }
            if (i.equals("2")){
                listOS.add("Windows 10");
            }
            if (i.equals("3")){
                listOS.add("Windows 11");
            }
            else{
                System.out.println("Введено неверное значение");
                System.out.println();
            }

        }
        return listOS;
    }

    static Set<String> getListColor(Set<String> listColor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете через пробел желаемую OS:" + 
        "\n1 - черный" +
        "\n2 - серый" +
        "\n3 - синий" +
        "\n4 - красный");
        String word = sc.nextLine();
        listColor.clear();
        for (String i : word.split(" ")){
            if (i.equals("1")){
                listColor.add("черный");
            }
            if (i.equals("2")){
                listColor.add("серый");
            }
            if (i.equals("3")){
                listColor.add("синий");
            }
            if (i.equals("4")){
                listColor.add("красный");
            }
            else{
                System.out.println("Введено неверное значение");
                System.out.println();
            }
        }
        return listColor;
    }

    static Set<note> getChose(Set<note> notes, int maxRam, int minRam, int maxHdd, 
        int minHdd, Set<String> listOS, Set<String> listColor) {
        Set<note> notes_result = new HashSet<>();
        for (note note: notes){
            if (note.getCapacityHDD() <= maxHdd 
            && note.getCapacityHDD() >= minHdd 
            && note.getRAM() <= maxRam 
            && note.getRAM() >= minRam
            && listOS.contains(note.getOS())
            && listColor.contains(note.getColor())) {
                notes_result.add(note);
            }
        }
        return notes_result;
    }
}