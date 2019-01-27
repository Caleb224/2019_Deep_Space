package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
/*
 * Changelog:
 * 
 *
 *
 */

public class RobotMap {
	
	//CAN Bus
	public static final int LEFT_TALON_MASTER = 4;
	public static final int LEFT_TALON_FOLLOWER = 3;
	public static final int RIGHT_TALON_MASTER = 5;
	public static final int RIGHT_TALON_FOLLOWER = 6;
	
	//Driver's Station IO
	public static final int GAMEPAD_PORT = 0;
	public static final int GAMEPAD2_PORT = 1;
		
}
