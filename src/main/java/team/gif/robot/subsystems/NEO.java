
package team.gif.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

/**
 * Subsystems describe functionality of a particular feature of
 * the robot. It contains methods for commands (and other methods)
 *    to interact with the subsystem.
 * Example: An Elevator subsysytem might have commands which
 *    set a zero position setZeroPosition()
 *    get position getPosition()
 *    move hanger to a specific height setHeight()
 *
 * Describe the Subsystem functionality here
 */
public class NEO extends SubsystemBase {
    private static NEO instance = null;

    // creates a singleton class (only 1 instance can be instantiated)
    public static NEO getInstance() {
        if (instance == null) {
            instance = new NEO();
        }
        return instance;
    }

    public static final CANSparkMax newSpark = new CANSparkMax(RobotMap.MOTOR_SPARKMAX_ONE, CANSparkMaxLowLevel.MotorType.kBrushless);

    public void setVoltage(double voltage){
        newSpark.setVoltage(voltage);
    }
    private NEO(){
        super();

        newSpark.enableVoltageCompensation(12);
        newSpark.setIdleMode(CANSparkMax.IdleMode.kCoast);

        newSpark.setSmartCurrentLimit(40,40);

    }
}
