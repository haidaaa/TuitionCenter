
public class Name{

    private String fname;
    private String lname;
    private String mname;


    //contructor
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public Name(){

    }

    public void setFName(String fname){
        this.fname = fname;
    }
    public String getFname(){
        return fname;
    }
    public void setMName(String mname){

        this.mname = mname;
    }
    public String getMname(){

        return mname;
    }
    public void setLName(String lname){

        this.lname = lname;
    }
    public String getLname(){

        return lname;
    }
    public String getName(){
        return fname+" "+mname+" "+lname;
    }

}