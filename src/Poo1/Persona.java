package Poo1;

	public class Persona {
		String nombre;
		String apellido;
		Integer edad;
		String hobbie;
		String editor;
		String so;
	    
    public void setNombre(String nombre) 
    {
	    this.nombre=nombre;
    }
    
    public void setApellido(String apellido)
    {
    	this.apellido=apellido;
    }
    
    public void setEdad(int edad)
    {
    	this.edad = edad;
    	
    }
    public void setHobbie(String hobbie)
    {
    	this.hobbie = hobbie;
    	
    }
    public void setEditor(String editor)
    {
    	this.editor = editor;
    	
    }
    public void setSo(String so)
    {
    	this.so = so;
    	
    }
    //declaro getters

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getHobbie(){
        return hobbie;
    }
    public String getEditor(){
        return editor;
    }
    public String getOS(){
    	return so;}
    
    public String getEdad(){
        return Integer.toString(edad);
    }
    //Declaro métodos

    public void getAll(){
        String texto= "Hola! "+getApellido()+", "+getNombre()+"\n";
        String texto2= "Tu edad es: " + getEdad()+"\n";
        String texto3="Tu hobbie es: "+getHobbie()+"\n";
        String texto4="Tu editor de codigo favorito es: " +getEditor()+" y usas el siguiente Sistema Operativo: "+getOS()+"\n";
        System.out.println(texto+texto2+texto3+texto4);
    }
}