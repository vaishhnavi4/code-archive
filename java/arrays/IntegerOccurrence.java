public class IntegerOccurrence {

    public void occurrence(int arr[], int n) {

        boolean visited[] = new boolean[n];

        for (int i = 0; i < arr.length; ++i) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; ++j) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurred " + count + " times");
        }
    }

    public static void main(String[] args) {

        IntegerOccurrence o = new IntegerOccurrence();

        int[] arr = { 10, 5, 15, 5, 10, 15, 10 };
        int n = arr.length;

        o.occurrence(arr, n);
    }
}

/*
 * You’re given an array of integers, print the number of times each integer has
 * occurred in the array.
 * Example
 * Input :
 * 10
 * 1 2 3 3 4 1 4 5 1 2
 * 
 * Output :
 * 1 occurs 3 times
 * 2 occurs 2 times
 * 3 occurs 2 times
 * 4 occurs 2 times
 * 5 occurs 1 times
 */