package main;

 import cleric.Cleric;
import hero.Hero;
import matango.Matango;

public class Main {

	public static void main(String[] args) {

		//hero
		Hero h = new Hero();
		 h.setName("ミナト");
		h.hp = 100;
		System.out.println("勇者" + h.getName() + "を生み出しました");

		//cleric
		Cleric c = new Cleric();
		c.setName("ゴリラ");
		c.setHp(50);
		System.out.println("聖職者" + c.getName() + "を、生み出した");

		//matango
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();
		c.selfAid();
		c.pray(3);
	}

}
