package duel;

public class CharacterB implements Dueler{
	private int hp = 100;
	private String charTaunts[] = {"Too good for you", "I'm the best", "Best dueler out there"};
	
	
	public CharacterB() {
	}
	public void taunt() {
		//System.out.println("Too good for you");
		System.out.println(this.charTaunts[0]);
		
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
		/*if (d.getHP() == target)
		{
			return true;
		}
		else
		{
			return false;
		}*/
		return (d.getHP() == target);
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
			//do nothing
		}
		
			this.hp = this.hp - 10;
		
		
	}

}
