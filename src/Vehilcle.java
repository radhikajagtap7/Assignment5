public abstract class Vehilcle {
    private String passingNo;
    private String manufacturer;

    public Vehilcle(String passingNo, String manufacturer) {
        if (passingNo.length() <= 10) {
            this.passingNo = passingNo;
        }
        this.manufacturer = manufacturer;
    }

    public void setPassingNo(String passingNo) {
        this.passingNo = passingNo;
    }

    public String getPassingNo() {
        return passingNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void display(){
        System.out.println(" Passing No : " + passingNo + " Manufacturer : " + manufacturer);
    }

     public abstract void start();
    public abstract void stop();
    public abstract void move();

}
