public class Example {

    private String name;
    private int age;

    public Example(String n){
        this.name = n;
    }

    public Example(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Example() {
        this.name = null;
        this.age = 0;
    }

    public String toString() {
        return ("Name: " + this.getName() + ". Age: " + this.getAge());
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}
