
package org.usfirst.frc.team3618.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ChassisSubsystem extends Subsystem {
	RobotDrive 	myRobotDrive =new RobotDrive (0,1,5,4);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void DriveMe (Joystick stick) { 
    	myRobotDrive.mecanumDrive_Cartesian(stick.getX(),stick.getY(),stick.getZ(),0);
    	
    }
    public void StopMe () {
    	myRobotDrive.drive(0, 0);
    }
      	
    	
    	
    	
    
    public ChassisSubsystem()
    {
    	//Empty constructor
    }

	}


