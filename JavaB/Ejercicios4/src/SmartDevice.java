public class SmartDevice {

    String marca;
    String modelo;
    String caracteristicas;
    String sitemaOperativo;
    int year;
    double precio;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String caracteristicas, String sitemaOperativo,
                       int year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.sitemaOperativo = sitemaOperativo;
        this.year = year;
        this.precio = precio;
    }

}

//En este ejercicio tendréis que crear una clase SmartDevice.
// Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//Crear constructor vacío y con todos los parámetros para cada clase.
//