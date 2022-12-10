import java.util.*;

public class Arrayassign2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        int element =0;
        int position = -1;
        for(i=0; i<a.length; i++){
            System.out.print("Enter the number" +(i+1)+":");
            a[i]=s.nextInt();
        }
        System.out.print("Enter element to search :");
        element=s.nextInt();
        for(i=0; i< a.length; i++){
            if(a[i]== element);
             position =i;
            break;
        }
        if(position ==-1){
        System.out.println("element not found");
        }
        else {
        System.out.println("The element is :"+position);
        }


       
    }

    
}
