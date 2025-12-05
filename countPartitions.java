// Difference of two numbers is even only if their parity is same (both sums are even or both sums are odd)
// prefix sum
// Parity checks whether a number is even or odd
// if sum % 2 == 0 -> even parity
// if sum % 2 == 1 -> odd parity
// if left sum and right sum has same parity , then we increase count
class Solution {
    public int countPartitions(int[] nums) {
        int count = 0 ;
        int totalSum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            totalSum += nums[i] ;
        }
        int leftSum = 0 ;
        // Since the question does not allow empty subarrays
        for(int i = 0 ; i < nums.length - 1 ; i++){
            leftSum = leftSum + nums[i];
            int rightSum = totalSum - leftSum ;
            if(leftSum % 2 == rightSum % 2){
                count ++ ;
            }
        }
        return count ;
    }
}
