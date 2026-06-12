class URLManager {
    private static URLManager instance;

    private URLManager() {
    }

    public static URLManager getInstance() {
        if (instance == null) {
            instance = new URLManager();
        }
        return instance;
    }

    public void displayURL(String url) {
        System.out.println("URL: " + url);
    }
}

public class SingleTon {
    public static void main(String[] args) {

        URLManager obj1 = URLManager.getInstance();
        URLManager obj2 = URLManager.getInstance();

        String url1 = "https://google.com";
        String url2 = "https://github.com";

        obj1.displayURL(url1);
        obj2.displayURL(url2);

        System.out.println();
        System.out.println("obj1 HashCode : " + obj1.hashCode());
        System.out.println("obj2 HashCode : " + obj2.hashCode());

        if (obj1 == obj2) {
            System.out.println("Same Singleton Object");
        } else {
            System.out.println("Different Objects");
        }
    }
}