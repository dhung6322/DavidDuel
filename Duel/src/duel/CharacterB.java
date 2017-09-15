package duel;

public class CharacterB implements Dueler{

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
		hp = 100;
	}
	public int getHP() {
		return 100;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		return false;
		
	} 

}
