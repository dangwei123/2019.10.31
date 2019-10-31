1.
给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。

返回使 A 中的每个值都是唯一的最少操作次数。
class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int count=0;
        for(int i=1;i<A.length;i++){
            if(A[i]<=A[i-1]){
                count+=A[i-1]-A[i]+1;
                A[i]+=A[i-1]-A[i]+1;
            }
        }
        return count;
    }
}

