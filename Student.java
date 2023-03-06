
//created by team in KL
public class Student {
    // data/attributes
    public Name name;
    public String IC;
    public Address address;
    public String schoolname;
    public Teacher teacher;
    private float marks;

    public Student(){
    }

    // methods / operations
    public void setName(Name thename){

        name = thename;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    public void setSchoolname(String schoolname) {

        this.schoolname = schoolname;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

}
