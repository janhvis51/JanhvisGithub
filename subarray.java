class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int wend = 0, wstart = 0, s1 = 0;
        ArrayList<Integer> li = new ArrayList<>();
        if(s==0)
        {
        li.add(-1);
        return li;
        }
        while (wend < n) {
            if (s1 < s) {
                s1 += arr[wend];
                wend++;
            }
            while (s1 > s) {
                s1 -= arr[wstart];
                wstart++;
            }5
            if (s1 == s) {
                li.add(wstart + 1);
                li.add(wend);
                return li;
            }
        }
        li.add(-1);
        return li;
    }
}