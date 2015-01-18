// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.FB2015.subsystems;

import org.FB2015.Robot;
import org.FB2015.RobotMap;
import org.FB2015.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Chassis extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	CANTalon frontLeft = RobotMap.chassisFrontLeft;
	CANTalon frontRight = RobotMap.chassisFrontRight;
	CANTalon rearLeft = RobotMap.chassisRearLeft;
	CANTalon rearRight = RobotMap.chassisRearRight;
    RobotDrive robotDrive = RobotMap.chassisRobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new CmdDrive());
    }
    
    public void mechanumDrive(double d, double e, double f) {
    	robotDrive.mecanumDrive_Cartesian(d, e, f, 0);
	}
}
