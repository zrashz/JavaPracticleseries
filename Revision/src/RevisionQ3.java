public class RevisionQ3 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5};
        int max = arr[0];
        int min=arr[0];// Assume the first element is the largest initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

            System.out.println("The largest value in the array is: " + max);
        System.out.println("The smallest value in the array is: " + min);

        }
    }




