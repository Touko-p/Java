package DayTest;

public class Student {
    private String Sno;
    private String Sname;
    public Student() {
        super();
    }
    public Student(String sno, String sname) {
        super();
        Sno = sno;
        Sname = sname;
    }
    public String getSno() {
        return Sno;
    }
    public void setSno(String sno) {
        Sno = sno;
    }
    public String getSname() {
        return Sname;
    }
    public void setSname(String sname) {
        Sname = sname;
    }
    @Override
    public String toString() {
        return "学生[学号：" + Sno + ", 姓名：" + Sname + "]";
    }
}
