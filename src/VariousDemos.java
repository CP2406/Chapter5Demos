public class VariousDemos {
    public static void main(String[] args) {
        PairOfDice pair1 = new PairOfDice();
        PairOfDice pair2 = new PairOfDice();
        PairOfDice pair3 = new PairOfDice();

        System.out.println(pair1.die1 + " " + pair1.die2);
        System.out.println(pair2.die1 + " " + pair2.die2);
        System.out.println(pair3.die1 + " " + pair3.die2);

        Student student1 = new Student("Jack");
        Student student2 = new Student("Harry");

        System.out.println(student1.toString()); // outputs Jack(1)
        System.out.println(student2.toString()); // outputs Harry(2)

    }

    static double toFahrenheit(double celsius) {
        class Converter {
            final double value;
            Converter(double value) { this.value = value; }
            double convert() {
                return value*9/5 + 32;
            }
        }

        Converter converter = new Converter(celsius);
        return converter.convert();
    }
}

