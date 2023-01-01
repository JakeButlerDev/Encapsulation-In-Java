public class Student {

    private String name;
    private int age;

    // Best practice is to include getter and setter methods in this class, helps to protect against unwanted modification of fields as well as following the principle of bundling like data
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;     // this keyword differentiates our object's variable from the variable in method parameter
    }
}
