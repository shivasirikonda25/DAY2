import java.util.*;
public class LogicalPrograms
{
    public  void fibonnaci(int n)
    {
        if(n<=1)
        {
            System.out.print(0+" ");
            if(n==0) {
                return;
            }
            System.out.print(1+" ");
            return;
        }
        int p2=0;
        int p1=1;
        System.out.print(0+" "+1+" ");
        for(int i=2;i<n;i++)
        {
            int t=p1+p2;
            p2=p1;
            p1=t;
            System.out.print(t+" ");
        }
    }
    public  void  perfect(int n)
    {
        int sum=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0) {
                sum += i;
                sum += n / i;
            }
        }
        sum=sum-n;
        if(sum==n) System.out.println(n+"  is perfect number ");
        else System.out.println(n+"  is not a perfect number ");
    }
    public  void  isPrime(int n)
    {
        int cnt=0;
        if(n==1||n==0)
        {
            System.out.println("it is not a prime number");
            return;
        }
        boolean flag=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)  flag=false;
        }
        if(flag)
        {
            System.out.println("it is a prime number");
        }
        else {
            System.out.println("it is not a prime number");
        }
    }
    public int reverse(int n)
    {
        int res=0;
        while(n!=0)
        {
            int t=n%10;
            res=10*res+t;
            n=n/10;
        }
        return res;
    }
    public  void coupon()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers: ");
        int N = sc.nextInt();

        int t =fun(N);

        System.out.println("Total random numbers needed to generate all distinct coupons: " + t);
    }
    public  int fun(int N) {
        Map<Integer,Integer> c = new HashMap<>();
        Random random = new Random();
        int count = 0;

        while (c.size() < N) {
            int r = random.nextInt(N);
            c.put(r,1);
            count++;
        }
        return count;
    }
}
