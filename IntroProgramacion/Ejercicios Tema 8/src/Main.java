public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(38, "Sebastian", 123456789);
        System.out.println("Nombre: "+persona1.getNombre()+ ". Edad: "+persona1.getEdad()+ " años"+
                ". Telefono: "+persona1.getTelefono());

    }
}
/*
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola
*/