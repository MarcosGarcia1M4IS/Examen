package exam;

public class Examen_3erEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        int numero,f1,f2,i;
	  
	     
	            numero = 6;
	     
	  
	        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 
 f1=1;
 f2=1;

	        System.out.print(f1 + " ");
	        for(i=2;i<=numero;i++){
	            System.out.print(f2 + " ");
	            
	            
	            f2 = f1 + f2;
//----------------------------------------------------------------------------------------------------	            
	            f1 = f2 - f1;
	            
	        }
	        System.out.println();

		
	}

}
