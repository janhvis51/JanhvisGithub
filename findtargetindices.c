int* targetIndices(int* nums, int numsSize, int target, int* returnSize){
    int i,j,swap,k=0;
    for (i = 0 ; i < numsSize - 1; i++)
  {
    for (j = 0 ; j < numsSize - i - 1; j++)
    {
      if (nums[j] > nums[j+1]) /* For decreasing order use '<' instead of '>' */
      {
        swap       = nums[j];
        nums[j]   = nums[j+1];
        nums[j+1] = swap;
      }
    }
  }
    int* result=malloc(numsSize*sizeof(int));
   
    
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
        result[k]=i;
        k++;
        }
    }
    *returnSize=k;
    return result;
}