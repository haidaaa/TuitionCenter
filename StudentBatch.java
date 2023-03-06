//class for list of students

public class StudentBatch { // list of student registered - array of Student
    // data/attributes
    private Student students[] = new Student[10];
    private static int studCount=0;

    public StudentBatch(){
    }
    public void add(Student s, int i){

        students[i] = s;
        studCount++;
    }
    public static int getStudCount(){

        return studCount;
    }
    // Operation

    public void remove(Student s){
        // Find index of object to remove
        int indexToRemove = -1;
        for (int i = 0; i < studCount; i++) {
            if (students[i].equals(s)) {
                indexToRemove = i;
                break;
            }
        }
        // If the object to remove was found, create new array without it
        if (indexToRemove != -1) {
            Student[] newStudent = new Student[studCount - 1];
            for (int i = 0, j = 0; i < studCount; i++) {
                if (i != indexToRemove) {
                    newStudent[j++] = students[i];
                }
            }
            // Set original array to new array
            students = newStudent;
        }
    }

    // find particular student
    public boolean find(Name name){
        //look thru array of student - check same name in Student
        for (int i = 0; i<studCount; i++){
            if (students[i].name==name){
                return true;
            }
        }
        return false;
    }
    public float calcMin(){
        float lowest = 99999;
        for (int i=0; i<studCount; i++){
            if (students[i].getMarks() <lowest){
                lowest = students[i].getMarks();
            }
        }
        return lowest;
    }
    public float calcAvg(){
        float total =0;
        for(int i=0; i<studCount;i++){
            total = total + students[i].getMarks();
        }
        float avg = total/studCount;
        return avg;
    }
    public float calcMax(){
        float highest = 0;
        for (int i=0; i<studCount; i++){
            if (students[i].getMarks() >highest){
                highest = students[i].getMarks();
            }
        }
        return highest;
    }
}