package com.company;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        // the while loop will stop when left and right eventually meet
        while(left < right){
            // (left + right /2 can cause overflow), this can avoid the problem
            int mid = left + (right - left) / 2;

            // we know we have to set the right boundaries to right,
            // we search from left to right
            if(isBadVersion(mid)){
                right = mid;
            }
            // we know the boundaries is from mid to right, so we set + 1 from mid
            // for left boundaries.
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    // unit test will test 1 element, 2 elements
    // ,odd elements, even elements, last element, first element
}
