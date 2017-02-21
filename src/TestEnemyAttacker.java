public class TestEnemyAttacker {

	public static void main(String[] args) {
		EnemyTank rx7tank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForwad();
		fredTheRobot.smashWithHands();
		
		System.out.println("The Enemy Tank");
		rx7tank.assignDriver("Frank");
		rx7tank.driveForward();
		rx7tank.fireWeapon();
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
