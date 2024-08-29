package oob.ObjectOriented2.Extend7;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001","蜡笔小新",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() +
                ", " + m.getSalary() + ", " + m.getManageSalary());
        m.work();
        m.eat();

        Chef c = new Chef();
        c.setId("002");
        c.setName("懒洋洋");
        c.setSalary(15000);
        System.out.println(c.getId() + ", " + c.getName() +
                ", " + c.getSalary());
        c.work();
        c.eat();
    }
}