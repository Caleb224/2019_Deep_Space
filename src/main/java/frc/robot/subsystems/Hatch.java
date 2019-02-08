/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.DriveHatch;

/**
 * Add your docs here.
 */
public class Hatch extends Subsystem {
  private TalonSRX hatchMotor;
  private DigitalInput hatchEncoder;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
public Hatch(){
  hatchMotor = new TalonSRX(RobotMap.HATCH_TALON);
  hatchEncoder = new DigitalInput(RobotMap.HATCH_ENCODER);


}
public void driveMotor (double speed){
  hatchMotor.set(ControlMode.PercentOutput,speed);
  ;
}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new DriveBoschMotor());
  }
}

