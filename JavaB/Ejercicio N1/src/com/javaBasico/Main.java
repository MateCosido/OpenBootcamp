package com.javaBasico;
/* Crea un proyecto de Java desde 0
   Dentro del proyecto tenéis que crear un paquete.
    En el paquete tendréis que crear una clase.
      Dentro de la clase tenéis que crear el método main
        e imprimir todos los datos que se han visto en las sesiones.
   */
public class Main {

    public static void main(String[] args) {

        byte byte1 = 1;
        short short1 = 12;
        int int1 = 500;
        long long1 = 13000000;

        System.out.println("Soy un BYTE: "+byte1+ ". Soy un SHORT: "+short1+ ". Soy un INT: "+int1+
                ". Soy un LONG: "+long1);

        float float1 = 1.5f;
        double double1 = 0.1;
        System.out.println("Soy un FLOAT: "+float1+ ". Soy un DOUBLE: "+double1);

        boolean true1 = true;
        boolean false1 = false;
        System.out.println("Soy un BOOLEAN TRUE: "+true1+ ". Soy un BOOLEAN FALSE: "+false1);

        char char1 = 'a';
        String saludo1 = "Hola, soy un String";
        System.out.println("Soy un CHAR: "+char1+ ". Soy un STRING: "+saludo1);

    }
}

