package arrays;

import java.util.Arrays;

public class leetcode88 {
    public static void main(String[] args) {
        int[] arr1 = {4, 0, 0, 0, 0, 0};
        int[] arr2 = {1, 2, 3, 5, 6};
        merge(arr1, 1, arr2, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
//    optimal solution:
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1;
        int z = nums2.length - 1;
        for(int i = nums1.length - 1; i >= 0; i--){
            if( k >= 0  && z >= 0) {
                nums1[i] = nums1[k] > nums2[z] ? nums1[k--] : nums2[z--];
                continue;
            }
            nums1[i] = k < 0 ? nums2[z--] : nums1[k--];
        }
    }
}




//    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        int a = 0, b = 0;
//        int[] result = new int[m+n];
//        for (int i = 0; i < m + n; i++) {
//            if(a >= m){
//               result[i] = nums2[b++];
//            } else if (b >= n) {
//                result[i] = nums1[a++];
//            } else {
//                result[i] = nums1[a] > nums2[b] ? nums2[b++] : nums1[a++];
//            }
//        }
//        return result;
//    }


////    PS: DIDNT WORK
////    nums1 is of length m+n, need to make nums1 as the result:
//
//    static void merge(int[] nums1, int m, int[] nums2, int n) {
//        // handling edge cases
//        if(m == 0){
//            for(int i = 0; i < nums2.length; i++) nums1[i] = nums2[i];
//            return;
//        }
//        if(n == 0) return;
////        copying the elements from nums2 to nums1 in the blank spaces
//        int k = 0;
//        for (int i = m; i < nums1.length; i++) {
//            nums1[i] = nums2[k++];
//        }
//        System.out.println(Arrays.toString(nums1));
////        now the array will get sorted
//        k = m;
//        for (int i = 0; i < m; i++) {
//            System.out.println("i: "+i+"  nums[i]: "+nums1[i]+"    nums1[k]: "+nums1[k]);
//            if(nums1[i] > nums1[k] ){
////                swap
//                int temp = nums1[i];
//                nums1[i] = nums1[k];
//                nums1[k] = temp;
//                k++;
//            }
//        }
//    }