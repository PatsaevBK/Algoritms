package leetcode

fun main() {
    assert(missingNumber(intArrayOf(3, 0, 1)) == 2)
    assert(missingNumber(intArrayOf(0, 1)) == 2)
    assert(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)) == 8)
}
/*
268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

*/

private fun missingNumber(nums: IntArray): Int {
    val sum = (1 + nums.size) * nums.size / 2
    return sum - nums.sum()
}

private fun fastest(nums: IntArray): Int {
    var n = 0
    var i = 0
    while (i < nums.size) {
        n -= nums[i]
        n += i
        i++
    }
    n += nums.size
    return n
}