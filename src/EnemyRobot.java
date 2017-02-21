import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands(){
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes " + attackDamage + " damage wit hands");
		
	}
	
	public void walkForwad(){
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forawrd " + movement + " spaces");
		
	}
	
	public void reactToHuman(String drivername){
		System.out.println("Enemy robot tramps on " + drivername);
	}
}
