class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        l=[0]
        d={}
      
        for i in nums:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        for i in d:
            if d[i]==1:
                l.append(i)
        l.pop(0)
        return l
    