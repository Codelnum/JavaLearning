import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
/* 

public class hw5 {

    public static void main(String[] args) {
        String ch="1";
        Map<String, String> Notebook = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
            while (ch.equals("1") | ch.equals("2")){
                System.out.println("Enter num:\n 1-Find number\n 2-Add person \n Or press any key for exit.");
                ch = scan.nextLine();
                
                if (ch.equals("2")){
                    System.out.println("Enter name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter number: ");
                    String numb = scan.nextLine();
                    if(Notebook.containsKey(name)){
                        numb = Notebook.get(name)+"\n"+numb;
                        Notebook.put(name,numb);
                    System.out.println("Added: " + name + " " + numb);
                    }
                    else
                        Notebook.put(name,numb);
                        System.out.println("Added: " + name + " " + numb);
                }
                else
                    if (ch.equals("1")){
                        System.out.println("Enter name: ");
                        String fName = scan.nextLine();
                            if(Notebook.containsKey(fName)){
                                System.out.print(fName+":"+"\n"+Notebook.get(fName)+"\n");
                            }
                            else
                                System.out.println("Not found");
                    }
                    else
                    System.out.println("Bye!");
            }
        scan.close();
    }       
}
*/
//2) Пусть дан список сотрудников:Иван Иванов и т.д. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
/*
public class hw5 {
    
    public static void main(String[] args) {

        String[] inString = {"Иван Петров", "Иван Иванов", "Иван Сидоров", "Сергей Иванов", "Петр Иванов", "Семен Семенов", "Иван Сменов", "Иван Иванов", "Андрей Ковалев", "Петр Иванов", "Семен Семенов", "Иван Сменов", "Иван Иванов"};
        String[] nameString = {};
        Map<String, Integer> Names = new HashMap<String, Integer>();
        int count=1;
        for (int i = 0; i < inString.length; i++) {
            nameString = inString[i].split(" ");
                if (Names.containsKey(nameString[0])) {                    
                    count = Names.get(nameString[0])+1;
                    Names.put(nameString[0], count);
                }
                else
                count = 1;
                Names.put(nameString[0], count);
        }
    
        System.out.println(Names);
        Map<String, Integer> DualNames = new HashMap<String, Integer>();
        for (var element : Names.entrySet()) {
            if (element.getValue()>1) {
                DualNames.put(element.getKey(), element.getValue());
            }
        }
        
        DualNames.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
*/
// Реализация пирамидальной сортировки на Java
public class hw5 {
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter arr num with space:  ");
        String [] inString = scan.nextLine().split(" ");
        int [] arr = Arrays.stream(inString).mapToInt(Integer::parseInt).toArray();;
        scan.close();

        hw5 ob = new hw5();
        ob.sort(arr);

        System.out.println("Sorted:");
        printArray(arr);
    }

    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            MakeHeap(arr, n, i);
   
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            MakeHeap(arr, i, 0);
        }
    }


    void MakeHeap(int arr[], int n, int i)
    {
        int max = i; 
        int LeftSide = 2*i + 1; 
        int RightSide = 2*i + 2; 

        if (LeftSide < n && arr[LeftSide] > arr[max])
            max = LeftSide;

        if (RightSide < n && arr[RightSide] > arr[max])
            max = RightSide;
        if (max != i)
        {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;

            MakeHeap(arr, n, max);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}