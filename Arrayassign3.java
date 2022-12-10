// to sort array
import java.util.*;
public class Arrayassign3{
    public static void main(String[] args) {
        int []a=new int[5];
        int i,j;
        Scanner s=new Scanner(System.in);
        for(i=0; i<a.length; i++){
            System.out.print("Enter the number :");
        a[i]=s.nextInt();
      }  
        for(i=0; i <a.length;i++){
            for(j=0; j<a.length; j++){
                if(a[i] < a[j]){     //sign change ascending descending change
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(i=0;i<a.length; i++)
        System.out.print(a[i]+"\t"); 
    
    }


}