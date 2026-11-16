public class Player {
    private String userName;
    private int hp;
    private int level;
    private int xp;
    static int maxHp = 100;

    private Weapon weapon;
    private Armor armor;
    private Monsters monsters;

    public Player(String userName) {
        this.userName = userName;
        hp = maxHp;
        level = 1;
        xp = 0;
        weapon = new Weapon();
        armor = new Armor();
    }

    public Player() {
        this("NoName");
    }

    public void info() {
        System.out.println("========================================================");
        System.out.println("username:" + userName + "\n hp:" + hp + "\n level:" + level + "\n xp:" + xp);
        System.out.println("========================================================");
    }

    public void takeDamage(Player target) {
        hp -= target.getWeapon().getDamage();
        if (hp < 0){
            hp = 0;
        }
    }


    public void meHill(int hill) {
        if (hill > 0) {
            hp += hill;
            if (hp > maxHp) {
                hp = maxHp;
            }
        }
    }

    public void raisingLevel(int value){
        xp += value;
        if (xp > 100){
            level += 1;
            maxHp += 25;
        }
    }

    public void takeDamageMonsters(Monsters target) {
        hp -= target.getDamage();
        if (hp < 0) {
            hp = 0;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        userName = name;
    }

    public int getPercent() {
        return armor.getPercent();
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}