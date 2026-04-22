public class Practice06_ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Orijinal array:");
        printArray(arr);

        // Yöntem 1: Yeni array'e koyarak tersine çevirme
        int[] reversedArr = reverseWithNewArray(arr);
        System.out.println("\nYeni array ile tersine çevrilmiş:");
        printArray(reversedArr);

        // Yöntem 2: In-place swap ile tersine çevirme
        reverseInPlace(arr);
        System.out.println("\nIn-place swap ile tersine çevrilmiş:");
        printArray(arr);
    }

    // Yeni array oluşturarak tersine çevirme
    public static int[] reverseWithNewArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // In-place swap ile tersine çevirme
    public static void reverseInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Elemanları swap et
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Array'i yazdırma metodu
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}