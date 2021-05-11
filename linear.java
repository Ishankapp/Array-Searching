

//program to find a number in array using linear search 
import java.util.Scanner;
class linear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int counter=0;
        System.out.println("Enter a number which needs to be searched");
        int s = sc.nextInt();//element wich needs to be searched
        System.out.println("Enter five numbers");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();//taking 5 number of integers in array
        }
        for(int j=0;j<5;j++)
        {
            if(s==arr[j])//checking whether element is found in array
            {
                System.out.println("element found at"+(j+1));
                counter++;
                break;
            }
            else{
            }
        }
        if(counter==0)
        {
            System.out.println("Element not found");//printing that the elment is found
        }
       
    }
}
  //vdt
//s.no   //variable     // Use
//1      //int s        //the element which needs to be searched
//2      //int counter  //to check whether element is found
//3      //int i        //to input elements in array
//4      //int j        //to read every element in array        
        