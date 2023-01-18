import java.util.Scanner;

public class Main {
	
	//Declaracion de variables	
	public static String rut = "";
	public static String digitoVerificador = "";
	public static String nombres = "";
	public static String apellidos = "";
	public static String telefono = "";
	public static String afp = "";
	public static String prevision = "";
	public static String direccion = "";
	public static String comuna = "";
	public static String edad = "";
	
	//Se declara la variable "sc" del tipo Scanner para leer las entradas del usuario
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		IngresarRut();
		IngresarDigitoVerificador();		
		IngresarNombres();
		IngresarApellidos();
		IngresarTelefono();	
		IngresarAFP();
		IngresarComuna();
		IngresarEdad();
				
		ImprimirRegistro();		
		}
	
		private static void ImprimirRegistro() {
			//Se imprime el contenido de todas las variables ingresadas
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
		}
		
		private static void IngresarRut() {
			//Se le pide al usuario ingresar el RUT
			System.out.println("Ingrese su rut sin puntos ni digito verificador: ");		
			rut = sc.nextLine();
			
			//Se valida que el numero no exceda el limite establecido		
			while(!rut.matches("[0-9]{6,8}")){			
					System.out.println("Rut Invalido. Ingrese su rut sin puntos ni digito verificador: ");		
					rut = sc.nextLine();
			}	
		}
		
		private static void IngresarDigitoVerificador() {
			//Se pide ingresar el codigo verificador
			System.out.println("Ingrese digito verificador: ");		
			digitoVerificador = sc.nextLine();
			while(!digitoVerificador.matches("[a-zA-Z_0-9]{1}")){			
				System.out.println("Error. Ingrese digito verificador: ");		
				digitoVerificador = sc.nextLine();
			}
		}
		
		private static void IngresarNombres() {
			//Se pide ingresar nombres
			System.out.println("Ingrese sus nombres: ");
			nombres = sc.nextLine();	
			//Se valida que el usuario no deje el campo vacio
			while(nombres.equals("")){
				System.out.println("Campo obligatorio. Ingrese sus nombres: ");
				nombres = sc.nextLine();
			}
		}
		
		private static void IngresarApellidos() {
			//Se pide ingresar apellidos
			System.out.println("Ingrese sus apellidos: ");
			apellidos = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(apellidos.equals("")){
				System.out.println("Campo obligatorio. Ingrese sus apellidos: ");
				apellidos = sc.nextLine();
			}	
		}
		
		private static void IngresarTelefono() {
			//Se pide ingresar telefono
			System.out.println("Ingrese su telefono: ");
			telefono = sc.nextLine();
			//Se valida el largo de la cadena
			while(!telefono.matches("[0-9]{6,15}")){
				System.out.println("Telefono invalido. Ingrese su telefono: ");
				telefono = sc.nextLine();
			}
		}
		
		private static void IngresarAFP() {
			//Se pide ingresar nombre de la AFP
			System.out.println("Ingrese su AFP");
			afp = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(afp.equals("")){
				System.out.println("Campo obligatorio. Ingrese su AFP: ");
				afp = sc.nextLine();
			}	
		}
		
		private static void IngresarPrevision() {
			//Se pide ingresar un numero que corresponde a isapre o fonasa	
			System.out.println("Seleccione su prevision: 1-Isapre 2-Fonasa");
			prevision = sc.nextLine();
			//Se valida que se ingrese 1 o 2
			while(!prevision.matches("[1-2]{1}")) {
				System.out.println("Numero Invalido. Ingrese su prevision: 1-Isapre 2-Fonasa");
				prevision = sc.nextLine();
			}	
		}
		
		private static void IngresarDireccion() {
			//Se pide ingresar la direccion
			System.out.println("Ingrese su direccion: ");
			direccion = sc.nextLine();	
			//Se valida que el largo de la cadena no exceda el limite estblecido
			while(!direccion.matches("[a-zA-Z_0-9]{6,50}")){
				System.out.println("Campo obligatorio (Hasta 50 caracteres). Ingrese su direccion: ");
				direccion = sc.nextLine();
			}		
		}
		
		private static void IngresarComuna() {
			//Se pide ingresar el nombre de la comuna
			System.out.println("Ingrese su comuna: ");
			comuna = sc.nextLine();
			//Se valida que el usuario no deje el campo vacio
			while(comuna.equals("")){
				System.out.println("Campo obligatorio. Ingrese comuna: ");
				comuna = sc.nextLine();
			}	
		}
		
		public static void IngresarEdad() {			
			//Se pide al usuario ingresar la edad
			System.out.println("Ingrese su edad: ");
			edad = sc.nextLine();
			//Se valida que la edad no exceda el limite
			while(Integer.valueOf(edad) > 120){			
				System.out.println("Edad Invalida. Ingrese su verdadera edad: ");		
				edad = sc.nextLine();		
			}
		}
	}