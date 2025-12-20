import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q3 = new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int ind=0;ind<n;ind++){
            if(nums[ind]%3==1){
                q1.add(nums[ind]);
            }else if(nums[ind]%3==2){
                q2.add(nums[ind]);
            }else{
                q3.add(nums[ind]);
            }
        }
        if(q1.size()>0 && q2.size()>0 && q3.size()>0){
            ans=q1.peek()+q2.peek()+q3.peek();
        }
        if(q1.size()>2){
            int num1=q1.poll(),num2=q1.poll(),num3=q1.poll();
            int sum=num1+num2+num3;
            ans=(ans<sum)?sum:ans;
        }
        if(q2.size()>2){
            int num1=q2.poll(),num2=q2.poll(),num3=q2.poll();
            int sum=num1+num2+num3;
            ans=(ans<sum)?sum:ans;
        }
        if(q3.size()>2){
            int num1=q3.poll(),num2=q3.poll(),num3=q3.poll();
            int sum=num1+num2+num3;
            ans=(ans<sum)?sum:ans;
        }
        return ans;
    }
}