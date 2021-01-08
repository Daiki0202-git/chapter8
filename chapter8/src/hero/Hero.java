package hero;

 public class Hero {
	 private String name;
	public int hp;

	 //set,get
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }

	//attack
	public void attack() {

	}
	//sleep
	public void sleep() {
		this.hp = 100;
		System.out.println(this.getName() + "は、眠って回復した！");
	}
	//sit
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.getName() +"は、" + sec + "秒座った！");
		System.out.println("HPが" +  sec + "ポイント回復した");
	}
	//slip
	public void slip() {
		this.hp -= 5;
		System.out.println(this.getName() + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	//run
	public void run() {
		System.out.println(this.getName() + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
