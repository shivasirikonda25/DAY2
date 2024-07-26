import java.util.*;
public class Operators
{
    public  void  Arthemetic_Operators()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a*b;
        System.out.println("sum is "+ c+" multiplication is "+ d);
        System.out.println("take five numbers");
        int[] arr=new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<5;i++) sum+=arr[i];
        double avg=(double)(sum/5*1.0);
        System.out.println("average is : "+avg);
        System.out.println("enter the radius :");
        int r=sc.nextInt();
        double circumference=(double)(2*Math.PI*r);
        double Area=(double)(Math.PI*r*r);
        System.out.println("area is :"+Area+" circumference is :"+circumference);
    }
    public  void Relational_Operator()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b&&a>=c) System.out.println("maximum nuber is :"+a);
        else if(b>=a&&b>=c) System.out.println("maximum nuber is :"+b);
        else System.out.println("maximum nuber is :"+c);
        System.out.println("enter two strings");
        String s1=sc.next();
        String s2=sc.next();
        boolean flag=true;
        if(s1.length()!=s2.length()) System.out.println("both are not equal");
        else {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    flag=false;
                }
            }
            if(flag) System.out.println("both strings are equal");
            else System.out.println("both strings are not  equal");
        }
    }
    public  void checkdev()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("The number is divisible both by 5 and 7");
        }
        else if(a%5==0){
            System.out.println("The number is divisible by 5 but not 7");
        }
        else if (a%7==0){
            System.out.println("The number is divisible by 7 but not 5");
        }
        else {
            System.out.println("The number is not divisible by both 5 and 7");
        }
    }
    public  void doing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        a += b;
        System.out.println("The value of a after a+=b is "+ a);
        a -= b;
        System.out.println("The value of a after a-=b is "+ a);
        a /= b;
        System.out.println("The value of a after a/=b is "+ a);
        a*=b;
        System.out.println("The value of a after a*=b is "+ a);
        a %= b;
        System.out.println("The value of a after a%=b is "+ a);
    }
    public  void postpre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        System.out.println("Post increment " + (n++));
        System.out.println("Pre increment " + (++n));
    }

}
