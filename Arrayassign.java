// smallest element finding problem
import java.util.*;


public class Arrayassign {
    public static void main(String[] args) {
        
        int i=0;
        int a[] = new int[5]; // declaring array
        int small;
        Scanner s= new Scanner(System.in);

        for(i=0; i<a.length; i++){
            System.out.println("Enter the number" +(i+1)+ " :");
            a[i]=s.nextInt();
        }
        small=a[0];
        for(i=1; i<a.length; i++){
            if( a[i]< small){        // for largest element we need chane just sign > here
                small=a[i];
            System.out.println("The smallest elements is :" +small); 
            }
        } 
    }



    
}
