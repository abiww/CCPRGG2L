public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abigail Allado", "Abi", 20, "2020-101713", 
        "Bachelor Of Science In Information Technology with Specilization in Multimedia Arts and Animation", 
        1, "Female");
        Student s3 = new Student("Charles Alejaga", "Erhn", 18, "2022-104636", 
        "Bachelor Of Science In Information Technology with Specilization in Mobile and Web Application", 
        1, "Male");
        Student s4 = new Student("Jan Mark Caram", "Mark", 19, "2022-102151", 
        "Bachelor Of Science In Information Technology with Specilization in Mobile and Web Application", 
        1, "Male");

        //Student 1
        System.out.println("STUDENT 1 INFORMATION");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s1.Name);
        System.out.println("Nickname: " + s1.Nickname);
        System.out.println("Age: " + s1.Age + " years old");
        System.out.println("Student Number: " + s1.StudentNumber);
        System.out.println("Course: " + s1.Course);
        System.out.println("Year Level: " + s1.YearLevel);
        System.out.println("Sex : " + s1.Sex);
        System.out.println(" ");
        s1.eat("Adobo");
        System.out.println(" ");

        //Student 2
        System.out.println("STUDENT 2 INFORMATION");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s2.Name);
        System.out.println("Nickname: " + s2.Nickname);
        System.out.println("Age: " + s2.Age + " years old");
        System.out.println("Student Number: " + s2.StudentNumber);
        System.out.println("Course: " + s2.Course);
        System.out.println("Year Level: " + s2.YearLevel);
        System.out.println("Sex : " + s2.Sex);
        System.out.println(" ");
        s2.play("Mobile Legends");
        s2.sleep();
        System.out.println(" ");

        //Student 3
        System.out.println("STUDENT 3 INFORMATION");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s3.Name);
        System.out.println("Nickname: " + s3.Nickname);
        System.out.println("Age: " + s3.Age + " years old");
        System.out.println("Student Number: " + s3.StudentNumber);
        System.out.println("Course: " + s3.Course);
        System.out.println("Year Level: " + s3.YearLevel);
        System.out.println("Sex : " + s3.Sex);
        System.out.println(" ");
        s3.study();
        System.out.println(" ");

        //Student 4
        System.out.println("STUDENT 4 INFORMATION");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s4.Name);
        System.out.println("Nickname: " + s4.Nickname);
        System.out.println("Age: " + s4.Age + " years old");
        System.out.println("Student Number: " + s4.StudentNumber);
        System.out.println("Course: " + s4.Course);
        System.out.println("Year Level: " + s4.YearLevel);
        System.out.println("Sex : " + s4.Sex);
        System.out.println(" ");
        s4.cram();

    }
}
