package oob.ObjectOriented2.Extend7;

public class Manager extends Employee{
    int manageSalary;

    public Manager() {
    }

    //带全部参数的构造 继承父类
    public Manager(String id, String name, int salary, int manageSalary) {
        super(id, name, salary);
        this.manageSalary = manageSalary;
    }

    public int getManageSalary() {
        return manageSalary;
    }

    public void setManageSalary(int manageSalary) {
        this.manageSalary = manageSalary;
    }

    @Override
    public void work(){
        System.out.println("经理管理其他人");
    }

}
