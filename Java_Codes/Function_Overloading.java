public class Function_Overloading {
    public static void main(String[] args){
    
    System.out.println(Sum(10,5));
    System.out.println(Sum(12,13,10));
    }

    public static int Sum(int a,int b)
    {
        return a+b;
    }
   public  static int Sum (int a,int b, int c)
   {
    return a+b+c;
   }
}   
