import java.util.*;
public class YSR_ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        System.out.println("-------> ROCK PAPER SCISSOR GAME <------- ");
        System.out.println("ENTER YOUR NUMBER->");
        System.out.println("  0 -> ROCK");
        System.out.println("  1  -> Scissor");
        System.out.println("  2  -> PAPER");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        Random ran= new Random();
        int num2= ran.nextInt(2)+0;

        if(num2==0){
            System.out.println("COMPUTER SELECTION : ROCK");
        }else if (num2==1){
            System.out.println("COMPUTER SELECTION : SCISSOR");
        }else {
            System.out.println("COMPUTER SELECTION : PAPER");
        }

        if(num==num2){
            System.out.println("TIE");

        }else if(num==0 && num2==1){
            System.out.println("YOU WIN");
        } else if (num==0 && num2==2) {
            System.out.println("COMPUTER WINS");
        } else if (num==1 &&num2==0) {
            System.out.println("COMPUTER WIN");
        } else if (num==1 && num2==2) {
            System.out.println("YOU WIN");
        } else if (num==2 && num2==0) {
            System.out.println("YOU WIN");
        }else {
            System.out.println("COMPUTER WINS");
        }
    }
}
