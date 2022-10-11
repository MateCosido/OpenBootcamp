
public class Main {

    public static void main(String[] args) {
        SmartDevice tv = new SmartDevice("Samsung", "KL989", "SmartTV",
                "Linux", 2022, 5000);
        System.out.println("Este es un TV: "+tv.marca+" Modelo: "+tv.modelo+
                " Tipo: "+tv.caracteristicas+" Sistema Operativo: "+tv.sitemaOperativo+
                " Año: "+tv.year+" Precio: "+tv.precio);
        System.out.println(" ");

        SmartPhone celular1 = new SmartPhone ("Samsung", "G500", "SmartPhone",
                "Android", 2022, 3000, 155123123);
        System.out.println("Este es un Celular: "+celular1.marca+" Modelo: "+celular1.modelo+
                " Tipo: "+celular1.caracteristicas+" Sistema Operativo: "+celular1.sitemaOperativo+
                " Año: "+celular1.year+" Precio: "+celular1.precio+" Número de linea: "+celular1.numero);
        System.out.println(" ");

        SmartWatch watch1 = new SmartWatch("Xiaomi", "XI202", "SmartWatch",
                "Android", 2022, 2000, "mediano");
        System.out.println("Este es un SmartWatch: "+watch1.marca+" Modelo: "+watch1.modelo+
                " Tipo: "+watch1.caracteristicas+" Sistema Operativo: "+watch1.sitemaOperativo+
                " Año: "+watch1.year+" Precio: "+watch1.precio+" Tamaño: "+watch1.medida);
        System.out.println(" ");
    }
}
//En este ejercicio tendréis que crear una clase SmartDevice.
// Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//Crear constructor vacío y con todos los parámetros para cada clase.
//
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.