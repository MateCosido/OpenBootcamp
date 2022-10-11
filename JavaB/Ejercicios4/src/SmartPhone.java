public class SmartPhone extends SmartDevice {
    int numero;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String caracteristicas, String sitemaOperativo,
                      int year, double precio, int numero) {
        super(marca, modelo, caracteristicas, sitemaOperativo, year, precio);
        this.numero = numero;
    }
}