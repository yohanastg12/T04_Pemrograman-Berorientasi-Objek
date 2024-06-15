package academic.model;
//buatlah public class student 
public class Student {
    //buatlah atribut dari class student
    private String id;
    private String name;
    private String GPA;
    private String credit;

    //buatlah method dari class student
    public Student(String id, String name, String GPA, String credit) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String toString() {
        return id + "|" + name + "|" + GPA + "|" + credit;
    }

}
