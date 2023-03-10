import java.util.Scanner;
/**
*
* @author Javier Fuentes Espinosa
*/
public class CompañiaSeguros {
	
	//Declaracion de variables	
	private static String rut = "";
	private static String digitoVerificador = "";
	private static String nombres = "";
	private static String apellidos = "";
	private static String telefono = "";
	private static String afp = "";
	private static String prevision = "";
	private static String direccion = "";
	private static String comuna = "";
	private static String edad = "";
	
	//Se declara la variable "sc" del tipo Scanner para leer las entradas del usuario
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		ingresarRut();
		digitoVerificador = obtenerDV(rut);				
		ingresarNombres();
		ingresarApellidos();
		ingresarTelefono();	
		ingresarAFP();		
		ingresarPrevision();
		ingresarDireccion();
		ingresarComuna();
		ingresarEdad();
				
		imprimirRegistro();		
		}
		
		//Función que imprime el contenido de todas las variables ingresadas
		private static void imprimirRegistro() {			
			System.out.println("-----------------------------------");				
			System.out.println("Rut: " + rut + "-" + digitoVerificador);
			System.out.println("Nombre: " + nombres + " " + apellidos);
			System.out.println("Telefono: " + telefono);
			System.out.println("AFP: " + afp);
			if(prevision.equals("1")) {
				System.out.println("Prevision: Isapre");
			}			
			else{
				System.out.println("Prevision: Fonasa");
			}			
			System.out.println("Direccion: " + direccion);
			System.out.println("Comuna: " + comuna);
			System.out.println("Edad: " + edad);
			System.out.println("-----------------------------------");		
		}
		
		private static void ingresarRut() {			
			System.out.println("Ingrese su rut sin puntos ni digito verificador: ");		
			rut = sc.nextLine();
			
			//Se valida que el numero no exceda el limite establecido		
			while(!rut.matches("[0-9]{6,8}")){			
					System.out.println("Rut Invalido. Ingrese su rut sin puntos ni digito verificador: ");		
					rut = sc.nextLine();
			}	
		}
		
		//Función que retorna el digito verificador de un rut
		public static String obtenerDV(String rut) {			
			 int suma = 0;
			 int factor = 2;
			 
			 for (int i = rut.length() - 1; i >= 0; i--) {			 
			        suma += Integer.valueOf(String.valueOf(rut.charAt(i))) * factor;		       
			        if(factor < 7) {
			        	factor++;		        	
			        	}
					else {
					  	factor = 2;
						}
			        }
			int dv = 11 - (suma % 11);
			return (dv == 11) ? "0" : (dv == 10) ? "K" : String.valueOf(dv);			
		}
		
		
		private static void ingresarNombres() {		
			System.out.println("Ingrese sus nombres: ");
			nombres = sc.nextLine();	
			//Se valida que el usuario no deje el campo vacio
			while(nombres.equals("")){
				System.out.println("Campo obligatorio. Ingrese sus nombres: ");
				nombres = sc.nextLine();
			}
		}
		
		private static void ingresarApellidos() {			
			System.out.println("Ingrese sus apellidos: ");
			apellidos = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(apellidos.equals("")){
				System.out.println("Campo obligatorio. Ingrese sus apellidos: ");
				apellidos = sc.nextLine();
			}	
		}
		
		private static void ingresarTelefono() {			
			System.out.println("Ingrese su telefono: ");
			telefono = sc.nextLine();
			//Se valida el largo de la cadena
			while(!telefono.matches("[0-9]{6,15}")){
				System.out.println("Telefono invalido. Ingrese su telefono: ");
				telefono = sc.nextLine();
			}
		}
		
		private static void ingresarAFP() {			
			System.out.println("Ingrese su AFP");
			afp = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(afp.equals("")){
				System.out.println("Campo obligatorio. Ingrese su AFP: ");
				afp = sc.nextLine();
			}	
		}
		
		private static void ingresarPrevision() {			
			System.out.println("Seleccione su prevision: ");
			System.out.println("1-Isapre");
			System.out.println("2-Fonasa");
			prevision = sc.nextLine();
			//Se valida que se ingrese 1 o 2
			while(!prevision.matches("[1-2]{1}")) {
				System.out.println("[Numero Invalido]\nIngrese su prevision: ");				
				System.out.println("1-Isapre");
				System.out.println("2-Fonasa");
				prevision = sc.nextLine();
			}	
		}
		
		private static void ingresarDireccion() {			
			System.out.println("Ingrese su direccion: ");
			direccion = sc.nextLine();	
			//Se valida que el largo de la cadena no exceda el limite estblecido
			while(direccion.length() == 0 || direccion.length() > 50){
				System.out.println("Campo obligatorio (Hasta 50 caracteres). Ingrese su direccion: ");
				direccion = sc.nextLine();
			}		
		}
		
		private static void ingresarComuna() {			
			System.out.println("Ingrese su comuna: ");
			comuna = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(comuna.equals("")){
				System.out.println("Campo obligatorio. Ingrese comuna: ");
				comuna = sc.nextLine();
			}	
		}
		
		public static void ingresarEdad() {					
			System.out.println("Ingrese su edad: ");
			edad = sc.nextLine();
			//Se valida que la edad no exceda el limite
			while(Integer.valueOf(edad) > 120){			
				System.out.println("Edad Invalida. Ingrese su verdadera edad: ");		
				edad = sc.nextLine();		
			}
		}		
	}