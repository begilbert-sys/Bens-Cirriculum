public class Human {
    private String name;
    int age;
    int height;
    double weight;
    public Human(String n, int a, int h, double w) {
        name = n;
        age = a;
        height = h;
        weight = w;
    }
    public void greet() {
        System.out.println("Hello, my name is" + name);
    }

    public int birthyear() {
        return 2024 - age;
    }
    public double bmi() {
        return 703 * weight/(height*height);
    }

    public void isLargerThan(Human otherHuman) {
        if (bmi() > otherHuman.bmi()) {
            System.out.println(name + " is larger than " + otherHuman.name);
        } 
        else {
            System.out.println(otherHuman.name + " is skinnier than " + name);
        }
    }

}
