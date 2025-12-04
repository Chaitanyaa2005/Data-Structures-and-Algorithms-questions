// collision can only happen from a moving car(l or r) not from a stationery car
class Solution {
    public int countCollisions(String directions) {
        // lets count no. of moving cars
        int totalLeft = 0 ;
        int totalRight = 0 ;
        for(int i = 0 ; i < directions.length() ; i++){
            if(directions.charAt(i) == 'L'){
                totalLeft++ ;
            }
            if(directions.charAt(i) == 'R'){
                totalRight++ ;
            }
        }
        // Trim safe cars 
        int left = 0 ;
        int countLeft = 0 ;
        // Trim safe left cars
        while(left < directions.length() && directions.charAt(left) == 'L'){
            countLeft ++ ;
            left ++ ;
        }
        int right = directions.length() - 1;
        int countRight = 0 ;
        while(right >= 0 && directions.charAt(right) == 'R'){
            countRight ++ ;
            right -- ;
        }
        // Total collisions = total cars - safe cars
        int L = totalLeft - countLeft ;
        int R = totalRight - countRight ;
        int collisions = L + R ;
        return collisions ;
    }
}