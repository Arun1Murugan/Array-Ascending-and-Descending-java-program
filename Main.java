import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("<<<--- ARRAY ASCENDING & DESCENDING PROJECT --->>>");
        System.out.println("What is your wish Ascending or Descending or Both Ascend & descend.\n" +
                "KEYS : \n 1) type 1 to continue Ascending order. \n 2) type 2 to continue Descending order.\n" +
                " 3) type any Integer to continue Both ascending and descending orders.");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("How many elements do you need to get in Ascending order,\n" +
                    "Enter a Integer below. \r");
            int n = scanner.nextInt(); // this integer for How many elements do you need to be (its array element count).
            int [] myIntArray = getArrayElement(n);
            int [] sorted = sortingArrayInAscendingOrder(myIntArray);
            System.out.println(" >>> Ascending order :");
            printArray(sorted);
        }else if(choice == 2){
            System.out.println("How many elements do you need to get in Descending order,\n" +
                    "Enter a Integer below. \r");
            int n = scanner.nextInt(); // this integer for How many elements do you need to be (its array element count).
            int [] myIntArray = getArrayElement(n);
            int [] sorted = sortingArrayInDescendingOrder(myIntArray);
            System.out.println(" >>> Descending order :");
            printArray(sorted);
        }else{
            System.out.println("How many elements do you need to get in Both Ascending & Descending order,\n" +
                    "Enter a Integer below. \r");
            int n = scanner.nextInt(); // this integer for How many elements do you need to be (its array element count).
            int [] myIntArray = getArrayElement(n);
            int [] sortedAscend = sortingArrayInAscendingOrder(myIntArray);
            int [] sortedDescend = sortingArrayInDescendingOrder(myIntArray);
            System.out.println(" >>> Ascending order :");
            printArray(sortedAscend);
            System.out.println(" >>> Descending order :");
            printArray(sortedDescend);
        }
    }
    public  static int [] getArrayElement(int number){ // this method for get array elements.
        int [] array = new int[number];
        System.out.println("Enter " + number + " Integers below. \r");
        for(int i = 0; i < array.length; i++){
            array [i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Index ---> " + i + " Element ---> " + array[i]);
        }
    }
    public static int [] sortingArrayInDescendingOrder(int [] array){
        int [] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){ // this ForLoop used to copying elements from array to sortedArray.
            sortedArray [i] = array[i];        // Another way of copy one array to another array is
        }                                      //
        int temp;
        boolean signal = true;
        while (signal){
            signal = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    signal = true; // we are giving signal for WhileLoop while condition is true.
                }
            }
        }
        return sortedArray;
    }
    public static int [] sortingArrayInAscendingOrder(int [] array){
        int [] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){ // this ForLoop used to copying elements from array to sortedArray.
            sortedArray [i] = array[i];        // Another way of copy one array to another array is
        }                                      //int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean signal = true;
        while (signal){
            signal = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    signal = true; // we are giving signal for WhileLoop while condition is true.
                }
            }
        }
        return sortedArray;
    }
}