package Chapter10.Q3;

public class Solution {
    public int search(int[] nums, int target) {
    		if(nums.length == 0) return -1;
    		if(nums.length == 1) return nums[0]==target?0:-1;
		return search(nums, 0, nums.length-1,target);
        
    }
    
    public int search(int[] nums, int start, int end, int target) {
    		System.out.println("start" + start +" end"+end);
    		if(target==nums[start]) {
    			return start;
    		}
    		if(target==nums[end]) {
    			return end;
    		}
    		if(start==end-1) {
    				return -1;
    		}
    		int mid = (start + end)/2;
    		if(nums[mid]<nums[start]&&nums[mid]<nums[end]) {
    			if(target<nums[start]) {
    				return search(nums, mid, end, target);
    			}else {
    				return search(nums, start, mid, target);
    			}
    			
    		}else if(nums[mid]>nums[start]&&nums[mid]>nums[end]){
    			if(target>nums[start]) {
    				return search(nums, mid, end, target);
    			}else {
    				return search(nums, start, mid, target);
    			}
    		}else {
    			System.out.println("here");
    			if(target>nums[mid]) {
    				return search(nums, mid, end, target);
    			}else if(target<nums[mid]) {
    				return search(nums, start, mid, target);
    			}else {
    				return mid;
    			}
    		}
    		
    }
}
