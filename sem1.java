/*
import java.time.LocalTime;
import java.util.Scanner;

public class sem1 {
public static void main(String[] args) {
    String encoding = System.getProperty("console.encoding","cp866");
    Scanner iScanner = new Scanner(System.in, encoding);
    String name = iScanner.nextLine();
    Print(name);
    iScanner.close();
}
    public static void Print (String name) {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
        System.out.println("Good Morning" +", "+ name);
        if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17,59)))
        System.out.println("Good day" + ", " + name);
        if (now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59)))
        System.out.println("Good Evening" + ", " + name);
        if (now.isAfter(LocalTime.of(23,0)) && now.isBefore(LocalTime.of(4,59)))
        System.out.println("Good Night" + ", " + name);
    }
}
*/

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
Найти максимальное количество подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом)
 */


/**
 * sem1
 */

public class sem1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        FillMas(arr);
        PrintMas(arr);
        FindMaxCount(arr);       
    }


    public static void FillMas(int [] arr) {
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()*2);
        }
    }

    public static void PrintMas(int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void FindMaxCount(int [] arr) {
        int counter = 1 ;
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] && arr[i] == 1){
                counter ++;
                if (counter> result) result=counter;
            }else
            counter =1;
        }
        System.out.println(result);
    }
}