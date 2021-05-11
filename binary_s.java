import java.util.Scanner;
class binary_s
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter element which needs to be searched for");
        String n=sc.next();
        System.out.println("Enter number of elemenets ");
        int s=sc.nextInt();    
        String arr[]=new String[s];
        System.out.println("Enter elements");
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Entered  string elements");

        for(int i=0;i<s;i++)
        {
            System.out.println("Arr is" + arr[i]);
        }

        int first=0;
        int last=s-1;
        while(first<=last)
        {
            int mid=(first+last)/2;
            int res=n.compareTo(arr[mid]);
            if(res<0)
            {
                last=mid-1;
            }
            else if(res>0)
            {
                first=mid+1;
            }
            else 
            {
                System.out.println("Element found at "+(mid+1));
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
            
                
                