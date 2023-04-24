package Java_Sem_All.Home_Work.HW_2;
import java.util.Scanner;
import java.util.ArrayList;
/**
На первой строке записывается натуральное число n - количество строчек в книге. 
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество 
продуктов, на которые у человека аллергия. Потом вводится m строк - вида 
"продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и 
продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой 
продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются 
изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует 
заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. 
Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. 
Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stroki_list = new ArrayList<String>();
        ArrayList<String> slova_list = new ArrayList<String>();
        ArrayList<String> result_list = new ArrayList<String>();
        int n1 = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n1; i++) {
            stroki_list.add(input.nextLine());
        }
        int n2 = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n2; i++) {
            slova_list.add(input.nextLine());
        }
        for (int i = 0; i < stroki_list.size(); i++) {
            result_list.add("");
            String[] words = stroki_list.get(i).split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int x = 0; x < slova_list.size(); x++) {
                    String[] slova = slova_list.get(x).split(" ");
                    if (slova[0].equals(words[j].toLowerCase())) {
                        if (result_list.get(i).equals("")) {
                            result_list.set(i, slova[1]);
                        } else {
                            result_list.set(i, result_list.get(i) + " " + slova[1]);
                        }
                        break;
                    } else {
                        if (result_list.get(i).equals("")) {
                            result_list.set(i, words[j]);
                        } else {
                            result_list.set(i, result_list.get(i) + " " + words[j]);
                        }
                    }
                }
            }
        }
        System.out.println(result_list);
        input.close();
    }
}