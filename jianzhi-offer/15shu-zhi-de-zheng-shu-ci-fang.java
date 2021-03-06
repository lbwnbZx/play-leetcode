/*实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
//快速幂
*/
class Solution {
    public double myPow(double x, int n) {
        double res=1;
        int exponent=n;
        while(exponent!=0){
            if((exponent&1)==1)
                res=res*x;
            x*=x;
            //exponent>>=1;
            exponent/=2;
        }
        return n>0?res:1/res;
    }
}
