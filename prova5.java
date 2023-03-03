import java.util.Scanner;
public class prova5 {

	    
	    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um palavra ou frase: ");
            String  s = scanner.nextLine();
        
            String s1="";
            for (int i=s.length(); i>0;i--){

                s1=s1+s.charAt(i-1);
            }
                    
                System.out.println(s1);

            scanner.close();
        }
           
	}
