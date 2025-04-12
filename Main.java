import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Escribe el primer  numero:");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Escribe el segundo numero:");
        double numero2 = entrada.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double modulo = numero1 % numero2;
        
        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Division:" + division);
        System.out.println("Modulo:" + modulo);
    }
}
