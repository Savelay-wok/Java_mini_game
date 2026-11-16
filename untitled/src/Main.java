public class Main {
 public static void main(String[] args) {
  Player[] players = new Player[2];

  Weapon weapon1 = new Weapon("Лук", 12);
  Weapon weapon2 = new Weapon("Булава", 23);

  Armor armor1 = new Armor("Стальная кираса", 25);
  Armor armor2 = new Armor("Деревянный нагрудник", 5);

  Monsters monster = new Monsters("Орк", 50);

  players[0] = new Player("Kollega");
  players[1] = new Player();

  players[1].setUserName("Sheff_312");

  players[0].info();
  monster.info_monster();

  players[0].takeDamageMonsters(monster);


  players[0].info();
  monster.info_monster();

  monster.takeDamageOnMonsters(players[0]);


  players[0].info();
  monster.info_monster();
  
  System.out.println("Привет!");
 }
}