//Dada la función:
// public static String reverse(String texto) { }
//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
// debe retornar "odnum aloh".

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Hola Mundo"));
        System.out.println();

//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        int arrayUni[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayUni.length; i++) {
            System.out.println(arrayUni[i]);
        }
//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor
// de cada elemento en ambas dimensiones.
        int arrayBi[][] = {{10, 20, 30, 40}, {60, 70, 80, 90}};

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++)
                System.out.println(arrayBi[i][j] + " En posición: "+ j);
        }
        System.out.println();
//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer>vector = new Vector();
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);
        vector.add(66);
        System.out.println("Vector con datos agregados: "+vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println("Vector con datos eliminados: "+vector);

//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
// 1000 elementos para ser añadidos al mismo.
        System.out.println("El Problema de utilizar un Vector con su capacidad por defecto si tuviésemos " +
                "mil elementos seria que la capacidad que generan puede ser el doble de lo que se usa " +
                "generando un consumo excesivo de memoria.");
        System.out.println();

//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
// Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String>lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        LinkedList<String>listaEnlazada = new LinkedList<>(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Lista: "+lista.get(i));
        }
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println("Lista enlazada: "+listaEnlazada.get(i));
        }
        System.out.println();

//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.



        ArrayList<Integer>listaInt = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaInt.add(i);
            System.out.println("ArrayList: "+listaInt);
        }
        System.out.println();
        for (int i =0; i <listaInt.size(); i++){
            int elemento=listaInt.get(i);
            if(elemento %2==0){
                listaInt.remove(i);
            }
            System.out.println("ArrayList: "+listaInt);
        }
        System.out.println();
        for(int i : listaInt){
            System.out.println("Muestro ArrayList: "+i);
        }
        System.out.println();
// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> listaInt2 = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            if (i % 2 != 0)
                listaInt2.add(i);
            System.out.println("Contenido en menos pasos: "+listaInt2);
        }
        System.out.println("Contenido:");
        for(int i : listaInt2){
            System.out.print(" "+i);
        }
        System.out.println();
//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su
// llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
// Finalmente, mostraremos en cualquier caso: "Demo de código".
        try {
            int resultado=DividePorCero();
            System.out.println("resultado: "+resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse "+ e);
        }finally {
            System.out.println("Demo de codigo");
        }
        System.out.println();
//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
// dado en "fileOut".
        File fileIn = new File("./src/files/fileIn.txt");
        File fileOut = new File(".src/files/fileOut.txt");
        copiarFicheros(fileIn, fileOut);
        System.out.println("Acá esta el archivo de salida: "+fileOut);

//Sorpréndenos creando un programa de tu elección que utilice InputStream,
// PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        HashMap<String, Integer> mapa = new HashMap<>();

        int arrayFinal[] = {0,1,2,3};
        System.out.println("Tengo este Array: "+arrayFinal);

        mapa.put("Cero", arrayFinal[0]);
        mapa.put("Uno", arrayFinal[1]);
        mapa.put("Dos", arrayFinal[2]);
        mapa.put("Tres", arrayFinal[3]);
        for(Map.Entry elemento:mapa.entrySet()){
            System.out.println("Para: "+elemento.getKey());
            System.out.println("El valor es: "+elemento.getValue());
        }
        try{
            PrintStream out = new PrintStream("arrayFinal.txt");
            out.write(mapa.put("Cero", arrayFinal[0]));
            out.close();
            System.out.println("El archivo fue creado.");
        }catch (Exception e){
            System.out.println("Excepción: "+e.getMessage());
        }



    }

        public static String reverse (String texto){
            String textoInvertido = "";
            for (int i = texto.length() - 1; i >= 0; i--)
                textoInvertido = textoInvertido + texto.charAt(i);
            return textoInvertido;
        }

        private static int DividePorCero() throws ArithmeticException{
             int valor1=8;
             int valor2=0;
             return valor1 / valor2;
        }

        private static void copiarFicheros(File fileIn, File fileOut) {
             try {
                  InputStream entrada = new FileInputStream(fileIn);
                  byte[] datos = entrada.readAllBytes();
                  entrada.close();
                  PrintStream salida = new PrintStream(fileOut);
                  salida.write(datos);
                  salida.close();
                  }catch(Exception e){
                     System.out.println("Excepción: "+e.getMessage());
                  }
        }
}
