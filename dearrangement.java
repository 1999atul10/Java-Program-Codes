public class dearrangement {
    static int dearrange(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return (n-1)*(dearrange(n-1)+(dearrange(n-2)));
    }
    public static void main(String args[])
    {
        int ans=dearrange(4);
        System.out.println("ans= "+ans);
    }
}
