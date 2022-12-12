int findPeakElement(int* nums, int numsSize){
int i,max=-2147483648,s;
//if(nums[0]==-2147483647 && nums[1]==-2147483648)
//return 0;
//else if(nums[0]==-2147483648 && nums[1]==-2147483647)
//return 1;
for(i=0;i<numsSize;i++)
{
    if(nums[i]>max)
    {
    max=nums[i];
     s=i;
    }
}
return s;
}