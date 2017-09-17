package duel;

public class CharacterA implements Dueler {

	public void taunt() {
		System.out.println("Can't be touched");	
	}


	public String getName() {
		return null;
	}

	public void setStartingHP(int hp) {

		
	}


	public int getHP() {
		return 0;
	}


	public boolean determineIfOpponentIsFair(Dueler d, int target) {

		return false;
	}

}
