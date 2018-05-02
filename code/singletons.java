public class Singleton {

private static Singleton singleton = null ;

    private Singleton() {
      system.out.println("init complete")
    }

    public static Singleton getSingleton() {

        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }

}
