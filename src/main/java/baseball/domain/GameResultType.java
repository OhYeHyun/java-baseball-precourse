package baseball.domain;

public class GameResultType {
    private final String name;
    private int amount;

    public GameResultType(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void increase() {
        this.amount += 1;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void reset() {
        amount = 0;
    }
}
