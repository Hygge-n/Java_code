import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

//class Person {
//    protected String name="person";
//    protected int age=50;
//    public String getInfo(){
//        return "name="+name+",age="+age;
//    }
//}
//class Stu extends Person{
//    protected String school="xu";
//    public String getInfo(){
//        return "school="+school;
//    }
//}
//class Graduate extends Stu{
//    public String major="IT";
//    public String getInfo(){
//        return "major="+major;
//    }
//}
//public class Person{
//    String name;
//    int age;
//    public void eat(){
//        System.out.println("人每天要干饭");
//    }
//    public void walk(){
//        System.out.println("锻炼有益身心健康");
//    }
//}
//public class Person{
//    String name;
//    int age;
//    public void eat(){
//        System.out.println("吃吧");
//    }
//}
//public class Person{
//    protected String color;
//    protected double weight;
//    public String getColor(){
//        return color;
//    }
//    public void setColor(){
//        this.color=color;
//    }
//    public double getWeight(){
//        return weight;
//    }
//    public void setWeight(){
//        this.weight=weight;
//    }
//    public Person(String color,double weight){
//        super();
//        this.color=color;
//        this.weight=weight;
//    }
//    public double findArea(){
//        return 0.0;
//    }
//}
//toString的使用
//public class Person{
//    public static void main(String[] args) {
//        Person person=new Person();
//        System.out.println(person.toString());
//        System.out.println(person);
//        String s=person.toString();
//        System.out.println(s);
//    }
//
//    @Override
//    public String toString() {
//        String name="wxn";
//        return "name["+ name +"]";
//    }
//}
//public class Person{
//    public static void main(String[] args) {
//        int num=10;
//        Integer integer=new Integer(num);
//        System.out.println(integer.toString());
//        Integer integer1=new Integer("123");
//        System.out.println(integer1);
//        Float f=new Float("12.3");
//        System.out.println(f);
//        Boolean b=new Boolean("true");
//        System.out.println(b);
//        Boolean b1=new Boolean("TrUe");
//        System.out.println(b1);
//    }
//}
