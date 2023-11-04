public class binarysearch {
    public static void main(String[] args) {
        int[] array = {-5, -2, -1, 0, 5, 6, 9, 18, 25, 36, 45, 69};
        int tar = 25;
        int ans = binarySearch(array, tar);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //finding middle element
            if (target < arr[mid]) {
                end = mid - 1;
        else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    //answer found
                    return mid;
                }
                return -1;
            }
        }
    }
}