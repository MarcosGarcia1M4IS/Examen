package examen;
import java.util.Scanner;
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tc = new Scanner(System.in);
	 String user = "usuario", user2 = null;
	 String password ="HolaMundo", pass2 = null;
	 char op = 0;
	 int cantidad = 1000, venta = 0, c = 0;

	 try {
	 while (c <3) {
	
				 System.out.println("Ingrese el nombre del usuario");
		 user2 = tc.next();
		 System.out.println("Ingrese la contraseña");
		 pass2 = tc.next();
		 
			if(user2.equals(user)&&pass2.equals(password)) {
				 
				 if(user2.equals(user)&&pass2.equals(password)) {
				
					 int[] arr = new int[3]; 
					 
					
					 while(op != 'd') {
						 System.out.println("Ingrese la opción que desea");
						 System.out.println("a. Registrar articulo\nb. Realizar Tramite\nc. Mostrar factura\nd. salir");
						 op = tc.next().charAt(0) ;
						 
							 switch(op) {
							 case 'a': 

								 System.out.println("Cantidad actual de artículos " + cantidad);
								
								 
								 System.out.println("Ingrese cuantos pantalones quiere registrar");
								 int cant = tc.nextInt();
								 if(cant <= 0) {
										System.out.println("El Valor no Puede ser Menor a 0");
									}else {
										 System.out.println("Cantidad anterior de artículos " + cantidad);
										 cantidad = cantidad +cant;
										System.out.println("Cantidad actual de articulos " + cantidad);		 
									}
								
							break;
					
								 
							 case 'b': 
								 System.out.println("Ingrese la cantidad a vender");
							     arr[0] = tc.nextInt();
							     
							     if(arr[0]>1000||arr[0] < 0) {
							    	 
								     System.out.println("Acción Invalida");
							     } else {
							     
								 System.out.println("Ingrese el precio del producto");
								 arr[1] = tc.nextInt();
								 if(arr[1]>0) {
									 arr[2] = arr[0]*arr[1];
									 cantidad = cantidad - arr[0];
									 
									 System.out.println("Cantidad actual de articulos " + cantidad);
								     	 
								 }else {
									 System.out.println("Acción Invalida");
								 }
									 
								 }
							     break;
							
							 case 'c': 
								 System.out.printf("| %-15s | %-12s | %-12s |\n", "Cantidad", "P/U", "Precio Total");	
								 System.out.println("----------------------------------------------------------------");
								 for(int producto : arr) {
									 System.out.printf("| %-15s" , producto);
								 }
									break;
									 
							 case 'd': 
								 System.out.println("Saliendo...");
								 System.exit(0);
									break;
								
										 		 	 
							 }
						
					 }
					
				 }
			}else {
				c++;
				System.out.println("Nombre de Usuario incorrecto, intento " + c);
			}
	 
	 
	 }
		

		System.out.println("Demasiados intentos fallidos");

	 }catch(java.util.InputMismatchException e){
		 System.out.println("Dato Erroneo");
	 }
	}
}
