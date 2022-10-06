public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Seba", "Ramon", "Lujan"};
        String concatenado = "";

        for(int i = 0; i < nombres.length; i++){
            concatenado += nombres[i] + " ";
        }
        System.out.println(concatenado);
    }
}

//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado
//final por consola.
