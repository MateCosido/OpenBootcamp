public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(22, "Sebastian", 1234564789, 20000);

        System.out.println("Cliente: "+cliente1.getNombre()+ ". Edad: "+cliente1.getEdad()+ " años"+
                ". Telefono: "+cliente1.getTelefono()+ ". Credito disponible: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador(30, "Raul", 1239871, 2000);
        System.out.println("Trabajador: "+trabajador1.getNombre()+ ". Edad: "+trabajador1.getEdad()+ " años"+
                ". Telefono: "+trabajador1.getTelefono()+ ". Salario: "+trabajador1.getSalario());

    }
}
/*
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
 el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.
 */