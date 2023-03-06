public class TuitionCenter {
    public Address address;

    public TuitionCenter() {
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void report(){
        StudentBatch numberstud = new StudentBatch();
        System.out.println("Number of student = "+numberstud.getStudCount());
        TeacherBatch numberteacher = new TeacherBatch();
        System.out.println("Number of teachers = "+numberteacher.getTeacherCount());
        System.out.println("Teacher's background = " + Teacher.name.getName() + Teacher.bground());
        float Average = numberstud.calcAvg();
        float Minimum = numberstud.calcMin();
        float Maximum = numberstud.calcMax();
        System.out.println("Average marks = "+Average);
        System.out.println("Minimum marks = "+Minimum);
        System.out.println("Maximum marks = "+Maximum);
    }
}
