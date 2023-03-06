// application team in UTP

public class Main
{
    // application code
    public static void main(String[] args) throws Exception {

        Headmaster Amin = new Headmaster();
        Name name = new Name();
        name.setFName("Muhammad");
        name.setMName("Amin");
        name.setLName("Jalal");
        Amin.setName(name);
        TuitionCenter Perak = new TuitionCenter();
        Address address = new Address();
        address.setFirstLine("Lot 14, Jalan Setimpa 5,");
        address.setSecLine("Taman Maju Jaya, Seri Iskandar");
        address.setThirdLine("15423, Perak");
        Perak.setAddress(address);

        Teacher Kamariah = new Teacher();
        Name teachername = new Name();
        teachername.setFName("Kamariah");
        teachername.setMName("binti");
        teachername.setLName("Jamaludin");
        Kamariah.setName(teachername);
        Kamariah.setIC("720101-00-0000");
        address = new Address();
        address.setFirstLine("Lot 14, Jalan Setimpa 5,");
        address.setSecLine("Taman Maju Jaya, Seri Iskandar");
        address.setThirdLine("15423, Perak");
        Kamariah.setAddress(address);
        Kamariah.setQualification("Degree in Education of Mathematics");
        Kamariah.setNumYearsExp(7);

        Student Haiza = new Student();
        Name studname = new Name();
        studname.setFName("Haiza");
        studname.setMName("Fadhilah");
        studname.setLName("Kamal");
        Haiza.setName(studname);
        Haiza.setIC("000101-00-0000");
        Haiza.setSchoolname("Sekolah Menengah Seri Puteri");
        address = new Address();
        address.setFirstLine("No 14, Jalan Alam 5,");
        address.setSecLine("Teluk Bagan, Ipoh, ");
        address.setThirdLine("13652, Perak");
        Haiza.setAddress(address);
        Haiza.setTeacher(Kamariah);
        Haiza.setMarks(95.6f);

        Student Alya = new Student();
        Name studname1 = new Name();
        studname1.setFName("Nurin");
        studname1.setMName("Alya");
        studname1.setLName("Zahrin");
        Alya.setName(studname1);
        Alya.setIC("000202-00-0002");
        Alya.setSchoolname("Sekolah Seri Puteri");
        address = new Address();
        address.setFirstLine("No 25, Jalan Alam 6,");
        address.setSecLine("Teluk Bagan, Ipoh, ");
        address.setThirdLine("13652, Perak");
        Alya.setAddress(address);
        Alya.setTeacher(Kamariah);
        Alya.setMarks(97.6f);

        Student Farrah = new Student();
        Name studname2 = new Name();
        studname2.setFName("Farrah");
        studname2.setMName("Wahida");
        studname2.setLName("Baharuddin");
        Farrah.setName(studname2);
        Farrah.setIC("000303-00-0003");
        Farrah.setSchoolname("Sekolah Menengah Seri Iskandar");
        address = new Address();
        address.setFirstLine("No 50, Jalan Alam 9,");
        address.setSecLine("Teluk Bagan, Ipoh, ");
        address.setThirdLine("13652, Perak");
        Farrah.setAddress(address);
        Farrah.setTeacher(Kamariah);
        Farrah.setMarks(85.3f);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(Haiza,0);
        sb2023.add(Alya,1);
        sb2023.add(Farrah,2);
        TeacherBatch tb2023 = new TeacherBatch();
        tb2023.add(Kamariah,0);

        // declare a method that allows for the following:
        boolean isIn = sb2023.find(name);

        TuitionCenter report = new TuitionCenter();
        report.report();

    }
}