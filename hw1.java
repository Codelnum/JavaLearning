import java.util.ArrayList;
import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 
Вывести все простые числа от 1 до 1000

Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)

*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 24 45 //24 + 45 = 69 (n=2)
 */
/* 
public class hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.scan);
        System.out.println("Input num: ");
        int num = scan.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 0; i <=num; i++) {
            sum = i+sum;
        }
        for (int i = 1; i <= num; i++) {
            mult = mult*i;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Mult =" + mult);
        scan.close();
    }   

}

*/
/*
public class hw1 {


public static void main(String[] args) {
    Scanner scan = new Scanner(System.scan);
    System.out.println("Enter num(1000): ");
    int num = scan.nextInt();
    scan.close();
    ArrayList <Integer> simple = new ArrayList<>();

    for (int i = 2; i <=num; i++) {
        int x = 1;
        for (int j = 2; j <= i-1; j++) {
            if (i%j==0) {
                x = x*0;
            }
        }
        if (x==1) {
            simple.add(i);
        }
    }
    System.out.println(simple);
}
}

*/

public class hw1 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // String answer = Asker();
        while (true) {
            String answer = Asker();
            if (answer.equals("yes")) {
                EnterNums();
            } else {
                System.out.println("Bye!");
                break;
            }
            
            
        }
    }
    public static void EnterNums() {
        
        System.out.println("Enter first num: ");
        double num1 = scan.nextDouble();
        System.out.println("Set operation(+ , - , * , / ): ");
        char op = scan.next().charAt(0);
        System.out.println("Enter second num: ");
        double num2 = scan.nextDouble();
        double sum = Calc(num1, num2, op);
        System.out.println(sum);    
    }
    
    public static String Asker() {
        System.out.println("One more calc?(yes/no): ");
        String answ = scan.nextLine();
        return answ;
    }
        
    
        public static Double Calc(double num1, double num2, char op) {
        double sum = 0;
        switch(op) {
            case '+': sum = num1 + num2;
               break;
            case '-': sum = num1 - num2;
               break;
            case '*': sum = num1 * num2;
               break;
            case '/': sum = num1 / num2;
               break;
            default:  System.out.printf("Error! Enter correct operator");
        }
        return sum;
    
    }
}
    