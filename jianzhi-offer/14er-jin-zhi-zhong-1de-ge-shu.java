/*请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9?表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
*/
/*
//逐位运算
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res += n&1;
            n>>>=1;
        }
        return res;
    }
}
*/


/*巧用n&(n-1)
假设n=10101100,则n-1=10101011
n&(n-1)=10101000
此时若n&(n-1)不等于0,令res++,n=n&(n-1)
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }
}