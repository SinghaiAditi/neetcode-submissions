class Solution {
    public int[] replaceElements(int[] arr) {
        
        int len = arr.length;
        int maxVal = arr[len-1];
        arr[len-1] = -1;

        for(int i = len-2; i >=0; i--) {
            int curr = arr[i];
            arr[i] = maxVal;
            if(maxVal < curr) {
                maxVal = curr;
            }
        }

        return arr;
    }
}