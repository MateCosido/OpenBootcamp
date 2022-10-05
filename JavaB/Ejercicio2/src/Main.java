public class Main {
 //Para este ejercicio tendréis que crear una función que reciba
    // un precio y devuelva el precio con el IVA incluido.

    public static void main(String[] args) {

        double precio = 10;
        precioConIva(precio);
        System.out.println("El precio es de: "+precio);
        System.out.println("El IVA es de: "+iva(precio));
        System.out.println("El precio con IVA es de: "+precioConIva(precio));
    }

    static double iva(double precio){
        return precio * 0.21;
    }

    static double precioConIva(double precio){
        return precio + iva(precio);
    }
}
