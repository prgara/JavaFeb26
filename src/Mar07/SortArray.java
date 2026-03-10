package Mar07;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,78,2,3,99,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
