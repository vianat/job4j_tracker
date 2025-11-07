package encapsulation;

public class College {
    public static void main(String[] args) {
        Student newSt = new Student();
        newSt.setFIO("David");
        newSt.setGroup("Tech");
        newSt.setStartDate("1 sep 2024");

        System.out.println(newSt.getFIO());
        System.out.println(newSt.getGroup());
        System.out.println(newSt.getStartDate());
    }
}
