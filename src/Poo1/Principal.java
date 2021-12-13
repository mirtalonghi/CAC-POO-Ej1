package Poo1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona=new Persona();
		
			System.out.println("Escriba su nombre, por favor");
			String nombre = scanner.nextLine();
			persona.setNombre(nombre);
			
	    System.out.println("Escriba su apellido, por favor");
	    persona.setApellido(scanner.nextLine());
	    
	    System.out.println("Ingrese su edad, por favor");
	    int edad =Integer.parseInt(scanner.nextLine());
	    persona.setEdad(edad);
	    
	    System.out.println("¿Cuál es su hobby?");
	    String hobby = scanner.nextLine();
	    persona.setHobbie(hobby);
	    
	    System.out.println("¿Cuál es su editor preferido?");
	    String edit = scanner.nextLine(); 
	    persona.setEditor(edit);
	    
	    System.out.println("Escriba su sistema operativo preferido, por favor");
	    String so = scanner.nextLine();
	    persona.setSo(so);;
	    
	    System.out.println("Usted se llama " + persona.getNombre());
	    System.out.println("Su apellido es: " + persona.getApellido());
	    System.out.println("Su edad es: " + persona.getEdad());
	    System.out.println("Su hobby es: " + persona.getHobbie());
	    System.out.println("Su editor preferido es: " + persona.getEditor());
	    System.out.println("Su S.O. de preferencia es: " + persona.getOS());
		   

	}

}
