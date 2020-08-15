public class Player {
    private final String name;
    private final int age;

    public Player(String theName, int theAge) {
        name = theName;
        age = theAge;
    }

    String speak(String message) {
        String text = "Hello my name is %s and I'm %d years old";
        return String.format(text, name, age);
    }
}

