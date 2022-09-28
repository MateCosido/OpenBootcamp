class Coche {

    //Segunda parte:
//Crear una clase coche.*

//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    int puertas = 0;

    //Constructor vacio.
    public Coche(){
    }
//Constructor
    public Coche(int puertas) {
        this.puertas = puertas;
    }

    //Una función que incremente el número de puertas que tiene el coche.
    public void incrementarPuertas(){
        puertas++;
    }
}


