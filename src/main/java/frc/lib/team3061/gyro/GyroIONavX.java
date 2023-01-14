/*
 * Initially from https://github.com/Mechanical-Advantage/SwerveDevelopment
 */

package frc.lib.team3061.gyro;

import static frc.robot.Constants.*;

public class GyroIONavX implements GyroIO {
  // private final Pigeon2 gyro;
  private final double[] xyzDps = new double[3];

  public GyroIONavX(int id) {
    // gyro = new NavX(id, CAN_BUS_NAME); FIXME: fix
  }

  @Override
  public void updateInputs(GyroIOInputs inputs) {
    // gyro.getRawGyro(xyzDps);
    // inputs.connected = gyro.getLastError().equals(ErrorCode.OK);
    // inputs.positionDeg = gyro.getYaw(); // degrees
    // inputs.velocityDegPerSec = xyzDps[2]; // degrees per second
  }
}
