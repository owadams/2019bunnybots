package frc.team5115;

public class Constants{

//PID
    public static final int kSlotIdx = 0;

    public static final int kPIDLoopIdx = 0;

    public static final int kTimeoutMs = 30;

    public static final Gains kGains_Velocit = new Gains( 1, 0, 0, 1023.0/7200.0,  300,  1.00);

//MOTOR IDS
    public static final int FRONT_INTAKE_ID = 9;

    public static final int ELEVATOR_ID = 8;

    public static final int FLYWHEEL_ID = 6;

    public static final int FRONT_LEFT_MOTOR_ID = 1;

    public static final int FRONT_RIGHT_MOTOR_ID = 3;

    public static final int BACK_LEFT_MOTOR_ID = 4;

    public static final int BACK_RIGHT_MOTOR_ID = 2;

//BUTTON IDS
    public static final int INTAKE_BUTTON_ID = 1;

    public static final int SHOOTER_BUTTON_ID = 2;

//SPEEDS
    public static final double DRIVE_SPEED = 0.5;

    public static final double INTAKE_SPEED = 0.5;

    public static final double SHOOTER_SPEED = 0.5;

    public static final double ELEVATOR_SPEED = -0.5;



}

