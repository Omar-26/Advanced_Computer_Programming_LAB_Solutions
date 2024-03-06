// 5)

import java.util.Scanner;

public class SumOfArray {
    final static int MAX_ARRAY_SIZE = 1000;

    int arraySummer(int[] intArray) {
        int sum = 0;
        for (int i : intArray) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = new int[MAX_ARRAY_SIZE];
        Scanner sizeInput = new Scanner(System.in);
        int arraySize = sizeInput.nextInt();
        for (int i = 0; i < arraySize; i++) {
            Scanner arrayInput = new Scanner(System.in);
            int arrayElement = arrayInput.nextInt();
            intArray[i] = arrayElement;
        }
        SumOfArray array = new SumOfArray();
        System.out.println("sum: " + array.arraySummer(intArray));
    }
}
