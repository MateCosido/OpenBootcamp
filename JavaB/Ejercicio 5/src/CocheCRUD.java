import java.util.List;

public interface CocheCRUD {

    void save (Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);

}

//Como métodos de CocheCRUD podemos poner:
//save() findAll() delete() que simplemente impriman por consola el nombre del propio método.