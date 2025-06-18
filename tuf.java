// Sorting Techniques

// import java.util.*;

// class tuf{
//     public void swap(int[] arr, int i, int j) {
//         int t = arr[i];
//         arr[i] = arr[j];
//         arr[j] = t;
//     }

//     public int[] SelectionSort(int arr[]){
//         for(int i=0 ;i<arr.length-1; i++){
//             int minIdx = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j] < arr[minIdx]){
//                     minIdx =j;
//                 }
//             }
//             swap(arr, i, minIdx);
//         }
//         return arr;
//     }

//     public int[] BubbleSort(int arr[]){
//         int n=arr.length;
//         for(int i = 0; i<n-1; i++){
//             for(int j= 0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]) swap(arr, j, j+1);
//             }
//         }
//         return arr;
//     }

//     public int[] InsertionSort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int temp = arr[i];
//             int j= i-1;
//             while(j>=0 && arr[j] > temp){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = temp;
//         }
//         return arr;
//     }

//     public void mergeSort(int []arr){
//         int n = arr.length;
//         if(n<=1) return;
//         int lla = n/2;
//         int lra = n-lla;
//         int []lA = new int[lla];
//         int [] rA = new int[lra];
//         int j=0;
//         for(int i=0; i<n; i++){
//             if(i<lla) lA[i] = arr[i];
//             else{
//                 rA[j] = arr[i];
//                 j++;
//             }
//         }
//         mergeSort(lA);
//         mergeSort(rA);
//         merge(lA, rA, arr);
//     }
//     public void merge(int lA[], int rA[], int arr[]){
//         int ls = arr.length/2;
//         int rs = arr.length - arr.length/2;
//         int i=0, l=0, r=0;
//         while(l<ls && r<rs){
//             if(lA[l]<rA[r]){
//                 arr[i] = lA[l];
//                 i++;
//                 l++;
//             }
//             else{
//                 arr[i] = rA[r];
//                 i++;
//                 r++;
//             }
//         }
//         while(l<ls){
//             arr[i] = lA[l];
//             i++;
//             l++;
//         }
//         while(r<rs){
//             arr[i] = rA[r];
//             i++;
//             r++;
//         }
//     }

//     public void qS(int arr[], int start, int end){
//         if(start>=end) return;
//         int pivot = partition(arr, start, end);
//         qS(arr, start, pivot-1);
//         qS(arr,pivot+1, end);
//     }
//     public int partition(int arr[], int start, int end){
//         int pivot = arr[end];
//         int i= start-1;
//         for(int j= start; j<end; j++){
//             if(arr[j]<pivot){
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = arr[end];
//         arr[end] = temp;

//         return i;
//     }

//     public static void main(String[] args) {
//         int arr[] = {7,4,3,2,1};
//         tuf sol = new tuf();
//         //sol.SelectionSort(arr);
//         //sol.BubbleSort(arr);
//         //sol.InsertionSort(arr);
//         //sol.mergeSort(arr);
//         sol.qS(arr, 0, arr.length-1);
//         for(int i: arr){
//             System.out.print(i +" ");
//         }
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------

class tuf{
    public static void main(String[] args) {
        
    }
}