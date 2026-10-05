class Solution {
    private boolean isNonDecreasing(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<arr.get(i-1)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums) arr.add(num);
        int count=0;
        while(!(isNonDecreasing(arr))){
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr.size()-1;i++){
            if((arr.get(i)+arr.get(i+1))<min){
                min=arr.get(i)+arr.get(i+1);
                index=i;
            }
        }
        arr.remove(index);
        arr.remove(index);
        arr.add(index,min);
        count++;
        }
        return count;
    }
}
