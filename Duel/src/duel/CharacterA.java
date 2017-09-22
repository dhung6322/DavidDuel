package duel;

public class CharacterA implements Dueler {
	private int hp = 100;
	private String aTaunts[] =  {"Can't touch this", "That all you got?", "You should just give up", "This is too easy"};
	private int x = 0;

	public void taunt() {
		System.out.println(this.charTaunts[x]);
		x = x + 1;
		if (x > 3){
			x = 0;
		}
	}


	public String getName() {
		return "Bob";
	}

	public void setStartingHP(int hp) {
		hp = this.hp	
	}


	public int getHP() {
		return this.hp;
	}


	public boolean determineIfOpponentIsFair(Dueler d, int target) {

		if(d.getHP() == target){
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
