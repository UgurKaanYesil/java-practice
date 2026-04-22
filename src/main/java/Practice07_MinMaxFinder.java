public class Practice07_MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 89, 12, 67, 34, 91, 5, 78, 56};

        System.out.println("Array elemanları:");
        printArray(numbers);

        // Yöntem 1: Manuel karşılaştırma
        findMinMaxManual(numbers);

        // Yöntem 2: Math.min / Math.max kullanarak
        findMinMaxWithMath(numbers);
    }

    // Manuel karşılaştırma ile min-max bulma
    public static void findMinMaxManual(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nManuel karşılaştırma ile:");
        System.out.println("En küçük: " + min);
        System.out.println("En büyük: " + max);
    }

    // Math.min / Math.max ile min-max bulma
    public static void findMinMaxWithMath(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("\nMath.min/max ile:");
        System.out.println("En küçük: " + min);
        System.out.println("En büyük: " + max);
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