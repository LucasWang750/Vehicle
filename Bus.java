public class Bus extends Vehicle {
    private Radio radio;
    private Headlight headlight1;
    private Headlight headlight2;
    private Door[] doors;
    private Wheel[] wheels;
    private Axle[] axles;
    private Seat[] seats;

    public Bus(
            // Vehicle Stuff
            String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
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
            // Add everything here below
            // AXLE PARAM
            int numberOfAxles, double axleThicknessInInches, double axleLengthInInches, boolean axleIsWorking,
            String nameOfAxles,
            // SEATS
            int numberOfSeats, String seatNameOfComponent, boolean seatIsWorking, int seatBeltLengthInInches,
            // Doors
            int numberOfDoors, boolean doorIsOpen, int doorTintPercentage, boolean doorIsLocked, boolean doorIsWorking,
            String nameOfDoor, boolean doorIsWindowOpen,
            // Wheels
            int numberOfWheels, String nameOfWheels, int wheelPressureInPSI, int wheelRimDiameterInInches,
            boolean wheelIsWorking,
            // Bus Stuff
            int radioNumberOfSpeaker, boolean radioCircuitBoardIsWorking, boolean radioSpeakerIsWorking, boolean radioIsWorking,String radioNameOfComponent,
            // Headlights
            String headlightType, String headlightColor, double headlightLengthInInches, double headLightWindowLengthInInches,
            boolean headlightIsWorking, String headlightName) {
        // SUPER
        super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph, costOfCarInDollars,
                carIsWorking, crashPotentialPercentage, nameOfEngine, numberOfEngineCylinders, engineTemperatureInFahrenheit,
                engineIsWorking,engineChanceOfFailure, nameOfSteeringWheel, steeringWheelIsWorking,steeringWheelChanceOfFailure, steeringWheelType, steeringWheelDiameterInInches,
                nameOfBattery, batteryColor, batteryCapacityInYears, batteryVoltageInVolts, batteryIsWorking, nameOfFuelTank,
                fuelTankIsWorking, fuelTankOilInGallons, fuelTankCapacity, nameOfBrake, brakeDiscSizeInInches,
                brakePadThicknessInInches, brakeIsWorking,brakeChanceOfFailure, transmissionNumberOfPlanetGear, transmissionNumberOfRingGear,
                transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
                transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking, transmissionSensorIsWorking,
                transmissionClutchesAndBandsIsWorking, transmissionTorqueConverterIsWorking,
                transmissionPlanetaryGearSetIsWorking, transmissionSunGearIsWorking, transmissionPlanetGearIsWorking,
                transmissionRingGearIsWorking, transmissionPumpIsWorking, transmissionIsWorking, nameOfGasPedal,
                gasPedalIsWorking, gasPedalSurfaceAreaInInches, nameOfRadiator, radiatorTemperatureOfRadiatorFahrenheit,
                radiatorIsWorking, radiatorWaterLevelInInches);
        doors = new Door[numberOfDoors];
        for (int i = 0; i < numberOfDoors; i++) {
            String number = "" + (i + 1);
            doors[i] = new Door(doorIsOpen, doorTintPercentage, doorIsLocked, doorIsWorking,doorIsWindowOpen, nameOfDoor + number);
        }
        wheels = new Wheel[numberOfWheels];
        for (int i = 0; i < numberOfWheels; i++) {
            String number = "" + (i + 1);
            wheels[i] = new Wheel(nameOfWheels + number, wheelPressureInPSI, wheelRimDiameterInInches, wheelIsWorking);
        }

        axles = new Axle[numberOfAxles];
        for (int i = 0; i < numberOfAxles; i++) {
            String number = "" + (i + 1);
            axles[i] = new Axle(nameOfAxles + number, axleIsWorking, axleThicknessInInches, axleLengthInInches);
        }

        seats = new Seat[numberOfSeats];
        for (int i = 0; i < numberOfSeats; i++) {
            String number = "" + (i + 1);
            seats[i] = new Seat(seatNameOfComponent+number, seatIsWorking, seatBeltLengthInInches,12,0);
        }
        this.radio = new Radio(radioNumberOfSpeaker,radioIsWorking,radioCircuitBoardIsWorking,radioIsWorking,radioNameOfComponent,0);
        this.headlight1 = new Headlight(headlightName + "1", headlightIsWorking,0, headlightType, headlightColor,
                headlightLengthInInches, headLightWindowLengthInInches);
        this.headlight2 = new Headlight(headlightName + "2", headlightIsWorking,0, headlightType, headlightColor,
                headlightLengthInInches, headLightWindowLengthInInches);
    }

    public Bus(
            // Vehicle Stuff
            String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
            double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
            double crashPotentialPercentage, int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
            String steeringWheelType, double steeringWheelDiameterInInches, String batteryColor,
            int batteryCapacityInYears, double batteryVoltageInVolts, int fuelTankOilInGallons, int fuelTankCapacity,
            int brakeDiscSizeInInches, double brakePadThicknessInInches, int transmissionNumberOfPlanetGear,
            int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
            double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
            double gasPedalSurfaceAreaInInches, double radiatorTemperatureOfRadiatorFahrenheit,
            double radiatorWaterLevelInches,
            // Add everything here below
            // AXLE PARAM
            int numberOfAxles, double axleThicknessInInches, double axleLengthInInches,

            // SEATS
            int numberOfSeats, int seatBeltLengthInInches,
            // Doors
            int numberOfDoors, boolean doorIsOpen, int doorTintPercentage, boolean doorIsLocked,boolean doorWindowIsOpen,

            // Wheels
            int numberOfWheels, int wheelPressureInPSI, int wheelRimDiameterInInches,

            // Bus Stuff
            int radioNumberOfSpeaker,
            // Headlights
            String headlightType, String headlightColor, double headlightLengthInInches, double headLightWindowLengthInInches) {
        // SUPER
        super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph, costOfCarInDollars,
                carIsWorking, crashPotentialPercentage,  numberOfEngineCylinders, engineTemperatureInFahrenheit,
                steeringWheelType, steeringWheelDiameterInInches,
                batteryColor, batteryCapacityInYears, batteryVoltageInVolts,
                fuelTankOilInGallons, fuelTankCapacity,  brakeDiscSizeInInches,
                brakePadThicknessInInches, transmissionNumberOfPlanetGear, transmissionNumberOfRingGear,
                transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
                transmissionAmountOfTransmissionFluidInQuarts, gasPedalSurfaceAreaInInches,  radiatorTemperatureOfRadiatorFahrenheit,
                radiatorWaterLevelInches);
        doors = new Door[numberOfDoors];
        for (int i = 0; i < numberOfDoors; i++) {
            String number = "" + (i + 1);
            doors[i] = new Door(doorIsOpen, doorTintPercentage, doorIsLocked, true,doorWindowIsOpen, "Door" + number);
        }
        wheels = new Wheel[numberOfWheels];
        for (int i = 0; i < numberOfWheels; i++) {
            String number = "" + (i + 1);
            wheels[i] = new Wheel("Wheel" + number, wheelPressureInPSI, wheelRimDiameterInInches, true);
        }

        axles = new Axle[numberOfAxles];
        for (int i = 0; i < numberOfAxles; i++) {
            String number = "" + (i + 1);
            axles[i] = new Axle("Axle" + number, true, axleThicknessInInches, axleLengthInInches);
        }

        seats = new Seat[numberOfSeats];
        for (int i = 0; i < numberOfSeats; i++) {
            String number = "" + (i + 1);
            seats[i] = new Seat("Seat" + number, true, seatBeltLengthInInches,12,0);
        }
        this.radio = new Radio(radioNumberOfSpeaker, true, true,
                true, "Radio",0);
        this.headlight1 = new Headlight("headlight1", true,0, headlightType, headlightColor,
                headlightLengthInInches, headLightWindowLengthInInches);
        this.headlight2 = new Headlight("headlight2", true,0, headlightType, headlightColor,
                headlightLengthInInches, headLightWindowLengthInInches);
    }


    @Override
    public boolean action1() {
        return transport();
    }

    @Override
    public boolean action2() {

        return turn();
    }
    public boolean getWheelsIsWorking(){
        boolean wheelsIsWorking=true;
        for(Wheel w:wheels){
            if(!w.getIsWorking()){
                wheelsIsWorking=false;
            }
        }
        return wheelsIsWorking;
    }
    public boolean getAxlesIsWorking(){
        boolean axlesIsWorking=true;
        for(Axle a:axles){
            if(!a.getIsWorking()){
                axlesIsWorking=false;
            }
        }
        return axlesIsWorking;
    }

    public boolean transport(){
        if(getCarIsWorking()){
            //Initiate Engine
            if(getEngine().getIsWorking()){
                getEngine().calculateChanceOfFailure(60,0.03);
                getEngine().action1();
                System.out.println( "The engine in Bus,"+getNameOfCar()+", is generating power.");
                if(!getEngine().getIsWorking()){
                    System.out.println("The engine in Bus,"+getNameOfCar()+", has stopped working.");
                }
                if(getWheelsIsWorking()&&getAxlesIsWorking()){
                    for(Wheel w:wheels){
                        w.calculateChanceOfFailure(60,0.03);
                        w.action1();
                    }
                    for(Axle a:axles){
                        a.calculateChanceOfFailure(60,0.03);
                        a.action1();
                    }
                    System.out.println( "The wheels in Bus, "+getNameOfCar()+", are moving.");
                    if(!getEngine().getIsWorking()){
                        System.out.println("The wheels in Bus, "+getNameOfCar()+", have stopped working.");
                        return true;
                    }
                }else{
                    System.out.println("The wheels in Bus, "+getNameOfCar()+", have stopped working.");
                    return false;
                }

            } else{
                System.out.println( "The engine in "+getNameOfCar()+" is broken.");
                return false;
            }
        }
        else{
            System.out.println(   "The bus, "+getNameOfCar()+", has broken down.");
            return false;
        }
        return false;
    }

    public boolean turn() {
        if(getCarIsOn()){
            if(getGasPedal().getIsWorking()){
                getGasPedal().calculateChanceOfFailure(60,0.03);
                getGasPedal().action1();
                if(getGasPedal().getIsWorking()){
                    System.out.println("You step on the gas pedal on the Bus, "+getNameOfCar()+", and move foward");
                } else{
                    System.out.println("You step on the gas pedal on the Bus, "+getNameOfCar()+", and break them.");
                    return false;
                }
                if(getBrake().getIsWorking()){
                    getBrake().calculateChanceOfFailure(60,0.03);
                    getBrake().action1();
                    if(getBrake().getIsWorking()){
                        System.out.println("You step on the brakes on the Bus, "+getNameOfCar()+", and turn without crashing");
                        return true;
                    } else{
                        System.out.println("You step on the brakes on the Bus, "+getNameOfCar()+", and break them.");
                        return false;
                    }
                } else{
                    System.out.println("The brakes on Bus, "+getNameOfCar()+", are not working.");
                    return false;
                }
            } else{
                System.out.println("The gas pedal on Bus, "+getNameOfCar()+", is not working.");
                return false;
            }
        } else{
            System.out.println(   "The bus, "+getNameOfCar()+", has broken down.");
            return false;
        }
    }

    @Override
    public String toString() {
        String message = "Bus: " + getNameOfCar() + " Statistics";
        message += super.toString();
        message += "There are " + axles.length + " axles\n.";
        for (Axle a : axles) {
            message += a.toString() + "\n";
        }
        message += "There are " + doors.length + " doors\n";
        for (Door d : doors) {
            message += d.getNameOfComponent() + " is ";
            if (d.getIsWorking()) {
                message += "working.\n";
            } else {
                message += "not working.\n";
            }
        }
        message += "There are " + wheels.length + " wheels\n";
        for (Wheel w : wheels) {
            message += w.toString() + "\n";
        }
        message += "There are " + seats.length + " seats.\n";
        for (Seat s : seats) {
            message += "This " + s.getNameOfComponent() + " is " + s.getSeatBeltLengthInInches() + " inches long.\n";
        }
        message += headlight1.toString() + "\n";
        message += headlight2.toString() + "\n";
        message += "This radio has " + radio.getNumberOfSpeaker() + " and is ";
        if (radio.getIsWorking()) {
            message += "working.\n";
        } else {
            message += "not working.\n";
        }
        return message;
    }

    public String damageAll() {

        for (Door d : doors) {
            d.damage();
        }
        for (Wheel t : wheels) {
            t.damage();
        }
        for (Axle w : axles) {
            w.damage();
        }
        for (Seat s : seats) {
            s.damage();
        }
        headlight1.damage();
        headlight2.damage();
        radio.damage();
        return super.damage();

    }

    public double fix(){
        for (Door d : doors) {
            if (d.getIsWorking())
                System.out.println(d.fix());
        }
        for (Wheel t : wheels) {
            if (t.getIsWorking())
                System.out.println(t.fix());
        }
        for (Axle w : axles) {
            if (w.getIsWorking())
                System.out.println(w.fix());
        }
        for (Seat s : seats) {
            if (s.getIsWorking())
                System.out.println(s.fix());
        }
        if (headlight1.getIsWorking()) {
            System.out.println(headlight1.fix());
        }
        if (headlight2.getIsWorking()) {
            System.out.println(headlight2.fix());
        }
        if (radio.getIsWorking()) {
            System.out.println(radio.fix());
        }
        return super.fix();
    }

    @Override
    public boolean drive(double mph) {
        if (!getCarIsWorking()) {
            System.out.println("This Bus," + getNameOfCar() + ", is not working and you cannot drive it.");
            return false;
        }
        if (!getCarIsOn() || !(getSteeringWheel().getIsWorking())) {
            System.out.println("This Bus," + getNameOfCar() + ", cannot drive because of certain part failures or it didn't start");
            return false;
        } else if (mph > getMaxSpeedMph()) {
            System.out.println("You attempt to drive the bus at a high speed. Crash potential increased. ");
        }
        if ((Math.random() * 100) + 1 <= calculateCrashRate(mph)) {
            System.out.println("You attempt to drive the bus at a high speed. Your " + getNameOfCar() + " is now damaged");
            for (CarComponent i : arr) {
                i.damage();

            }
            damageAll();
            setCarIsWorking(false);
            setCarIsOn(false);
            return false;
        }
        return true;
    }
    @Override
    public String description(){
        String message="Bus: " + getNameOfCar() + " Statistics\n";
        message += super.description();
        message+="This Bus's headlights are"+headlight1.getColor()+" and "+headlight2.getColor()+".";
        return message;
    }

    @Override
    public void calculateFailRateOfParts(double mph){
        super.calculateFailRateOfParts(mph);
        radio.calculateChanceOfFailure(mph);
        headlight1.calculateChanceOfFailure(mph);
        headlight2.calculateChanceOfFailure(mph);
        for (Door d : doors) {
            d.calculateChanceOfFailure(mph);
        }
        for (Wheel t : wheels) {
            t.calculateChanceOfFailure(mph);
        }
        for (Axle w : axles) {
            w.calculateChanceOfFailure(mph);
        }
        for (Seat s : seats) {
            s.calculateChanceOfFailure(mph);
        }
    }
    public Radio getRadio() {
        return this.radio;
    }

    public Headlight getHeadlight1() {
        return this.headlight1;
    }

    public Headlight getHeadlight2() {
        return this.headlight2;
    }
}