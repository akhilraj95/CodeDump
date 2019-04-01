//https://leetcode.com/problems/median-of-two-sorted-arrays/
//Solved using sorting. Time complexity will always be m+n/2
//Not Ideal
import java.lang.Math;

class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        boolean isSizeEven = (nums1.length + nums2.length) % 2 == 0;
        int medianIndex = Math.abs((nums1.length + nums2.length) / 2);
        if(!isSizeEven) {
            medianIndex++;
        }

        int indexOfArray1 = -1;
        int indexOfArray2 = -1;
        int sizeOfSortedArray = 0;
        boolean isLastAddedValueOfNums1 = false;

        while(sizeOfSortedArray < medianIndex) {
            if(isNextValueFromNums1(nums1, nums2, indexOfArray1, indexOfArray2)) {
                indexOfArray1 = indexOfArray1 + 1;
                isLastAddedValueOfNums1 = true;
                sizeOfSortedArray++;
                
            } else {
                indexOfArray2 = indexOfArray2 + 1;
                isLastAddedValueOfNums1 = false;
                sizeOfSortedArray++;
            }
        }

        if(!isSizeEven) {
            return isLastAddedValueOfNums1 ? nums1[indexOfArray1] : nums2[indexOfArray2];
        } else {
            return ((isLastAddedValueOfNums1 ? nums1[indexOfArray1] : nums2[indexOfArray2])
                     + (isNextValueFromNums1(nums1, nums2, indexOfArray1, indexOfArray2) ? nums1[indexOfArray1 + 1] : nums2[indexOfArray2 + 1]) * 1.0) / 2;
            
        }
    }

    private boolean isNextValueFromNums1(int[] nums1, int[] nums2, int indexOfArray1, int indexOfArray2) {
        if(indexOfArray1+1 < nums1.length && indexOfArray2+1 < nums2.length) {
            if(nums1[indexOfArray1+1] < nums2[indexOfArray2+1]) {
                return true;
            } else {
                return false;
            }
        } else if(indexOfArray1+1 < nums1.length) {
            return true;
        } else {
            return false;
        }
    }


}