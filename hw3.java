import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Реализовать алгоритм сортировки слиянием===========================================================

// public class hw3 {

//     public static int[] mergeSort(int[] inputArr) {
//         int[] arr1 = Arrays.copyOf(inputArr, inputArr.length);
//         int[] arr2 = new int[inputArr.length];
//         int[] resArr = mergeArrays(arr1, arr2, 0, inputArr.length);
//         return resArr;
//     }

//     public static int[] mergeArrays(int[] arr1, int[] arr2, int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return arr1;
//         }

//         int halfIndex = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergeArrays(arr1, arr2, startIndex, halfIndex);
//         int[] sorted2 = mergeArrays(arr1, arr2, halfIndex, endIndex);

//         int index1 = startIndex;
//         int index2 = halfIndex;
//         int resArrIndex = startIndex;
//         int[] resArr = sorted1 == arr1 ? arr2 : arr1;
//         while (index1 < halfIndex && index2 < endIndex) {
//             resArr[resArrIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++] : sorted2[index2++];
//         }
//         while (index1 < halfIndex) {
//             resArr[resArrIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             resArr[resArrIndex++] = sorted2[index2++];
//         }
//         return resArr;
//     }

//     public static Scanner scan = new Scanner(System.in);


//     public static int[] getArray() {
//         Random random = new Random ();
//         System.out.println("Enter arr length:  ");
//         int length = scan.nextInt();
//         int[] newArr = new int[length];
//         for (int i = 0; i < newArr.length; i++) {
//             int rand = random.nextInt(100);
//             newArr[i] = rand;
//         }
//     return newArr;
//     }

//     public static void main(String args[]) {
        
//         int[] inputArr = getArray();
//         System.out.println(Arrays.toString(inputArr));
//         int[] resArr = mergeSort(inputArr);
//         System.out.println(Arrays.toString(resArr));
//     }
// }

//Пусть дан произвольный список целых чисел, удалить из него четные числа==================================

// public class hw3 {
//     public static Scanner scan = new Scanner(System.in);

//     public static List<Integer> getList(int length) {
//         Random random = new Random ();
//         List<Integer> newArr = new ArrayList<>();
//         for (int i = 0; i < length; i++) {
//             int rand = random.nextInt(100);
//             newArr.add(rand);
//         }
//     return newArr;
//     }
    
//     public static List<Integer> oddList(List<Integer> newArr, int length) {
//         List<Integer> fullArr = getList(length);
//         List<Integer> oddList = new ArrayList<>();
//         for (int i = 0; i < fullArr.size(); i++) {
//             if(fullArr.get(i) %2!=0){
//                 oddList.add(fullArr.get(i));
//             }
//         }
//         return oddList;
//     }


//    public static void main(String[] args) {

//     System.out.println("Enter list length:  ");
//     int length = scan.nextInt();
//     List<Integer> newArr = getList(length);
//     System.out.println(newArr);
//     System.out.println(oddList(newArr, length));
//    }

// }

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка.=============================================

public class hw3 {
    public static Scanner scan = new Scanner(System.in);


public static void main(String[] args) {
    System.out.println("Enter arr length:  ");
    int length = scan.nextInt();
    Random random = new Random ();
    List<Integer> firstList = new ArrayList<>(length);
    int sum =0;
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(100);
            sum = sum+rand; 
            firstList.add(rand);
        }
    double Average = (double)sum/length;
    System.out.println(firstList);

    int min = firstList.get(0);
    int max = firstList.get(0);
        for (int i = 0; i < firstList.size()-1; i++) {   //5
            if(firstList.get(i+1) < min){
                min = firstList.get(i+1);
            }
            else{
                if(firstList.get(i+1)>max){
                    max = firstList.get(i+1);
                }
            }
        }
    System.out.println((String.format("min: %s  max: %s  sum: %s", min, max, Average)));
}
}



