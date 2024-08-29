package oob.ObjectOriented1;

public class ArrOriented {
    private int sno;
    private String name;
    private int age;

    public ArrOriented() {
    }

    public ArrOriented(int sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "ArrOriented{sno = " + sno + ", name = " + name + ", age = " + age + "}";
    }
}
