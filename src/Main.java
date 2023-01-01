public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        // This is bad practice in OOP, very time-consuming and data has little to no protection
//        s.name = "Tommy";
//        s.age = 17;
        s.setName("Suzie");
        s.setAge(24);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}