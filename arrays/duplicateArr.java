// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int countZeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZeros++;
            }
        }

        int i = n - 1;
        int j = n + countZeros - 1;

        while (i >= 0) {
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            if (j < n) {
                arr[j] = arr[i];
            }
            i--;
            j--;
        }
    }
}