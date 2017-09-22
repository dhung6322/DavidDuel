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

		if(d.gethp() == target){
			return true;
		}
	}

}
public int getAction(Object caller) {
		if (caller != this.getName()) 
		{
			if(Math.random() < .3)
			{
				return 0;
			}
			if(Math.random() < .6)
			{
				return 1;
			}
			return 2;
		}
		return 3;
	}
	public void hit(Object caller) {
		if (caller != this.getName())
		{
		
		}
		
			this.hp = this.hp - 10;
		
		
	}

}
