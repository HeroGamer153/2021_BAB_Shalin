/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package team.gif.robot.commands;

import team.gif.robot.subsystems.CIM;
import team.gif.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.NEO;

/**
 * Describe the Command functionality here
 */
public class NEOVoltage extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public NEOVoltage() {
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        NEO.getInstance().setVoltage(2.5);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        NEO.getInstance().setVoltage(0);
    }
}
