class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int max=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]) {
                            max=nums2[k];
                            break;
                    }
                }
                break;
                }
            }
            arr[i]=max;
        }
        return arr;
    }
}
