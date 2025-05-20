public class Sum
{
    public static int GetSum(int a, int b)
    {
        if(a == b)
            return a;
        if(b < 0)
            return a+GetSum(a-1,b);
        if(a < b)
            return a+GetSum(a+1,b);
        else return a+GetSum(a-1,b);
    }

    public static void main(String[] args) {
        int s = GetSum(13,9);
        System.out.println(s);
    }
}