public class TeacherBatch {
    private Teacher teachers[] = new Teacher[10];
    private static int teacherCount=0;
    public String background;

    public TeacherBatch(){
    }
    public void add(Teacher s, int i){
        teachers[i] = s;
        teacherCount++;
    }
    public static int getTeacherCount(){
        return teacherCount;
    }

    public void remove(Teacher s){
        // Find index of object to remove
        int indexToRemove = -1;
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equals(s)) {
                indexToRemove = i;
                break;
            }
        }
        // If the object to remove was found, create new array without it
        if (indexToRemove != -1) {
            Teacher[] newTeacher = new Teacher[teacherCount - 1];
            for (int i = 0, j = 0; i < teacherCount; i++) {
                if (i != indexToRemove) {
                    newTeacher[j++] = teachers[i];
                }
            }
            // Set original array to new array
            teachers = newTeacher;
        }
    }
}
