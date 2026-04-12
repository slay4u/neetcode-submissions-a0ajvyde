class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) 
            arr[i] = Arrays.stream(arr, i+1, arr.length).max().getAsInt();
        arr[arr.length-1] = -1;
        return arr;
    }
}