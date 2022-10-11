public class SmartWatch extends SmartDevice{
    String medida;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String caracteristicas, String sitemaOperativo,
                      int year, double precio, String medida) {
        super(marca, modelo, caracteristicas, sitemaOperativo, year, precio);
        this.medida = medida;
    }

}
