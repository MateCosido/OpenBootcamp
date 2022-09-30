public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, int telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

//    Crea una nueva clase Cliente que herede de Persona,
//        esta nueva clase tendrá la variable credito solo para esa clase.