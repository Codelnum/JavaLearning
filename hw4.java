import java.nio.file.attribute.FileAttribute;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список


// public class hw4 {

//     public static void main(String[] args) {
//         List<String> fList = new LinkedList<>(); //везде начинают примеры с пустого листа. Какой синтаксис у уже существующего?
//         fList.add("A");
//         fList.add("B");
//         fList.add("C");
//         fList.add("D");
//         List<String> sList = new LinkedList<String>();
//         for (int i = fList.size(); i >0 ; i--) {
//             sList.add(((LinkedList<String>) fList).getLast());
//             ((LinkedList<String>) fList).removeLast();
//         }
//         System.out.println(sList);
//     }
// }

//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class hw4 {

    public static void main(String[] args) {
        Queue fQueue = new LinkedList();
        fQueue.add("first");        //добавляет в конец
        fQueue.add("second");
        fQueue.add("third");
        fQueue.add("last");
        for (int i = fQueue.size(); i > 0; i--) {
            Object item = fQueue.peek(); // возвращает первый не удаляя
            System.out.println(item); 
            fQueue.remove();            //удаляет первый элемент
        }


    }
}