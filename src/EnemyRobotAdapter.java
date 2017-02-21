
public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot){
		theRobot = newRobot;
	}
	
	@Override
	public void fireWeapon() {
		theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		theRobot.walkForwad();
	}

	@Override
	public void assignDriver(String drivername) {
		theRobot.reactToHuman(drivername);
		
	}

}
