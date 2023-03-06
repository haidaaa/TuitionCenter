import java.time.LocalDate;

public class Teacher {
    // data
    static Name name;
    String IC;
    Address address;
    static int numYearsExp;
    static String qualification;
    String dateJoined;
    static String background;
    public Teacher(){
    }

    // operation
    public void setName(Name thename){
        name = thename;
    }
    public void setIC (String IC){
        this.IC = IC;
    }
    public void setAddress(Address theAddress){
        address=theAddress;
    }
    public void setNumYearsExp (int yearsExp){
        numYearsExp = yearsExp;
    }
    public void setQualification (String qualification){
        this.qualification = qualification;
    }
    public void setDateJoined (String date){
        dateJoined=date;
    }

    public Name getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public Address getAddress() {
        return address;
    }

    public float getNumYearsExp() {
        return numYearsExp;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDateJoined() {
        return dateJoined;
    }
    public static String bground() {
        background = (" have " + numYearsExp +" years of experience with "+ qualification);
        return background;
    }
}