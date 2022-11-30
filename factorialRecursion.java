public class factorialRecursion {
    static int fact(int number)
    {
        if(number==0)
        {
            return 1;
        }
        else{
            return (number*fact(number-1));
        }
    }
    public static void main(String args[])
    {
        int ans=fact(5);
        System.out.println("ans= "+ans);
    }
    
}
