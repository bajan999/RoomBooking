
package roombooking;

import java.util.Scanner;


public class RoomBooking {
    
    public static double price=0;
    public static int days=0;
    public static int userChoice;
    
    public static void discount(){
        for (int i = 0; i < days-7; i++) {
            if(userChoice==1){
                
            }
        }
    }

    public static int getUserInt(){
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        System.out.println("what sort of room do you want? (prices per day)\n1)single - £50\n2)double - £75\n3)family(of 4) - £105");
        boolean valid=false;
        userChoice=0;
        while(valid==false){
            userChoice=getUserInt();
            if(userChoice>3|userChoice<1){
                System.out.println("invalid choice");
            }else{
                valid=true;
            }
        }
        
        switch(userChoice){
            case 1:
                price=50;
            case 2:
                price=75;
            case 3:
                price=105;
        }
        System.out.println("How many days are you going to stay?");
        days=getUserInt();
        price=price*days;
        System.out.println("Price before discount £"+price);
        discount();
        System.out.println("with a discount, that will cost £"+price);
    }
    
}
