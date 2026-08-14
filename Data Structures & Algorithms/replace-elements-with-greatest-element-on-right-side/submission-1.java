class Solution {
    public int[] replaceElements(int[] arr) {
        int currentMax = -1;
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] >currentMax){
                int temp = arr[i];
                arr[i] = currentMax;
                currentMax = temp;
            }
            else if(arr[i] <currentMax){
                arr[i] = currentMax;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}