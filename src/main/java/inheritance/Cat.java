package inheritance;

public class Cat extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("From method example of Cat");
    }

    public static void staticInvoke() {
        System.out.println("From static method of Cat");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
