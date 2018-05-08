public class Student {

    private int id;
    private String name;

    public static int StudentsNumber = 0;

    public static Student create(int id, String name) {
    return new Student(id, name)
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
