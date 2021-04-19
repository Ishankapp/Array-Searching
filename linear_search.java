import java.util.Scanner;
class linear_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        System.out.println("Enter an element which needs to be searched");
        String s=sc.next();
        String arr[]=new String[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            int rea=arr[i].compareTo(s);
            if(rea==0)
            {
                System.out.println("Element found at " + (i+1));
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Element not found");
        }
        }
    }
