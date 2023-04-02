public class Dancer extends Performer {
    private int shoeSize;

    public Dancer(String name, int age, Agent agent, int shoeSize) {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    public void pirouette(int numSpins) {
        System.out.println("I am spinning " + numSpins + " times!");
    }

    public int getShoeSize() {
        return shoeSize;
    }

    @Override
    public String getName() {
        return super.getName() + " is a dancer!";
    }

    @Override
    public void rehearse() {
        pirouette(3);
        super.rehearse();
    }


    public void perform(boolean warmUp) {
        if (warmUp) {
            rehearse();
        }
        perform();
    }

    @Override
    public void callAgent() {
        super.callAgent();
        System.out.println("My shoes don't fit! Please pick me up a new pair.");
    }

    public void callAgent(int correctSize) {
        callAgent();
        System.out.println("I wear size " + correctSize + " by the way!");
    }

}
