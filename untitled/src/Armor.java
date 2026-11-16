public class Armor {
    private String name;
    private int percent;

    public Armor(String name, int percent) {
        this.name = name;
        this.percent = percent;
    }

    public Armor() {
        this("NoItems", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}