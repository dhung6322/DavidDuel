package duel;

public class CharacterB implements Dueler{
	private int hp = 100;
	public CharacterB() {
	}
	public void taunt() {
		System.out.println("Come at me");
	}
	public String getName(){
		
		//System.out.println("John");
		return "John";
	}
	public void setStartingHP(int hp) {
		this.hp = 100;
	}
	public int getHP() {
		return this.hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		return false;
		
	} 

}
