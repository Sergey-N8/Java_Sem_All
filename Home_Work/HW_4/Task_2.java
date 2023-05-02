package Java_Sem_All.Home_Work.HW_4;

public class Task_2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами: 
    enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый 
    элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, 
    не удаляя.
     */
    public static void main(String[] args) {
        ex4();
    }

    static void ex4(){
        NStack stack = new NStack();
        stack.enqueue(10);
        stack.enqueue(3);
        stack.enqueue(7);
        System.out.println(stack.first());
        System.out.println(stack.dequeue());
        System.out.println(stack.first());
    }   
}
