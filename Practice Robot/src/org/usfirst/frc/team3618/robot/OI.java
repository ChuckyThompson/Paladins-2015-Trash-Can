package org.usfirst.frc.team3618.robot;

import org.usfirst.frc.team3618.robot.commands.ArmsDownCommand;
import org.usfirst.frc.team3618.robot.commands.ArmsUpCommand;
import org.usfirst.frc.team3618.robot.commands.LeftLiftDownCommand;
import org.usfirst.frc.team3618.robot.commands.LeftLiftUpCommand;
import org.usfirst.frc.team3618.robot.commands.LeftToteArmDownCommand;
import org.usfirst.frc.team3618.robot.commands.LeftToteArmUpCommand;
import org.usfirst.frc.team3618.robot.commands.LiftDownCommand;
import org.usfirst.frc.team3618.robot.commands.LiftUpCommand;
import org.usfirst.frc.team3618.robot.commands.RightLiftDownCommand;
import org.usfirst.frc.team3618.robot.commands.RightLiftUpCommand;
import org.usfirst.frc.team3618.robot.commands.RightToteArmDownCommand;
import org.usfirst.frc.team3618.robot.commands.RightToteArmUpCommand;
import org.usfirst.frc.team3618.robot.commands.TotePusherInCommand;
import org.usfirst.frc.team3618.robot.commands.TotePusherOutCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick stick = new Joystick (1);
	public static Joystick stick2 = new Joystick (2);
	public static Joystick launchpad = new Joystick (3);
	
	public Button liftUp = new JoystickButton(stick, 4);
	public Button liftDown = new JoystickButton(stick, 3);
	public Button rightLiftUp = new JoystickButton(stick, 5);
	public Button rightLiftDown = new JoystickButton(stick, 6);
	public Button leftLiftUp = new JoystickButton(stick, 7);
	public Button leftLiftDown = new JoystickButton(stick, 8);
	public Button pushIn = new JoystickButton(stick, 9);
	public Button pushOut = new JoystickButton(stick, 10);
	public Button armsDown = new JoystickButton(stick, 50);
	public Button armsUp = new JoystickButton(stick, 51);
	public Button rightToteArmUp = new JoystickButton(stick2, 1);
	public Button leftToteArmUp = new JoystickButton(stick2, 2);
	public Button rightToteArmDown = new JoystickButton(stick2, 3);
	public Button leftToteArmDown = new JoystickButton(stick2, 4);
	
public OI(){
	liftUp.whileHeld(new LiftUpCommand());
	liftDown.whileHeld(new LiftDownCommand());
	rightLiftUp.whileHeld(new RightLiftUpCommand());
	rightLiftDown.whileHeld(new RightLiftDownCommand());
	leftLiftUp.whileHeld(new LeftLiftUpCommand());
	leftLiftDown.whileHeld(new LeftLiftDownCommand());
	pushIn.whenPressed(new TotePusherInCommand());
	pushOut.whenPressed(new TotePusherOutCommand());
	armsDown.whenPressed(new ArmsDownCommand());
	armsUp.whenPressed(new ArmsUpCommand());
	rightToteArmUp.whenPressed(new RightToteArmUpCommand());
	leftToteArmUp.whenPressed(new LeftToteArmUpCommand());
	rightToteArmDown.whenPressed(new RightToteArmDownCommand());
	leftToteArmDown.whenPressed(new LeftToteArmDownCommand());
	
	
}
	
	
	
}

