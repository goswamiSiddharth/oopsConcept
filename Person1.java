package OOPs;
class Main1{
    public static class Person1 {
        int age;
        String name;

        void saysHi(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String args[]){
        Person1 p1=new Person1();
        p1.age=10;
        p1.name="A";
        // p1.saysHi();

        Person1 p2=new Person1();
        p2.age=20;
        p2.name="B";
        // p2.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }

    public static void swap(Person1 pers1,Person1 pers2){
        Person1 temp=pers1;
        pers1=pers2;
        pers2=temp;
    }

}
