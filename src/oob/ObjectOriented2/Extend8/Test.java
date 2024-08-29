package oob.ObjectOriented2.Extend8;

public class Test {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("001", "懒洋洋");
        System.out.print(teacher.getId() + "---" + teacher.getName() + "---");
        teacher.work();

        AdminStaff adminStaff = new AdminStaff("002", "蜡笔小新");
        System.out.print(adminStaff.getId() + "---" + adminStaff.getName() + "---");
        adminStaff.work();

        Lecturer lecturer = new Lecturer("003", "汤姆");
        System.out.print(lecturer.getId() + "---" + lecturer.getName() + "---");
        lecturer.work();

        Tutor tutor = new Tutor("004", "杰瑞");
        System.out.print(tutor.getId() + "---" + tutor.getName() + "---");
        tutor.work();

        Maintainer maintainer = new Maintainer("005", "海绵宝宝");
        System.out.print(maintainer.getId() + "---" + maintainer.getName() + "---");
        maintainer.work();

        Buyer buyer = new Buyer("006", "哆啦A梦");
        System.out.print(buyer.getId() + "---" + buyer.getName() + "---");
        buyer.work();
    }
}
