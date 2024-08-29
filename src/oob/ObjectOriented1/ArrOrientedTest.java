package oob.ObjectOriented1;

public class ArrOrientedTest {

    /*   定义一个长度为 3 的数组，存储 1-3 名学生对象作为初始数据，学生对象的学号，姓名各不相同
学生的属性 学号 姓名 年龄   */

    // 要求1 再次添加一个对象 并在添加的时候进行学号的唯一性判断
    // 要求2 添加完毕 遍历所有学生信息
    // 要求3 通过 sno删除学生信息 如果存在 删除，不存在 提示删除失败
    // 要求4 删除完毕后 遍历所有学生信息
    // 要求5 查询数组 sno 为 202204 的学生，如果存在 将他的年龄 +1

    public static void main(String[] args) {
        //创建一个数组用来存储对象
        ArrOriented[] arr = new ArrOriented[3];

        //创建对象并添加到数组当中
        ArrOriented stu1 = new ArrOriented(202201, "蜡笔小新", 6);
        ArrOriented stu2 = new ArrOriented(202202, "小猪佩奇", 7);
        ArrOriented stu3 = new ArrOriented(202203, "海绵宝宝", 8);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        System.out.println("---要求1：再次添加一个对象 并在添加的时候进行学号的唯一性判断");
        ArrOriented stu4 = new ArrOriented(202204, "懒洋洋", 9);

        //唯一性判断
        boolean flag = contains(arr, stu4.getSno());
        if (flag) {
            //已存在 不用添加
            System.out.println("当前 sno 重复，请修改 sno 后再进行添加！");
        } else {
            //不存在 就可以把学生对象添加到数组当中
            int count = countArr(arr);
            if (count == arr.length) {
                //已满 创建一个新数组 长度为 arr.length + 1
                //然后把老数组的元素拷贝到新数组当中
                ArrOriented[] newArr = createNewArr(arr);
                //将 stu4 添加到新数组当中 最后一个元素
                newArr[count] = stu4;

                System.out.println("---要求2:添加完毕 遍历所有学生信息");
                printArr(newArr);
            } else {
                //没满 直接添加
                arr[count] = stu4;

                System.out.println("---要求2:添加完毕 遍历所有学生信息");
                printArr(arr);
            }
        }

        System.out.println("---要求3 通过 sno删除学生信息");
        int index = getIndex(arr, 202);
        if (index >= 0) {
            //如果存在 删除
            arr[index] = null;
        } else {
            //不存在 提示删除失败
            System.out.println("当前 sno 不存在，删除失败！");
        }

        System.out.println("---要求4 删除完毕后 遍历所有学生信息");
        printArr(arr);

        System.out.println("---要求5 查询数组 sno 为 202202 的学生 如果存在 将他的年龄 +1");
        int index1 = getIndex(arr, 202202);
        if (index1 >= 0) {
            ArrOriented stu = arr[index1];
            //存在 将他的年龄 +1
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            //遍历
            printArr(arr);
        } else {
            //不存在
            System.out.println("当前 sno 不存在，修改失败！");
        }

    }

    //遍历 arr 的方法
    public static void printArr(ArrOriented[] arr) {
        for (int i = 0; i < arr.length; i++) {
            ArrOriented stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getSno() + " " + stu.getName() + " " + stu.getAge());
            }
        }

    }

    //找到 sno 对应的索引
    public static int getIndex(ArrOriented[] arr, int sno) {
        for (int i = 0; i < arr.length; i++) {
            ArrOriented stu = arr[i];
            //对 stu 进行非空判断
            if (stu != null) {
                if (sno == stu.getSno()) {
                    return i;
                }
            }
        }
        //当循环结束后，还没有找到就表示不存在
        return -1;
    }

    //创建一个新数组 长度为 arr.length + 1
    //然后把老数组的元素拷贝到新数组当中
    public static ArrOriented[] createNewArr(ArrOriented[] arr) {
        ArrOriented[] newArr = new ArrOriented[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //判断数组中存了几个元素
    public static int countArr(ArrOriented[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //判断 sno 是否存在
    public static boolean contains(ArrOriented arr[], int sno) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取学生数组里面的每一个对象
            ArrOriented stu = arr[i];
            //arr 不为空才获取 sno 进行接下来的判断
            if (stu != null) {
                //获取数组中学生对象的 sno
                int sno1 = stu.getSno();
                //判断
                if (sno1 == sno) {
                    return true;
                }
            }
        }
        return false;
    }

}