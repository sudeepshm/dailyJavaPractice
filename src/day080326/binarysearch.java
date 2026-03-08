public class binarysearch {

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 9, 12, 18, 21};
        int target = 12;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}