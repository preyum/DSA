package arrays;

import java.util.Arrays;
import java.util.Random;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            num[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(num));

        quickSort(num);

        System.out.println("\n" + Arrays.toString(num));
    }
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    private static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start >= end) return;
        int i = start; //left pointer
        int j = end; //right pointer
//        int mid = (start + end)/2;
        int pivot = arr[end];
        while(i < j){
            while(i < j && arr[i] <= pivot) i++;
            while(j > i && arr[j] >= pivot) j--;
            swap(arr, i, j);
        }
        swap(arr, i, end);

        quickSort(arr, start, i-1);
        quickSort(arr, i+1, end);
    }

}