package Java_Sem_All.Home_Work.HW_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class note {
    /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля 
    и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий 
    (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии 
    фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую 
    необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить 
    параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие 
    по условиям.

    Работу сдать как обычно ссылкой на гит репозиторий

    P.S. Частые ошибки смотри в конце семинара
    */
    private int RAM;
    private int capacityHDD;
    private String OS;
    private String color;
    private List<String> healthHistory;

    public note(int RAM, int capacityHDD, String OS, String color) {
        this.RAM = RAM;
        this.capacityHDD = capacityHDD;
        this.OS = OS;
        this.color = color;
        //healthHistory = new ArrayList<>();
    }

    public void addInHistory(String message){
        healthHistory.add(message);
    }

    public int getRAM() {
        return RAM;
    }

    public int getCapacityHDD() {
        return capacityHDD;
    }

    public String getColor() {
        return color;
    }

    public String getOS() {
        return OS;
    }
    @Override
    public String toString() {
        return "RAM: " + RAM + ", capacityHDD: " + capacityHDD + ", OS: " + OS + ", color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof note)){
            return false;
        }
        note note = (note)obj;
        return RAM == note.RAM && capacityHDD == note.capacityHDD && OS.equals(note.OS) && color.equals(note.color);
    }

    @Override
    public int hashCode() {
        return 5 * RAM + 7 * capacityHDD + 11 * OS.hashCode() + 17 * color.hashCode();
    }
}