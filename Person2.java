package OOPs;
class Main2{
    public static class Person2 {
        int age;
        String name;

        void saysHi(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String args[]){
        Person2 p1=new Person2();
        p1.age=10;
        p1.name="A";
        // p1.saysHi();

        Person2 p2=new Person2();
        p2.age=20;
        p2.name="B";
        // p2.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }

    public static void swap(Person2 pers1,Person2 pers2){
        int a=pers1.age;
        pers1.age=pers2.age;
        pers2.age=a;

        String n=pers1.name;
        pers1.name=pers2.name;
        pers2.name=n;
    }

}
