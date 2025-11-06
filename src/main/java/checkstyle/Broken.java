package checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String name;
    private String surname;
    private static final String VALUE = "";

    public Broken() { }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d) {
    }


}