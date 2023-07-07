package OOPs;

class Main4 {
    public static class constructor {
        int age;
        String name;

        void saysHi(){
            System.out.println(name+" "+age);
        }
        constructor() {
            // default constructor
        }

        // parameterized constructor
        constructor(int age , String name){
            this.age=age;
            this.name=name;
        }
    }

    public static void main(String args[]) {
        constructor c1 = new constructor();
        c1.age = 10;
        c1.name = "A";
        c1.saysHi();

        constructor c2=new constructor(20,"B");
        c2.saysHi();

    }
}
