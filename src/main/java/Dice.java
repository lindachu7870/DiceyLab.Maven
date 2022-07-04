public class Dice {

    private int numDice;

    public Dice(int numDice) {
        // Make sure that if user inputs a value less than 1, then default to 1
        if (numDice < 1) numDice = 1;
        else this.numDice = numDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < this.numDice; i++) {
            int roll = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println(roll);
            sum += roll;
        }
        return sum;
    }
}
