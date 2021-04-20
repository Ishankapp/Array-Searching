

//program to search a number by binary search 
import java.util.Scanner;
class binary_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number which needs to be searched");
        int element=sc.nextInt();//taking element which needs to be searched
        

        System.out.println("Enter how many numbers do you want to enter");
        int n=sc.nextInt();//taking number of numbers user has to enter

        int arr[]=new int[n];//definig array of length n
                System.out.println("Enter numbers in ascending order");//

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();//taking integer in array
        }
        int last=n-1; 
        int first=0;
        int flag=0;
        int mid=0;
        while(first<=last)//to execute loop until first is equal or smaller than last
        {
            mid=(last+first)/2;//finding mid of arrays
            
            if(element<arr[mid])//adjusting last limit to mid-1 as element is smaller than mid
            {
                last=mid-1;
            }
            else if(element>arr[mid])//adjusting first limit to mid+1 as element is bigger than mid
            {
                first=mid+1;
            }
            else // other wise mid will be equal to the element
            {
                int ans=mid+1;
                System.out.println("Element is found at "+ ans);
                flag++;
                break;
            }
        }
            if(flag==0)//if element is not fount fag will be 0
            {
                System.out.println("Element not found");
            }
        }
    }
  
  
                
                
        
