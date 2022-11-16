public class Main {
    public static void main(String[] args){
        System.out.println("Si veo el mismo valor Singleton (TODO OK)");
        System.out.println("Si veo valores diferentes, se creo dos veces (NOT OK)");
        System.out.println();
        Singleton singleton = Singleton.getInstance("Primer Singleton");
        Singleton otroSingleton = Singleton.getInstance("Segundo Singleton");
        System.out.println(singleton.string);
        System.out.println(otroSingleton.string);
    }
}
