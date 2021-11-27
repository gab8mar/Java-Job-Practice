
package gabrielparreñop1;
     
public class Factorial {
    /*
    public static int invNum(int n) {
    int nDigitos = Integer.toString(n).length();

    int nInv = 0;

    if (nDigitos == 1) {
        return n;
    } else {
        for (int i = 0; i < nDigitos; i++) {
            if (i == 0) {
                nInv += (n % 10) * Math.round(Math.pow(10, (nDigitos - 1)));
            } else if (i == nDigitos - 1) {
                nInv += n / Math.round(Math.pow(10, (nDigitos - 1)));
            } else {
                nInv += (n / Math.round(Math.pow(10, i))) % 10 
                         * Math.round(Math.pow(10, (nDigitos - 1 - i)));
            }
        }
    }

    if (nInv < 0) {
        return nInv / 10;
    } else {
        return nInv;
    }
}

    
    
    
    
*/
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
    
    
    public int factorial(int numero){
    
        if (numero>0){
        
         int factorial=numero*factorial(numero-1);
         return factorial;
        
        }
        
        
        return 1;
    }
    
        public String invertir(String numero){
               String invertida = "";
            
            for (int indice = numero.length() - 1; indice >= 0; indice--) {
                
			invertida += numero.charAt(indice);
		}
            System.out.println("El numero invertido: "+invertida);
        
        
    
        
        
        return invertida;
    }
}
