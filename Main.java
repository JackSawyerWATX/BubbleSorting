public class Main {
    public static void main(String[] args) {
        int[] myArray = { 45, 4, 10, 22, 50, 23, 34, 33, 30 };

        System.out.print("The original sequence:-\n    ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
        SortEm(myArray);
    }

    private static void SortEm(int[] ar) {
        int temp;

        for (int i = ar.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        System.out.print("The new sequence:-\n    ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
    }
}