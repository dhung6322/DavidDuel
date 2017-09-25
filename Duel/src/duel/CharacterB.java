package duel;

public class CharacterB implements Dueler{
	private int hp = 100;
	private String charTaunts[] = {"Too good for you", "I'm the best", "Best dueler out there"};
	private int x = 0;
	private boolean isLoaded = false;
	private float ONE = 1;
	private float THREE = 3;
	private float ONETHIRD = ONE / THREE ;
	
	public CharacterB() {
	}
	public void taunt() {
		//System.out.println("Too good for you");
		System.out.println(this.charTaunts[x]);
		x = x+1;
		if (x >= 2)
		{
			x = 0;
		}
		
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
		if (caller != this.getName()) 
		{
			
			if(Math.random() <  ONETHIRD                 && !isLoaded)
			{
				isLoaded = true;
				return 0;
			}
			if(isLoaded)
			{
				if(Math.random() < .5)
				{
					isLoaded = false;
					return 1;
				}
				return 2;
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
