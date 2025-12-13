public class ArrayMax {
    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 9};

        int max = arr[0];   // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
}
 
