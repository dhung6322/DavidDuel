package duel;

public class CharacterB implements Dueler{
	private int hp = 100;
	public CharacterB() {
	}
	public void taunt() {
		System.out.println("Come at me");
	}
	public String getName(){
		
		return "John";
	}
	public void setStartingHP(int hp) {
		hp = this.hp;
	}
	public int getHP() {
		return this.hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		return (d.getHP() == target);
		
	} 
	public int getAction(Object caller) {
		return 1;
	}
	public void hit(Object caller) {
		//code
	}

}
