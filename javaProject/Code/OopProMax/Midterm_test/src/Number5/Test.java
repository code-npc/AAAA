package Number5;

import java.util.Scanner;

public class Test {

    /*
    给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给
    定目标值在数组中的开始位置和结束位置。
    如果数组中不存在目标值 target，返回 [-1, -1]。

    数组 nums = [5,7,7,8,8,10], target = 8
    得到结果是：[3,4]
    */
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
//        int[] nums = {};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int left = findLeft(nums,target);
        int right = findRight(nums,target);
        System.out.println(left);
        System.out.println(right);
    }

    private static int findLeft(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        int mid = 0;
        int res = -1;
        while (low<=high){
            mid = (low+high)/2;
            if (nums[mid] > target){
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }else {
                res = mid;
                high = mid-1;
            }
        }

        return res;
    }

    private static int findRight(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        int mid = 0;
        int res = -1;
        while (low<=high){
            mid = (low+high)/2;
            if (nums[mid] > target){
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }else {
                res = mid;
                low = mid+1;
            }
        }

        return res;
    }

}
