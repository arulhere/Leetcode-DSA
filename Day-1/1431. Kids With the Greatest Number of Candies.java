class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int candy:candies){
            max=Math.max(candy,max);
        }

        List<Boolean> arr = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            arr.add(candies[i]+extraCandies>=max);

        }
        return arr;
        
    }
}