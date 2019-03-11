class Animal {
    public void eat() { System.out.println("Animal eats."); }

    public void sleep() { System.out.println("Animal sleeps."); }
}

class Bird extends Animal {
    public void eat() { System.out.println("Bird eats."); }

    public void sleep() { System.out.println("Bird sleeps."); }

    public void fly() { System.out.println("Birds fly."); }
}

class Prog1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}