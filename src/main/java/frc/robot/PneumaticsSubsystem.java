// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {

  private Solenoid solenoid;

  private boolean isOpen = true;

  public PneumaticsSubsystem() {
    solenoid =
        new Solenoid(
            Constants.CAN_PNEUMATICS_ID, PneumaticsModuleType.CTREPCM, Constants.SOLENOID_ID);
  }

  public void open() {
    solenoid.set(true);
    isOpen = true;
  }

  public void close() {
    solenoid.set(false);
    isOpen = false;
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void toggle() {
    if (isOpen) {
      close();
    } else {
      open();
    }
  }
}
