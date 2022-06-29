public class Record {

    private int ID;
    private String name;
    private String phoneNumber;

    public Record(int ID,String name, String phoneNumber){
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " ID: " + this.ID + " phoneNumber: " + this.phoneNumber;
    }


    public boolean equalName(String obj) {
        return obj.equals(this.name);
    }

    public boolean equalPhoneNumber(String obj) {
        return obj.equals(this.phoneNumber);
    }

    public boolean equalID(int obj) {
        return this.ID == obj;
    }


}
