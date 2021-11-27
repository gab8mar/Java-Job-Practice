package gabrielparreñop1;

import java.util.Scanner;


public class Main {
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        int bandera=0;
     
        while(bandera==0){
        System.out.println("\n MENÚ");
        System.out.println("1. Verificar Número Perfecto");
        System.out.println("2. Imprimir Tabla de Multiplicar");
        System.out.println("3. Verificar Factorial");
        System.out.println("4. Número Invertido");
        System.out.println("5. Salir");
        
    
        
        System.out.println("Digite una opción: ");
        String opcion=sc.next();
       
          switch(opcion){
            
            
            case "1": 
                int divisor=1;
                int numero;
                int acumulador=0;
                System.out.println("Verificar número: ");
                numero=sc.nextInt();
                while(divisor < numero){
                if(numero % divisor == 0){
                acumulador=acumulador + divisor;
                }
                divisor=divisor+1;
                }
                if(acumulador == numero){
                System.out.println("El numero es perfecto");
                }
                else{
                System.out.println("El numero no es perfecto");
                }
                break;
                
            
            case "2":
      
                int _numero,i,j;

                System.out.print("indica la tabla de multiplicar: ");
                numero = sc.nextInt();


                for(j = 1; j <= 12; j++)
                {
                System.out.println(numero + " X " + j + " = " + numero*j);
                }
                System.out.println();
                break;
            
            
            case "3":
     
                System.out.print("Verificar Factorial\n");
                int num= sc.nextInt();
                System.out.print("Digite un número\n"+num);
                Factorial factoral=new Factorial();
                
                int numeroFactorial= factoral.factorial(num);
                System.out.println("\nEl número factorial es: "+numeroFactorial);
           
                break;
           
            
            case "4":
         
                System.out.print("Número a invertir: \n");
                int num1= sc.nextInt();
                String numCadena= String.valueOf(num1);
                Factorial factoral1=new Factorial();
                
                String invertido= factoral1.invertir(numCadena);
             
                break;
            
            
            case "5":
                bandera=1;
                break;
            default:
                System.out.println("Digite un número dentro de las opciones");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
    }
    
}
