class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pref[]= new int[n+1];
        int suff[]= new int[n+1];
        int min=n;
        for(int i=1,j=n-1;i<=n;i++,j--){
            if(customers.charAt(i-1)=='N'){
                pref[i]+=pref[i-1]+1;
            }else{
                pref[i]+=pref[i-1];
            }
            if(customers.charAt(j)=='Y'){
                suff[j]+=(suff[j+1]+1);
            }else{
                suff[j]+=suff[j+1];
            }
        }
        int ans=0;
        for(int ind=0;ind<=n;ind++){
            if(min>(pref[ind]+suff[ind])){
                ans=ind;
                min=(pref[ind]+suff[ind]);
            }
        }
        return ans;
    }
}