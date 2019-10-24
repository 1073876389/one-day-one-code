/**
 * 1.给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 */
@SuppressWarnings("ALL")
public class TwoSum{

    public static void main(String[] args) {
        int[] num ={2,5,5,11};
        int t = 10;
        int[] ints = twoSum(num, t);
        System.out.println(ints[0]+","+ints[1]);
    }

    /**
     * 我使用了算法复杂度 O(n2) 的解答方式
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        throw new RuntimeException("不存在!!!");
    }
}