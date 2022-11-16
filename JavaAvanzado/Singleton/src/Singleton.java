public final class Singleton {
    private static Singleton instance;
    public String string;
    private Singleton(String string) {
        try{
            Thread.sleep(500);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.string = string;
    }

    public static Singleton getInstance(String string){
        if(instance == null){
            instance = new Singleton(string);
        }
        return instance;
    }
}
