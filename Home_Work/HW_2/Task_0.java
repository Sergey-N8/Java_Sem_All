package Java_Sem_All.Home_Work.HW_2;
/**
Посчитайте сколько драгоценных камней в куче обычных камней
Пример:
jewels = “aB”, 
stones = “aaaAbbbB”
Результат в консоль ”a3B1”
 */
public class Task_0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        int stones_num = 0;
        String resultt = "";
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                char v = stones.charAt(j);
                if (c == v){
                    stones_num++;
                }
            }
            resultt = resultt + c + stones_num;
            stones_num = 0;
        }
        System.out.println(resultt);
    }
}

