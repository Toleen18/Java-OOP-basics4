import java.util.Arrays;

public class Phone{
    private String brand;
    private String model;
    private double price;
    private int year;
    private boolean isOn;
    private boolean isLocked;
    private boolean isSmart;
    private char size;
    private String [] features; // add different 5 features

    public void setBrand (String brand){
        if(brand != null){
            this.brand = brand;
        } else {
            System.out.println("Error");
        }
    }
    public String getBrand(){
        return brand;
    }

    //
    public void setModel (String model){
        if(brand != null){
            this.brand = brand;
        } else {
            System.out.println("Error");
        }
    }
    public String getModel(){
        return model;
    }

    //
    public void setPrice(double price){
        if(price >0 ){
            this.price = price;
        } else {
            System.out.println("Error");
        }
    }
    public double getPrice (){
        return price;
    }

    //
    public void setYear(int year){
        if(year >=2000){
            this.year=year;
        } else {
            System.out.println("Error");
        }
    }
    public int getYear(){
        return year;
    }

    //
    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean getIsOn(){
        return isOn;
    }
    public void setLocked (boolean isLocked){
        this.isLocked = isLocked;
    }
    public boolean getLocked (){
        return isLocked;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
    public boolean geTSmart() {
        return isSmart;
    }

    //
    public void setSize(char size){
        if(size == 'S'||size== 's'||size== 'M'||size== 'm'||size== 'L'||size== 'l'){
            this.size= size;
        } else {
            System.out.println("Error");
        }
    }
    public char getSize(){
        return size;
    }


    public void setFeatures(String [] features){
        this.features = features;
    }
    public String[] getFeatures() {
        return features;
    }


    // constructor with features :
    public Phone (String brand , String model , double price , int year , boolean isOn , boolean isLocked , boolean isSmart , char size, String [] features){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.isOn = isOn;
        this.isLocked = isLocked;
        this.isSmart = isSmart;
        this.size = size;
        this.features = features;
    }

    // toString
    public String toString (){
        return "Phone { brand :"+brand + "\n"
                + "model :"+model+"\n"
                +"price :"+price+"\n"
                +"Year :"+year + "\n"
                +"is On :"+isOn+"\n"
                +"is Locked :"+isLocked +"\n"
                +"is smart :"+isSmart + "\n"
                +"size :"+size + "\n"
                +"Features :"+ Arrays.toString(features)+"}"+"\n"+
                makeCall("0502121");
    }

    // Function :

    public boolean powerOn (boolean isOn){
        isOn = true;
        System.out.println("Power on ");
        return isOn;
    }

    public boolean powerOff (boolean is){
        isOn = false;
        System.out.println("Power off ");
        return isOn;
    }

    public boolean isUnLocke(boolean isLocked) {
        isLocked = true;
        System.out.println("UnLocke Phone");
        return isLocked;
    }
    public boolean isLock(boolean isLocked) {
        isLocked = false;
        System.out.println("Locked Phone");
        return isLocked;
    }
    public String makeCall (String number){
        if(isOn==true&&isLocked==false){
            number="Calling : "+number;
        } else {
           number = "Cannot make a call – phone is locked or off.";
        }
        return number;
    }
}