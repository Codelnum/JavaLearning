
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.*;
/*
 * 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации
приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 
Результат:
  "select * from students where “name” = “Ivanov” and “country”=”Russia” …
 * 
*/
/*

public class hw2 {

    public static void main(String[] args) {

        String [] sql = {"\"name\":\"Ivanov\"", "\"country\":\"Russia\"", "\"city\":\"Moscow\"", "\"age\":\"null\""};
        
        Map<String, String> dict = new HashMap<>();
            for (String pair : sql) {
            String[] keyValue = pair.split(":");
            for (int i = 0; i < keyValue.length-1; i++) {
                dict.put(keyValue[i], String.valueOf(keyValue[i+1]));
                }
            } 
        String[] key = dict.keySet().toArray(new String[0]);
        String[] value = dict.values().toArray(new String[0]);
        String res = "select * from students where";
          for (int i = 0; i < dict.size(); i++) {
            if (value[i].equals("\"null\"")==false) {
                res = res + " and ";
                res = res + key[i] + "=" + value[i]; 
            }
            }
        res = res.replaceFirst("and", "");
        System.out.println( res );
    }   
}   

*/



//2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class hw2{
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws SecurityException, IOException {
        
        Logger logger = Logger.getLogger(hw2.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        SimpleFormatter xml = new SimpleFormatter();
        fh.setFormatter(xml);
        logger.info("Writing log");

        System.out.println("Enter nums with space:  ");
        String inStr = scan.nextLine();
        int[] numArr = Arrays.stream(inStr.split(" ")).mapToInt(Integer::parseInt).toArray();
        logger.info("Input Array: "+Arrays.toString(numArr));
        int count = 1;
        while (count != 0) {
            for (int i = 0; i < numArr.length-1; i++) {
                if (numArr[i+1]< numArr[i]){
                    int tmp = numArr[i];
                    numArr[i] = numArr[i+1];
                    numArr[i+1] = tmp;
                    count = count+1;
                    logger.info("Bubble Iterarion "+i+":  --------------------------" +Arrays.toString(numArr));
                }
            }
            count = count-1;     
        }
        logger.info("Output Array: "+Arrays.toString(numArr));
    }
}
