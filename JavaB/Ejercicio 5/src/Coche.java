public class Coche {
    String nombre;
    String tipo;
    int year;

    public Coche() {
    }

    public Coche(String nombre, String tipo, int year) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", year=" + year +
                '}';
    }
}
