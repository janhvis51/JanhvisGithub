void sortColors(int* nums, int numsSize){
    int i=0,j,mid=0,t;
    j=numsSize-1;
    while(mid<=j)
    {
        
    if(nums[mid]==0)
    {
        t=nums[mid];
    nums[mid]=nums[i];
        nums[i]=t;
        mid++;
        i++;
    }
    else if(nums[mid]==1)
    {
        mid++;
    }
    else
    {
        t=nums[mid];
    nums[mid]=nums[j];
        nums[j]=t;
        j--;
    } 
}
  return nums;      
    
}
longest increasing subsequencen