import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class sem5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter num and surname:  ");
            String[] name = iScanner.nextLine().split(" ");
            names.put(Integer.parseInt(name[0]), name[1]);
        }
        for (var el : names.entrySet()) {
            if(el.getValue().equals("Ivanov"))
                System.out.print(el.getKey()+ ": " + el.getValue() + "\n" );
        }
        iScanner.close();
    }

    public static Boolean IsIzomorph() {
        Map<Character, Character> pairs = new HashMap<>();
        String s1 = "add";
        String s2 = "egg";
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        } 
    }
}
