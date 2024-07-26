import java.util.*;
public class Main
{

    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int oddcount=0;
        int evencount=0;
        System.out.println(" enter the array elements ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0) evencount++;
            else oddcount++;

            sum+=arr[i];
        }
        System.out.println();
        double avg=(double)(sum/n*1.0);
        //sum and average of the array
        System.out.println("sum of the array :"+ sum);
        System.out.println("average of the array :"+ avg);
        int x=0,y=n-1;
        while(x<=y)
        {
            int t=arr[x];
            arr[x]=arr[y];
            arr[y]=t;
            x++;
            y--;
        }
        //reversed array
        System.out.print("reversed array is : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        // odd and even count
        System.out.println ("odd count : "+oddcount+" even count : "+evencount);
    }
    public static void array2_question()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" enter the array elements ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        List<Integer> l= new  ArrayList<>();
        List<Integer> r=new ArrayList<>();
        List<Integer> cd=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(l.contains(arr[i])||r.contains(arr[i]))
            {
                cd.add(arr[i]);
            }
            if(arr[i]<0)l.add(arr[i]);
            else r.add(arr[i]);
        }
        //positive and negative numbers
        System.out.println("negative numbers :");
        for(int i=0;i<l.size();i++) System.out.println(l.get(i)+" ");
        System.out.println("Positive  numbers :");
        for(int i=0;i<r.size();i++) System.out.println(r.get(i)+" ");
        System.out.println("Duplicate numbers :");
        for(int i=0;i<cd.size();i++) System.out.println(cd.get(i)+" ");

    }
    public static void multiple()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no of rows of array 1");
        int row1=sc.nextInt();
        System.out.println("please enter the no of columns of array 1");
        int col1=sc.nextInt();
        System.out.println("please enter the no of rows of array 2");
        int row2=sc.nextInt();
        System.out.println("please enter the no of columns of array 2");
        int col2=sc.nextInt();
        int[][] r1=new int[row1][col1];
        int[][] r2=new int[row2][col2];
        if(col1!=row2)
        {
            System.out.println("can't multiply");
            return ;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 1st 2d array");
                r1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 2nd 2d array");
                r2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[row1][col2];
        if(col1!=row2)
        {
            System.out.println("sorry we can't multiple ");
            return;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                int sum=0;
                for(int k=0;k<col1;k++){
                    sum+=r1[i][k]*r2[k][j];
                }
                res[i][j]=sum;
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void addition ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no of rows of array 1");
        int row1=sc.nextInt();
        System.out.println("please enter the no of columns of array 1");
        int col1=sc.nextInt();
        System.out.println("please enter the no of rows of array 2");
        int row2=sc.nextInt();
        System.out.println("please enter the no of columns of array 2");
        int col2=sc.nextInt();
        int[][] r1=new int[row1][col1];
        int[][] r2=new int[row2][col2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 1st 2d array");
                r1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 2nd 2d array");
                r2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[row1][col2];
        if(row1!=row2||col1!=col2)
        {
            System.out.println(" cant add the matrixes");
            return;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                res[i][j]=r1[i][j]+r2[i][j];
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void palindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while(i<=j)
        {
            if(s.charAt(i++)!=s.charAt(j--))
            {
                flag=false;
            }
        }
        if(flag) System.out.println("palindrome");
        else System.out.println("not a palindrome");

    }


    public static  void anagram()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean isAnagram = areAnagrams(str1, str2);

        System.out.println(isAnagram);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    public static void frequency() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void longest()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int length = length(s);

        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
    public static int length(String s)
    {
        int j=0;
        HashMap<Character,Integer> m=new HashMap<>();
        int res=0;
        int in=-1;
        for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                int ind=m.get(s.charAt(i));
                j=ind;
            }
            m.put(s.charAt(i),i);
            if(res<j-i+1)
            {
                in=i;
                res=j-i+1;
            }


        }
        System.out.println("and the string is  : " + s.substring(j,in+1));
        return res;
    }

    public static void main(String[] args)
    {
        LogicalPrograms lp=new LogicalPrograms();
        Operators op=new Operators();
        display();
        array2_question();
        multiple();
        addition();
        palindrome();
        anagram();
        frequency();
        longest();
        op.Arthemetic_Operators();
        op.checkdev();
        op.doing();
        op.postpre();
        op.Relational_Operator();
        lp.coupon();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for fibonnacci series");
        int n=sc.nextInt();
        lp.fibonnaci(n);
        System.out.println("enter the number to check perfect");
        int num=sc.nextInt();
        lp.perfect(num);
        System.out.println("enter the number to check prime");
        int nn=sc.nextInt();
        lp.isPrime(nn);
        System.out.println("enter the number to be reverse");
        int r=sc.nextInt();
        int cnt=lp.reverse(r);
       // lp.coupon();
        System.out.println("reversed number is :"+ cnt);
        Scanner scanner = new Scanner(System.in);
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine();
        stopwatch.start();

        System.out.println("Press Enter to stop the stopwatch.");
        scanner.nextLine();
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
        System.out.println("Elapsed time in seconds: " + elapsedTime / 1000.0);

    }
}