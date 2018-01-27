import java.util.*;
public class Solution {

        public static void main(String[] args) {
                        Scanner scan = new Scanner(System.in);
                        int n = scan.nextInt();
                        for (int i = 0; i < n; i++) {
                                                         int size = scan.nextInt();
                                                         int[] arr = new int[size];
                                                         for (int arr_i = 0; arr_i < size; arr_i++) {
                                                                                     arr[arr_i] = scan.nextInt();
                                                         }
                                                         swapsCount = 0;
                                                         sort(arr);
                                                         System.out.println(swapsCount);
                        }
                        scan.close();
        }

        public static long swapsCount;

        public static void sort(int[] arr) {
                    sort(arr, new int[arr.length], 0, arr.length - 1);
        }

        public static void sort(int[] arr, int[] temp, int left, int right) {
                                                                if (left >= right) return ;
                                                                int middle = (left + right) / 2;
                                                                sort(arr, temp, left, middle);
                                                                sort(arr, temp, middle + 1, right);
                                                                mergesort(arr, temp, left, right);
        }

        public static void mergesort(int[] arr, int[] temp, int left_start, int right_end) {
                                                        int left_end = (left_start + right_end) / 2;
                                                        int right_start = left_end + 1;
                                                        int size = right_end - left_start + 1;

                                                        int left = left_start;
                                                        int right = right_start;
                                                        int tmp = left_start;
            
                                                        while (left <= left_end && right <= right_end) {
                                                            if(arr[left] <= arr[right]) {
                                                                    temp[tmp] = arr[left];
                                                                    left++;
                                                            } 
                                                            else {
                                                                    temp[tmp] = arr[right];
                                                                    swapsCount += right - tmp;
                                                                    right++;
                                                            }
                                                            tmp++;
                                                        }
                                                        System.arraycopy(arr, left, temp, tmp, left_end - left + 1);
                                                        System.arraycopy(arr, right, temp, tmp, right_end - right + 1);
                                                        System.arraycopy(temp, left_start, arr, left_start, size);
        }

}