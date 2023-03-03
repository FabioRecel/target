import java.util.Scanner;
public class prova2 {

	    
	    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número e veja se ele pertence ou não a sequência de Fibonacci: ");
            int numero = scanner.nextInt();
            int a = 0; 
            int b = 1;
            int fibo = a+b;
            
            while (numero >= fibo) {
                a=b;
                b=fibo;
                fibo = a+b;
            
            }
            if (numero == b)
                System.out.println(numero + " pertence a sequência de fibonacci.");
            else 
                System.out.println(numero + " não pertence a sequência de fibonacci.");

            scanner.close();
        }
           
	}
