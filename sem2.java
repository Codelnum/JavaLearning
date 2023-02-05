import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/* 
 * Дано целое число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
N=5
c1=”Oleg”
c2=”Vasya”
res = “OlegVasyaOlegVasyaOleg”
*/
/*
public class sem2 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String c1 = "Hu";
        String c2 = "Yova";
        String res ="";
       System.out.println("введите четное число:  ");
       int num = scan.nextInt();
        for (int i = 1; i < num+1; i++) {
            res = (i%2!=0) ?res+c1:res+c2;
        }
        System.out.println(res);   
        scan.close(); 
    }
}
*/
/*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcddad.
Выход abcd
charAt(i) и indefOf(s) => не найден -1
*/
/* 
public class sem2{
    public static Scanner scan = new Scanner(System.in);     
    
    public static void main(String[] args) {
        System.out.println("enter char string:   ");
        String name = scan.nextLine();
        System.out.println(checkstring(name));
    }

    public static String checkstring(String name) {
        String res = "";
        for (int i = 0; i < name.length(); i++) {
            if (res.indexOf(name.charAt(i))==-1) {
                res=res+name.charAt(i);
            }
        }
        return res;
    }
}
*/
/*
 * Напишите метод, который принимает на вход строку (StringBulder) и определяет является ли строка палиндромом (возвращает boolean значение).
equals и StringBulder для revers
 */
/*
 public class sem2 {

    public static Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter string:");
        String inString = scan.nextLine();
        System.out.println(IsPalindrom(inString));
    }
    public static Boolean IsPalindrom(String name) {
        StringBuilder revName = new StringBuilder(name).reverse();
        return name.equals(revName.toString());
    }
 }
 */
/*
public class sem2 {
    
public static void main(String[] args) {
    String name = "TEST";
    String res = "";
    for (int i = 0; i < 100; i++) {
        res=res+name;
    }
    try {
        FileWriter fw = new FileWriter ("sem2File.txt");
        fw.write(res);
        fw.close();       
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
        
    }
}    
}
*/
/*
 * Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
Напишите метод, который выведет массив, возвращенный предыдущим
методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
 */

public class sem2 {

    public static void main(String[] args) {
        
        ParseDir("C://Users/mvpug/OneDrive/Рабочий стол/Geek Brains/");
    }

    public static void ParseDir(String directory) {
        File dir = new File(directory);
        if (dir.isDirectory()){
            for(File item: dir.listFiles()){

                if (item.isDirectory()){
                    System.out.println(item.getName()+ "\t folder -----------------------------" );
                    String newDir = item.getAbsolutePath();
                    ParseDir(newDir);    
                }
                else{
                    System.out.println(item.getName()+ "\t file");
                }
            }
        }
        
    }
}