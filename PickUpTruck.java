class PickupTruck extends Vehicle
{
    private Trunk backTrunk;
    private Door leftDoor;
    private Door rightDoor;
    private Seat leftSeat;
    private Seat rightSeat;

    private int maxWeightInPounds;

    private Axle axle1;
    private Axle axle2;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;

    public PickupTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                       double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
                       double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
                       int engineTemperatureInFahrenheit, boolean engineIsWorking, double engineChanceOfFailure,
                       String nameOfSteeringWheel, boolean steeringWheelIsWorking, double steeringWheelChanceOfFailure,
                       String steeringWheelType, double steeringWheelDiameterInInches, String nameOfBattery, String batteryColor,
                       int batteryCapacityInYears, double batteryVoltageInVolts, boolean batteryIsWorking, String nameOfFuelTank,
                       boolean fuelTankIsWorking, int fuelTankOilInGallons, double fuelTankCapacity, String nameOfBrake,
                       int brakeDiscSizeInInches, double brakePadThicknessInInches, boolean brakeIsWorking,
                       double brakeChanceOfFailure, int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear,
                       int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet, double transmissionGearRatio,
                       double transmissionAmountOfTransmissionFluidInQuarts, boolean transmissionValveBodyIsWorking,
                       boolean transmissionSensorIsWorking, boolean transmissionClutchesAndBandsIsWorking,
                       boolean transmissionTorqueConverterIsWorking, boolean transmissionPlanetaryGearSetIsWorking,
                       boolean transmissionSunGearIsWorking, boolean transmissionPlanetGearIsWorking,
                       boolean transmissionRingGearIsWorking, boolean transmissionPumpIsWorking, boolean transmissionIsWorking,
                       String nameOfGasPedal, boolean gasPedalIsWorking, double gasPedalSurfaceAreaInInches, String nameOfRadiator,
                       double radiatorTemperatureOfRadiatorFahrenheit, boolean radiatorIsWorking,
                       double radiatorWaterLevelInInches,
                       String nameOfTrunk, int trunkDiameterInFeet, boolean trunkIsWorking, double trunkChanceOfFailure,
                       boolean leftDoorIsOpen, int leftDoorTintPercentage, boolean leftDoorIsLocked, boolean leftDoorIsWorking, boolean leftDoorWindowsOpen, String nameOfLeftDoor, double leftDoorChanceOfFailure,
                       boolean rightDoorIsOpen, int rightDoorTintPercentage, boolean rightDoorIsLocked, boolean rightDoorIsWorking, boolean rightDoorWindowsOpen, String nameOfRightDoor, double rightDoorChanceOfFailure,
                       String nameOfLeftSeat, boolean leftSeatIsWorking, int leftSeatBeltLengthInInches, int leftSeatReclineBackwardsInInches, double leftSeatChanceOfFailure,
                       String nameOfRightSeat, boolean rightSeatIsWorking, int rightSeatBeltLengthInInches, int rightSeatReclineBackwardsInInches, double rightSeatChanceOfFailure,
                       int maxWeightInPounds, String nameOfAxle1, boolean axle1IsWorking, double axle1ThicknessInInches, double axle1LengthInInches, String nameOfAxle2, boolean axle2IsWorking, double axle2ThicknessInInches, double axle2LengthInInches, String nameOfWheel1, int wheel1PressureInPSI, int wheel1RimDiameterInInches, boolean wheel1IsWorking, String nameOfWheel2, int wheel2PressureInPSI, int wheel2RimDiameterInInches, boolean wheel2IsWorking, String nameOfWheel3, int wheel3PressureInPSI, int wheel3RimDiameterInInches, boolean wheel3IsWorking, String nameOfWheel4, int wheel4PressureInPSI, int wheel4RimDiameterInInches, boolean wheel4IsWorking)
    {
        super( color,  nameOfCar,  typeOfCar,  fuelType,  weightInPounds,
                lengthInFeet,  maxSpeedMph,  costOfCarInDollars,  carIsWorking,
                crashPotentialPercentage,  nameOfEngine,  numberOfEngineCylinders,
                engineTemperatureInFahrenheit,  engineIsWorking,  engineChanceOfFailure,
                nameOfSteeringWheel,  steeringWheelIsWorking,  steeringWheelChanceOfFailure,
                steeringWheelType,  steeringWheelDiameterInInches,  nameOfBattery,  batteryColor,
                batteryCapacityInYears,  batteryVoltageInVolts,  batteryIsWorking,  nameOfFuelTank,
                fuelTankIsWorking,  fuelTankOilInGallons,  fuelTankCapacity,  nameOfBrake,
                brakeDiscSizeInInches,  brakePadThicknessInInches,  brakeIsWorking,
                brakeChanceOfFailure,  transmissionNumberOfPlanetGear,  transmissionNumberOfRingGear,
                transmissionNumberOfSunGear,  transmissionNumberOfPlanetaryGearSet,  transmissionGearRatio,
                transmissionAmountOfTransmissionFluidInQuarts,  transmissionValveBodyIsWorking,
                transmissionSensorIsWorking,  transmissionClutchesAndBandsIsWorking,
                transmissionTorqueConverterIsWorking,  transmissionPlanetaryGearSetIsWorking,
                transmissionSunGearIsWorking,  transmissionPlanetGearIsWorking,
                transmissionRingGearIsWorking,  transmissionPumpIsWorking,  transmissionIsWorking,
                nameOfGasPedal,  gasPedalIsWorking,  gasPedalSurfaceAreaInInches,  nameOfRadiator,
                radiatorTemperatureOfRadiatorFahrenheit,  radiatorIsWorking,
                radiatorWaterLevelInInches);
        backTrunk = new Trunk(nameOfTrunk, trunkDiameterInFeet, trunkIsWorking, trunkChanceOfFailure);
        leftDoor = new Door(  leftDoorIsOpen,   leftDoorTintPercentage,   leftDoorIsLocked,   leftDoorIsWorking,   leftDoorWindowsOpen,   nameOfLeftDoor,   leftDoorChanceOfFailure );
        rightDoor = new Door(  rightDoorIsOpen,   rightDoorTintPercentage,   rightDoorIsLocked,   rightDoorIsWorking,   rightDoorWindowsOpen,   nameOfRightDoor, rightDoorChanceOfFailure);
        leftSeat = new Seat(nameOfLeftSeat, leftSeatIsWorking, leftSeatBeltLengthInInches, leftSeatReclineBackwardsInInches, leftSeatChanceOfFailure);
        rightSeat = new Seat(nameOfRightSeat, rightSeatIsWorking, rightSeatBeltLengthInInches, rightSeatReclineBackwardsInInches, rightSeatChanceOfFailure);

        this.maxWeightInPounds = maxWeightInPounds;

        axle1 = new Axle(nameOfAxle1, axle1IsWorking, axle1ThicknessInInches, axle1LengthInInches);
        axle2 = new Axle(nameOfAxle2, axle2IsWorking, axle2ThicknessInInches, axle2LengthInInches);
        wheel1 = new Wheel(nameOfWheel1, wheel1PressureInPSI, wheel1RimDiameterInInches, wheel1IsWorking);
        wheel2 = new Wheel(nameOfWheel2, wheel2PressureInPSI, wheel2RimDiameterInInches, wheel2IsWorking);
        wheel3 = new Wheel(nameOfWheel3, wheel3PressureInPSI, wheel3RimDiameterInInches, wheel3IsWorking);
        wheel4 = new Wheel(nameOfWheel4, wheel4PressureInPSI, wheel4RimDiameterInInches, wheel4IsWorking);

    }

    public PickupTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                       double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
                       double crashPotentialPercentage, int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
                       String steeringWheelType, double steeringWheelDiameterInInches, String batteryColor,
                       int batteryCapacityInYears, double batteryVoltageInVolts, int fuelTankOilInGallons, int fuelTankCapacity,
                       int brakeDiscSizeInInches, double brakePadThicknessInInches, int transmissionNumberOfPlanetGear,
                       int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                       double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                       double gasPedalSurfaceAreaInInches, double radiatorTemperatureOfRadiatorFahrenheit,
                       double radiatorWaterLevelInches,

                       String nameOfTrunk, int trunkDiameterInFeet,  double trunkChanceOfFailure,
                       int leftDoorTintPercentage, String nameOfLeftDoor, double leftDoorchanceOfFailure,
                       int rightDoorTintPercentage, String nameOfRightDoor, double rightDoorchanceOfFailure,
                       String nameOfLeftSeat, int leftSeatBeltLengthInInches, int leftSeatReclineBackwardsInInches, double leftSeatChanceOfFailure, String nameOfRightSeat,  int rightSeatBeltLengthInInches, int rightSeatReclineBackwardsInInches, double rightSeatChanceOfFailure,
                       int maxWeightInPounds, String nameOfAxle1, double axle1ThicknessInInches, double axle1LengthInInches, String nameOfAxle2, double axle2ThicknessInInches, double axle2LengthInInches, String nameOfWheel1, int wheel1PressureInPSI, int wheel1RimDiameterInInches, String nameOfWheel2, int wheel2PressureInPSI, int wheel2RimDiameterInInches, String nameOfWheel3, int wheel3PressureInPSI, int wheel3RimDiameterInInches, String nameOfWheel4, int wheel4PressureInPSI, int wheel4RimDiameterInInches)
    {
        super( color,  nameOfCar,  typeOfCar,  fuelType,  weightInPounds,
                lengthInFeet,  maxSpeedMph,  costOfCarInDollars,  carIsWorking,
                crashPotentialPercentage,  numberOfEngineCylinders,  engineTemperatureInFahrenheit,
                steeringWheelType,  steeringWheelDiameterInInches,  batteryColor,
                batteryCapacityInYears,  batteryVoltageInVolts,  fuelTankOilInGallons,  fuelTankCapacity,
                brakeDiscSizeInInches,  brakePadThicknessInInches,  transmissionNumberOfPlanetGear,
                transmissionNumberOfRingGear,  transmissionNumberOfSunGear,  transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio,  transmissionAmountOfTransmissionFluidInQuarts,
                gasPedalSurfaceAreaInInches,  radiatorTemperatureOfRadiatorFahrenheit,
                radiatorWaterLevelInches);
        backTrunk = new Trunk(nameOfTrunk, trunkDiameterInFeet, true, trunkChanceOfFailure);
        leftDoor = new Door(true, leftDoorTintPercentage, true, true, true, nameOfLeftDoor, leftDoorchanceOfFailure);
        rightDoor = new Door(true, rightDoorTintPercentage, true, true, true, nameOfRightDoor, rightDoorchanceOfFailure);
        leftSeat = new Seat(nameOfLeftSeat, true, leftSeatBeltLengthInInches, leftSeatReclineBackwardsInInches, leftSeatChanceOfFailure);
        rightSeat = new Seat(nameOfRightSeat, true, rightSeatBeltLengthInInches, rightSeatReclineBackwardsInInches, rightSeatChanceOfFailure);

        this.maxWeightInPounds = maxWeightInPounds;

        axle1 = new Axle(nameOfAxle1, true, axle1ThicknessInInches, axle1LengthInInches);
        axle2 = new Axle(nameOfAxle2, true, axle2ThicknessInInches, axle2LengthInInches);
        wheel1 = new Wheel(nameOfWheel1, wheel1PressureInPSI, wheel1RimDiameterInInches, true);
        wheel2 = new Wheel(nameOfWheel2, wheel2PressureInPSI, wheel2RimDiameterInInches, true);
        wheel3 = new Wheel(nameOfWheel3, wheel3PressureInPSI, wheel3RimDiameterInInches, true);
        wheel4 = new Wheel(nameOfWheel4, wheel4PressureInPSI, wheel4RimDiameterInInches, true);
    }

    @Override
    public String toString(){
        String message = super.toString() + "\n";
        if(backTrunk.getIsWorking()){
            message+="The back trunk is working.\n";
        }else{
            message += "The back trunk is not working.\n";
        }
        if(leftDoor.getIsWorking()){
            message+="The left door is working.\n";
        }else{
            message += "The left door is not working.\n";
        }
        if(rightDoor.getIsWorking()){
            message+="The right door is working.\n";
        }else{
            message += "The right door is not working.\n";
        }
        if(leftSeat.getIsWorking()){
            message+="The left seat is working.\n";
        }else{
            message += "The left seat is not working.\n";
        }
        if(rightDoor.getIsWorking()){
            message+="The right seat is working.\n";
        }else{
            message += "The right seat is not working.\n";
        }
        if(axle1.getIsWorking()){
            message+="The axle1 is working.\n";
        }else{
            message += "The axle1 is not working.\n";
        }
        if(axle2.getIsWorking()){
            message+="The axle2 is working.\n";
        }else{
            message += "The axle2 is not working.\n";
        }
        if(wheel1.getIsWorking()){
            message+="The wheel1 is working.\n";
        }else{
            message += "The wheel1 is not working.\n";
        }
        if(wheel2.getIsWorking()){
            message+="The wheel2 is working.\n";
        }else{
            message += "The wheel2 is not working.\n";
        }
        if(wheel3.getIsWorking()){
            message+="The wheel3 is working.\n";
        }else{
            message += "The wheel3 is not working.\n";
        }
        if(wheel4.getIsWorking()){
            message+="The wheel4 is working.\n";
        }else{
            message += "The wheel4 is not working.\n";
        }
        return message;
    }

    @Override
    public String description(){
        String message = super.description();
        message += "The maximun weight that the pickup truck can carry is " + maxWeightInPounds + " pounds! \n";
        return message;
    }

    @Override
    public double fix(){
        double cost = super.fix();
        if(!backTrunk.getIsWorking()) {
            System.out.println(backTrunk.fix());
            cost += 200;
        }
        if(!leftDoor.getIsWorking()) {
            System.out.println(leftDoor.fix());
            cost += 100;
        }
        if(!rightDoor.getIsWorking()) {
            System.out.println(rightDoor.fix());
            cost += 200;
        }
        if(!leftSeat.getIsWorking()) {
            System.out.println(leftSeat.fix());
            cost += 200;
        }
        if(!rightSeat.getIsWorking()) {
            System.out.println(rightSeat.fix());
            cost += 100;
        }
        if(!axle1.getIsWorking()) {
            System.out.println(axle1.fix());
            cost += 100;
        }
        if(!axle2.getIsWorking()) {
            System.out.println(axle2.fix());
            cost += 100;
        }
        if(!wheel1.getIsWorking()) {
            System.out.println(wheel1.fix());
            cost += 200;
        }
        if(!wheel2.getIsWorking()) {
            System.out.println(wheel2.fix());
            cost += 200;
        }
        if(!wheel3.getIsWorking()) {
            System.out.println(wheel3.fix());
            cost += 200;
        }
        if(!wheel4.getIsWorking()) {
            System.out.println(wheel4.fix());
            cost += 200;
        }
        System.out.println("This " + getNameOfCar() + " is now working and every part repaired the total cost is: " + cost +".");
        return cost;
    }

    public String damage(){
        setCarIsWorking(false);
        System.out.println(backTrunk.damage());
        System.out.println(leftDoor.damage());
        System.out.println(rightDoor.damage());
        System.out.println(leftSeat.damage());
        System.out.println(rightSeat.damage());
        System.out.println(axle1.damage());
        System.out.println(axle2.damage());
        System.out.println(wheel1.damage());
        System.out.println(wheel2.damage());
        System.out.println(wheel3.damage());
        System.out.println(wheel4.damage());
        return "This " + getNameOfCar() + " is now not working and back trunk, doors, axles, and wheels are damaged!";
    }

    @Override
    public void calculateFailRateOfParts(double speedInMph){
        super.calculateFailRateOfParts(speedInMph);
        backTrunk.calculateChanceOfFailure(speedInMph);
        leftDoor.calculateChanceOfFailure(speedInMph);
        rightDoor.calculateChanceOfFailure(speedInMph);
        leftSeat.calculateChanceOfFailure(speedInMph);
        rightSeat.calculateChanceOfFailure(speedInMph);
        axle1.calculateChanceOfFailure(speedInMph);
        axle2.calculateChanceOfFailure(speedInMph);
        wheel1.calculateChanceOfFailure(speedInMph);
        wheel2.calculateChanceOfFailure(speedInMph);
        wheel3.calculateChanceOfFailure(speedInMph);
        wheel4.calculateChanceOfFailure(speedInMph);

    }

    @Override
    public boolean drive(){
        return drive(60);
    }

    @Override
    public boolean drive(double mph){
        super.drive(mph);
        if((Math.random()*100)+1<=calculateCrashRate(mph)) {
            wheel1.damage();
            wheel2.damage();
            wheel3.damage();
            wheel4.damage();
            axle1.damage();
            axle2.damage();
            return false;
        }
        return true;
    }

    @Override
    public boolean action1(){
        carryStuff();
        return getCarIsWorking();
    }

    @Override
    public boolean action2(){
        doDonut();
        return getCarIsWorking();
    }

    public void carryStuff(){
        if(drive()){
            backTrunk.action1();
            if(backTrunk.getIsWorking()){
                System.out.println("The back trunk opens.");
                int weightOfStuffInPounds = (int)(Math.random() * 2000) + 1;
                if (weightOfStuffInPounds > maxWeightInPounds){
                    backTrunk.setIsWorking(false);
                    System.out.println("The back trunk is broken because the stuff is too heavy.");
                }else{
                    System.out.println("The pickup truck carries stuff.");
                }
            }
            else{
                System.out.println("The back trunk is broken. The pickup truck cannot carry stuff anymore.");
            }
        }else{
            System.out.println("The pickup truck is not working. ");
        }
    }

    public void doDonut(){
        if(getCarIsOn()&&getCarIsWorking()){
            wheel1.action1();
            wheel2.action1();
            wheel3.action1();
            wheel4.action1();
            if(wheel1.getIsWorking() && wheel2.getIsWorking() && wheel3.getIsWorking() && wheel4.getIsWorking()){
                System.out.println("The pickup truck does donut!");
            }
            else{
                System.out.println("Some of the wheels aren't working. The pickup truck cannot do donut.");
            }
        }else{
            System.out.println("The pickup truck failed to do donut.");
        }
    }

    public Trunk getBackTrunk(){
        return backTrunk;
    }

    public Door getLeftDoor(){
        return leftDoor;
    }

    public Door getRightDoor(){
        return rightDoor;
    }

    public Seat getLeftSeat(){
        return leftSeat;
    }

    public Seat getRightSeat(){
        return rightSeat;
    }

    public Axle getAxle1(){
        return axle1;
    }

    public Axle getAxle2(){
        return axle2;
    }

    public Wheel getWheel1(){
        return wheel1;
    }

    public Wheel getWheel2(){
        return wheel2;
    }

    public Wheel getWheel3(){
        return wheel3;
    }

    public Wheel getWheel4(){
        return wheel4;
    }

    public int getMaxWeightInPounds(){
        return maxWeightInPounds;
    }

    public void setMaxWeightInPounds(int mw){
        maxWeightInPounds = mw;
    }
}