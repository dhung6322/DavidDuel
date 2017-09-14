package duel;

public class CharacterA implements Dueler{
	public CharacterA() {
		
	}
	public void taunt() {
		System.out.println("Ez");
	}
	public String getName(){
		
		String name = "Johnny";
		return name;
	}
	public void setStartingHP(int hp) {
		
	}
	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		// TODO Auto-generated method stub
		return false;
	}
}
