class Persona{

private int edad;
private String nombre;

public Persona(int edad, String nombre){

	this.edad = edad;
	this.nombre = nombre;
}
public String getNombre(){
	return nombre;
}
public int getEdad(){
	return edad;
}
}
public static void main(String[] args){
	Persona p1 = new Persona(19,"Samuel");
	Persona p2 = new Persona(18,"Rubén");
	System.out.println("La persona : "+p1.getNombre()+"con edad: "+p1.getEdad()+"Dice: Hola Carmelo");
	System.out.println("La persona : "+p2.getNombre()+"con edad: "+p2.getEdad()+"Dice: Adiós Carmelo");

}
