int* searchRange(int* nums, int numsSize, int target, int* returnSize){
   int i,j,flag=0;
    int *a=malloc(2*sizeof(int));
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            a[0]=i;
            j=i;
            flag++;
            break;
        }
    }
    for(i=j;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            a[1]=i;
            flag++;
        }
    }
    if(flag==0)
    {
        a[0]=-1;
        a[1]=-1;
    }
    *returnSize=2;
    return a;
}