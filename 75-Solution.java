class Solution {
    public void sortColors(int[] arr){
        int zero=0,one=0,two=arr.length-1;
        while(one<=two){
            if(arr[one]==1){
                one++;
            }else if(arr[one]==0){
                int temp=arr[one];
                arr[one]=arr[zero];
                arr[zero]=temp;
                one++;
                zero++;
            }else{
                int temp=arr[one];
                arr[one]=arr[two];
                arr[two]=temp;
                two--;
            }
        }
    }
}