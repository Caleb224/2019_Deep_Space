/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.hatch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class DeployHatch extends CommandGroup {
  /**
   * Add your docs here.
   */
  public DeployHatch() {

    addSequential(new DriveHatchToLimit());
    addSequential(new HatchPistonsOut());
    addSequential(new WaitCommand("SolenoidPause", 1));
    addSequential(new HatchPistonsIn());

  }
}
