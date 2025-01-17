public class MathHelper {

    /** Returns the sum of 1 + 2 + 3 + ... + n
     *
     * @param n
     * @return sum of elements from 1 to n
     */
    public static int arithmeticSeries(int n) {
        int k= 0;
        for(int i=1;i<n+1;i++){
            k = k + i;
        }

        return k;
    }


    /** Takes three line segments (a, b, c) and checks if they can form a triangle.
     *  Three line segments can form a triangle if the sum of the lengths of any
     *  two line segments exceeds the length of the third line segment.
     *
     * @param a
     * @param b
     * @param c
     * @return true if these lines segments can form a triangle, and false otherwise
     */
    public static boolean validTriangle(int a, int b, int c) {
        if (((a+b)>c ) && ((a+c)>a ) && ((b+c)>a)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(MathHelper.arithmeticSeries(10));
        System.out.println(MathHelper.validTriangle(3, 6, 8));
    }
}