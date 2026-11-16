public class Monsters {
    private String Name;
    private int hpMonster;
    static int maxHp = 50;
    private int damage;

    private Player player;

    public Monsters(String Name, int damage) {
        this.Name = Name;
        hpMonster = maxHp;
        this.damage = damage;
    }

    public void info_monster(){
        System.out.println("========================================================");
        System.out.println("Монстр:" + Name + "\n hp монстра:" + hpMonster + "\n урон монстра:" + damage);
        System.out.println("========================================================");
    }

    public void takeDamageOnMonsters(Player target) {
        hpMonster -= target.getWeapon().getDamage();
        if (hpMonster < 0){
            hpMonster = 0;
        }
        if (hpMonster <= 0){
            player.raisingLevel(10);
        }
    }

    public int getDamage() {
        return damage;
    }
}
