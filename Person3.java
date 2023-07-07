package OOPs;
class Main3{
    public static class Person3 {
        int age;
        String name;

        void saysHi(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String args[]){
        Person3 p1=new Person3();
        p1.age=10;
        p1.name="A";
        // p1.saysHi();

        Person3 p2=new Person3();
        p2.age=20;
        p2.name="B";
        // p2.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }

    public static void swap(Person3 pers1,Person3 pers2){
        pers1=new Person3();
        int a=pers1.age;
        pers1.age=pers2.age;
        pers2.age=a;

        pers2=new Person3();
        String n=pers1.name;
        pers1.name=pers2.name;
        pers2.name=n;
    }

}
