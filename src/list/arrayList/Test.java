package list.arrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (int i = 0; i < list.size; i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
