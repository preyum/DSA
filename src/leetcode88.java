public class leetcode88 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 10};
        int[] k = merge(arr1, arr1.length, arr2, arr2.length);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0, b = 0;
        int[] result = new int[m+n];
        for (int i = 0; i < m + n; i++) {
            if(a >= m){
               result[i] = nums2[b++];
            } else if (b >= n) {
                result[i] = nums1[a++];
            } else {
                result[i] = nums1[a] > nums2[b] ? nums2[b++] : nums1[a++];
            }
        }
        return result;
    }
}