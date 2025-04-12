import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print ("Ingresa tu nombre:");
        String nombre = entrada.nextLine();
        
        System.out.print ("Ingresa tu edad:");
        int edad = entrada.nextInt();
        entrada.nextLine(); //Para limpiar
        
        System.out.print ("Ingresa tu correo electronico:");
        String correo = entrada.nextLine(); 
        
        System.out.println ("Nombre:" + nombre);
        System.out.println ("Edad:" + edad);
        System.out.println ("Correo:" + correo);
    }
}
