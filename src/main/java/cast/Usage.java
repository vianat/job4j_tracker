package cast;

public class Usage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, plane, train};
        for (Vehicle object : vehicles) {
            System.out.println(object);
            object.move();
        }
    }
}
