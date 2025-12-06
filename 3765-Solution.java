import java.util.*;
class Solution {
    public boolean completePrime(int num) {        
        ArrayList<Integer> arr= new ArrayList<>();
        if(num<=1) return false;
        if(isPrime(num)){
            if(num<10){
                return true;
            }
        }else{
            return false;
        }
        
        int div=10;
        while(div<num){
            arr.add((num%div));
            div*=10;
        }
        div=10;
        while(div<num){
            arr.add((num/div));
            div*=10;
        }System.out.println(arr);
        int count=0;
        for(int n : arr){
            if(isPrime(n)){
                count++;
            }
        }
        return count==arr.size();
    }
    private static boolean isPrime(int n){
        if(n<=1) return false;
        for(int ind=2;ind*ind<=n;ind++){
            if(n%ind==0){
                return false;
            }
        }
        return true;
    }
}