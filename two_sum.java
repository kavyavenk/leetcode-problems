class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int arr[];
        int a=0;
        int b=0;
        int c=0;
        arr=new int[2];
        if(2<=nums.length && nums.length<= 10000)
        {
            for(int i=0;i<nums.length-1;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        a=i;
                        b=j;
                        c=1;
                        break;
                    }
                }
                if(c==1)
                    break;
            }
        }
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
}
