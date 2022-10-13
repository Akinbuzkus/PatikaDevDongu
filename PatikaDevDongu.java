
import java.util.Scanner;

public class PatikaDevDongu {
    public static void main(String[] args) {
   
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int number = scan.nextInt();
        
        /*
        Çift Olan Sayılar
        
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/
   
        
        for(int i=0;i<=number;i++){
            if(i%3==0 && i%4==0){
                int sayılar=i;
              
                System.out.println(sayılar);
               
            }
        
}
        }
        
}
