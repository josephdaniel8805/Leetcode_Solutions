class Solution {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        if(bits.size()==1) return true;
        int first=0,second=1;
        while(second<bits.size()){
            if(bits[first]==1 && bits[second]==1){
                first+=2;
                second+=2;
            }else if(bits[first]==1 && bits[second]==0){
                first+=2;
                second+=2;
            }else{
                first+=1;
                second+=1;
            }
        }
        if(first<bits.size()){
            if(bits[first]==0){
                return true;
            }
        }
        return false;
    }
};