class median_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] newArr = new int[len];

        int i=0, j=0, k=0; // counters

        // creating new array
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            }
        }
        while (i < len1) {
            newArr[k++] = nums1[i++];
        }
        while (j < len2) {
            newArr[k++] = nums2[j++];
        }

        // finding median
        if (len % 2 == 0) {
            return ((double) newArr[len/2 - 1] + (double) newArr[len/2]) / 2.0;
        } else {
            return (double) newArr[len/2];
        }

    //     // binary search
    //     int len1 = nums1.length;
    //     int len2 = nums2.length;

    //     // i want first array smaller
    //     if (len1 > len2)
    //         return findMedianSortedArrays(nums2, nums1);

    //     int len = len1 + len2;
    //     int left = (len1 + len2 + 1) / 2; // defining left partition size
    //     int low = 0, high = len1;

    //     // binary search
    //     while (low <= high) {
    //         int mid1 = (low + high) / 2; // mid index for nums1
    //         int mid2 = left - mid1;

    //         int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
    //         int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

    //         // set values for l1 l2 r1 r2
    //         if (mid1 < len1)
    //             r1 = nums1[mid1];
    //         if (mid2 < len2) 
    //             r2 = nums2[mid2];
    //         if (mid1 - 1 >= 0)
    //             l1 = nums1[mid1 - 1];
    //         if (mid2 - 1 >= 0)
    //             l2 = nums2[mid2 - 1];

    //         if (l1 <= r2 && l2 <= r1) {
    //             if (len%2 == 1)
    //                 return Math.max(l1, l2);
    //             else    
    //                 return ((double)(Math.max(l1,l2) + Math.min(r1,r2))) / 2.0;
    //         } else if (l1 > r2) {
    //             // shift towards left of nums1
    //             high = mid1 - 1;
    //         } else {
    //             // shift towards right of nums1
    //             low = mid1 + 1;
    //         }
    //     }
    //     return 0;
    }
}