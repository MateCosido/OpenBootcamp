public class Main {
    static CocheCRUD cocheCRUD;

    public static void main(String[] args) {
        Coche coche = new Coche();
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll();
        cocheCrud.save(new Coche());
        cocheCrud.delete(coche);

    }

}

/*
Crear una interfaz CocheCRUD.+++
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
*/