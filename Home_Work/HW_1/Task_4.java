package Java_Sem_All.Home_Work.HW_1;
    /**
* +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть 
заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить 
выражение до верного равенства. Предложить хотя бы одно решение или сообщить, 
что его нет.
 */
public class Task_4 {
    public static void main(String[] args) {
        Integer q = Integer.MAX_VALUE; 
        Integer w = Integer.MAX_VALUE; 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + 5 + j * 10 == 69){
                    q = i;
                    w = j;
                    System.out.println("2" + q + " + " + w + "5 = 69");
                }
            }
        }
        if ((q == Integer.MAX_VALUE) && (q == Integer.MAX_VALUE)){
            System.out.println("Решения нет"); 
        }   
    }
}
