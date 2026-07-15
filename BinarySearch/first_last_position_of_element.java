class Solution {
    public int[] searchRange(int[] nums, int target ){
        int first= findfirst(nums,target);
        int last= findlast(nums,target);
        return new int[]{first,last};
    }
    private int findfirst(int[]nums,int target){
        int start=0;
        int end= nums.length-1;
        int res=-1;
        while(start<=end){
            int mid= (start+end)/ 2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
 private int findlast(int[]nums,int target){
        int start=0;
        int end= nums.length-1;
        int res=-1;
        while(start<=end){
            int mid= (start+end)/ 2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
}
