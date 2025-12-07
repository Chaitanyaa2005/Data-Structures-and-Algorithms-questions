class Solution {
    public int countOdds(int low, int high) {
       // Mathematical approach :
       // since low is inclusive 
       int count = (high + 1)/2 - (low)/2 ;
       return count ;
    }
}