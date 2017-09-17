package duel;

public class CharacterA implements Dueler {

	public void taunt() {
		System.out.println("Can't touch this");	
	}


	public String getName() {
		return "Bob";
	}

	public void setStartingHP(int hp) {
		this.hp = 100;	
	}


	public int getHP() {
		return this.hp;
	}


	public boolean determineIfOpponentIsFair(Dueler d, int target) {

		if(d.this.hp == target){
			return true;
		}
	}

}
