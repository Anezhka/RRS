package Homework.Lesson11.Part11_1;

public class Fighter {

  public String name;
  public int health, damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter attacker;
    Fighter defender;

    if (firstAttacker == fighter1.name) {
      attacker = fighter1;
      defender = fighter2;
    } else {
      attacker = fighter2;
      defender = fighter1;
    }

    while (attacker.health > 0 && defender.health > 0) {
      defender.health -= attacker.damagePerAttack;
      Fighter tmp = attacker;
      attacker = defender;
      defender = tmp;
      }

    if (attacker.health <= 0) {
      return defender.name;
    } else return attacker.name;
  }
}
