package cleric;

import java.util.Random;

public class Cleric {
	private String name;
	private int hp = 50;
	private final int MAXHP = 50;
	private int mp = 10;
	private final int MAXMP = 10;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return MAXHP;
	}

	public void setMaxHp(int MAXHP) {
		this.hp = MAXHP;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMaxMp() {
		return MAXMP;
	}

	public void setMaxMp(int maxMp) {
		this.mp = maxMp;
	}
	
	//skil
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた");
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println(this.name + "は、HPが全回復した");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間祈りを捧げた");
		int recover = new Random().nextInt(7)+ sec;
		int recoverActual = Math.min(this.MAXMP - this.mp,recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}

}
