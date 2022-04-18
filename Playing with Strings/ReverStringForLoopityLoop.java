import java.util.Scanner;
public class ReverStringForLoopityLoop {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, this is the reverse name machine!! What is your name?");
        String name = keyboard.nextLine();


        //String name = "paola";
        String reverse = "";
        for (int i = name.length()-1 ; i >=0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Your name backwards is "+reverse);
    }
}
