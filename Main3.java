import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Elige una figura para calcular el area");
        System.out.println ("1. Triangulo");
        System.out.println ("2. Rectangulo");
        System.out.println ("3. Circulo");
        System.out.print ("Opcion: ");
        int opcion = entrada.nextInt ();
        
        switch (opcion) {
            case 1:
                System.out.print ("Base del triangulo:");
                double baseT = entrada.nextDouble ();
                System.out.print ("Altura del triangulo:");
                double alturaT = entrada.nextDouble ();
                double areaT = (baseT * alturaT) / 2; 
                System.out.println ("Area del triangulo:" + areaT);
                break;
            
            case 2:
                System.out.print ("Base del rectangulo: ");
                double baseR = entrada.nextDouble ();
                System.out.print ("Altura del rectangulo: ");
                double alturaR = entrada.nextDouble ();
                double areaR = (baseR * alturaR);
                System.out.println ("Area del rectangulo:" + areaR);
                break;
                
            case 3:
                System.out.print ("Radio del circulo: ");
                double radioC = entrada.nextDouble ();
                double areaC = 3.1416 * radioC * radioC;
                System.out.println ("Area del circulo: " + areaC);
                break; 
            
            default:
                System.out.println ("Opcion no valida.");
                break;
                
         }
        entrada.close(); 
    }
}
