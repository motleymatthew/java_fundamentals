package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    private short year;

    public Airplane(double fuelCapacity, double currentFuelLevel, short year) {
        this.fuelCapacity = 120;
        this.currentFuelLevel = 79.9;
        this.year = 2001;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    public short getYear() {
        return year;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
    public void setYear(short year) {
        this.year = year;
    }

    public String toString(){
        return "This "+year+" aircraft has a "+fuelCapacity+" gallon fuel capacity and currently the level is "+currentFuelLevel+" or "+(currentFuelLevel/fuelCapacity)*100+"% remaining.";
    }

    public static void main(String[] args) {
        Airplane ap = new Airplane(100.0, 25.7,(short)1988);
        System.out.println(ap.toString());
        Fuselage fl = new Fuselage("bread",124.6,77.3,(short)5000,"Yellow");
        System.out.println(fl.toString());
        Instruments ins = new Instruments(true,false,true,false);
        System.out.println(ins.toString());
        AirEngine AE = new AirEngine((short)1,(byte)1);
        System.out.println(AE.toString());
        Interior interior = new Interior((byte)8,(short)1500);
        System.out.println(interior.toString());
    }
}
class Fuselage {
    private String material;
    private double length;
    private double wingspan;
    private short payload;
    private String color;

    public Fuselage(String material, double length, double wingspan, short payload, String color) {
        this.material = "rust";
        this.length = 200;
        this.wingspan = 150.5;
        this.payload = 4000;
        this.color = "green";
    }

    public String getMaterial(){
        return material;
    }
    public double getLength(){
        return length;
    }
    public double getWingspan() {
        return wingspan;
    }
    public short getPayload() {
        return payload;
    }
    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    public void setPayload(short payload) {
        this.payload = payload;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "SPECS- Material: "+material+" Length: "+length+" Wingspan: "+wingspan+" Payload: "+payload+" Color: "+color;
    }
}

class Instruments {
    private boolean altimeter;
    private boolean airspeedIndicator;
    private boolean turnBank;
    private boolean headingGyro;

    public Instruments (boolean altimeter,boolean airspeedIndicator,boolean turnBank,boolean headingGyro){
        this.altimeter = true;
        this.airspeedIndicator = false;
        this.turnBank = true;
        this.headingGyro = true;
    }

    public boolean getAltimeter(){
        return altimeter;
    }
    public boolean getAirSpeedIndicator(){
        return airspeedIndicator;
    }
    public boolean getTurnBank(){
        return turnBank;
    }
    public boolean getHeadingGyro(){
        return headingGyro;
    }

    public void setAltimeter(boolean altimeter) {
        this.altimeter = altimeter;
    }
    public void setAirspeedIndicator(boolean airspeedIndicator) {
        this.airspeedIndicator = airspeedIndicator;
    }
    public void setTurnBank(boolean turnBank) {
        this.turnBank = turnBank;
    }
    public void setHeadingGyro(boolean headingGyro) {
        this.headingGyro = headingGyro;
    }
    public String toString(){
        return "The aircraft has a number of instruments: Altimiter: "+altimeter+", Air Speed Indicator: "+airspeedIndicator+", Turn Bank: "+turnBank+", Heading Gyro: "+headingGyro;
    }
}
class AirEngine {
    private short horsepower;
    private byte cylinders;

    public AirEngine(short horsepower, byte cylinders){
        this.horsepower = 575;
        this.cylinders = 10;
    }

    public short getHorsepower() {
        return horsepower;
    }
    public byte getCylinders() {
        return cylinders;
    }

    public void setHorsepower(short horsepower) {
        this.horsepower = horsepower;
    }

    public void setCylinders(byte cylinders) {
        this.cylinders = cylinders;
    }
    public String toString(){
        return "The engine produces: "+horsepower+" horsepower with "+cylinders+" cylinders.";
    }
}
class Interior{
    private byte seats;
    private short weightCapacity;

    public Interior(byte seats,short weightCapacity){
        this.seats = 6;
        this.weightCapacity = 1700;
    }

    public short getSeats() {
        return seats;
    }
    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }
    public void setWeightCapacity(short weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public String toString(){
        return "The weight capacity is: "+weightCapacity+" with "+seats+" passengers and luggage.";
    }
}
class Pojo{
    String message;
    boolean wrong;
    int numbers;

    public Pojo(String pounds, boolean wrong, int numbers){
        this.message = "nice";
        this.wrong = true;
        this.numbers = 32453;
    }
    public Pojo(){
        System.out.println("Message = "+message);
    }
    public Pojo(int numbers){
        this.numbers = 5555;
    }
}
