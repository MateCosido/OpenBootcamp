import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//Llamar a la función en el main y darle valores.
           int sumaDeTres = sumaDeTres(1,2,3);

        System.out.println(sumaDeTres);

//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println("Este coche "+"'"+miCoche+"'"+ " tiene "+miCoche.puertas+" puertas");

    }
    //Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.

    public static int sumaDeTres(int a, int b, int c){

        return a + b + c;
    }



}