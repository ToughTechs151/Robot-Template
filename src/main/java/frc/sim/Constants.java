package frc.sim;

import edu.wpi.first.math.util.Units;

/** Constants utility class for the arm simulation. */
public final class Constants {

  private Constants() {
    throw new IllegalStateException("Utility class");
  }

  /** Arm simulation constants. */
  public static final class ArmSim {
    private ArmSim() {
      throw new IllegalStateException("ArmSim Utility Class");
    }

    public static final int MOTOR_PORT = 0;
    public static final int ENCODER_A_CHANNEL = 0;
    public static final int ENCODER_B_CHANNEL = 1;
    public static final int JOYSTICK_PORT = 0;

    public static final String ARM_POSITION_KEY = "ArmPosition";
    public static final String ARM_P_KEY = "ArmP";

    // The P gain for the PID controller that drives this arm.
    public static final double DEFAULT_ARM_KP = 50.0;
    public static final double DEFAULT_ARM_SETPOINT_DEGREES = 75.0;

    // distance per pulse = (angle per revolution) / (pulses per revolution)
    //  = (2 * PI rads) / (4096 pulses)
    public static final double ARM_ENCODER_DIST_PER_PULSE = 2.0 * Math.PI / 4096;

    public static final double ARM_REDUCTION = 200;
    public static final double ARM_MASS = 8.0; // Kilograms
    public static final double ARM_LENGTH = Units.inchesToMeters(30);
    public static final double MIN_ANGLE_RADS = Units.degreesToRadians(-75);
    public static final double MAX_ANGLE_RADS = Units.degreesToRadians(255);
  }
}
