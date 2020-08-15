import java.util.Objects;

public class Student {
    final private String name;
    final private int id;
    private static int nextID = 0;

    public Student(String theName) {
        name = theName;
        id = ++nextID;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name, id);
    }
}

