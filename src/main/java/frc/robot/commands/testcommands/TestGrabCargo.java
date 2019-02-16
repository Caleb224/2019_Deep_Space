/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.testcommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TestGrabCargo extends Command {
  boolean done;
  double motorspeed;
  public TestGrabCargo() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.arm);
    done = false;
    motorspeed = 0.0;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    motorspeed = Robot.testTabTable.getEntry("motorspeed").getDouble(0.0);
    done = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
        //Sets the intake motor to zero if the intake has a ball
        if(Robot.arm.ballPresent() == true){
          done = true;
          Robot.arm.stopMotor();
        }
        else{
          Robot.arm.grabCargo();
        }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return done;
    //hello
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}