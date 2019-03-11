public class Person {
    private String name;

    public Person(String _name) { name = _name; }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }
}