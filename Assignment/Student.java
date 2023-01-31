public class Student {
    //Attributes
    static String SchoolName = "National University - Manila";
    String Name;
    String Nickname;
    int Age;
    String StudentNumber;
    String Course;
    int YearLevel;
    String Sex;

    //No-args constructor
    public Student() {
        this.Name = "Rainier Aganan";
        this.Nickname = "Rain";
        this.Age = 18;
        this.StudentNumber = "2022-104934";
        this.Course = "Bachelor Of Science In Information Technology with Specilization in Multimedia Arts and Animation";
        this.YearLevel = 1;
        this.Sex = "Male";        
    }

    //Parameterized constructor
    public Student (String Name, String Nickname, int Age, String StudentNumber, String Course, int YearLevel, String Sex) {
        this.Name = Name;
        this.Nickname = Nickname;
        this.Age = Age;
        this.StudentNumber = StudentNumber;
        this.Course = Course;
        this.YearLevel = YearLevel;
        this.Sex = Sex;
    }

    //Behavior
    public void sleep() {
        System.out.println(Nickname + " is sleeping");
    }

    public void eat(String Food) {
        System.out.println(Nickname + " is currently eating " + Food);
    }

    public void study() {
        System.out.println(Nickname + " is studying");
    }

    public void cram() {
        System.out.println(Nickname + " is cramming");
    }

    public void play(String Game) {
        System.out.println(Nickname + " is playing " + Game);
    }
}
