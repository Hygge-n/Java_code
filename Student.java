//public class Student{
//    public static void main(String[] args) {
//        Student s=new Student();
//        s.methon(new Stu());
//    }
//    public void methon(Person p){
//       String info= p.getInfo();
//       System.out.println(info);
//       if (p instanceof Graduate){
//           System.out.println("研究生");
//       }else if (p instanceof Stu){
//           System.out.println("大学生啊");
//       }else {
//           System.out.println("人");
//       }
//    }
//}
//public class Student extends Person{
//    public static void main(String[] args) {
//        String mojor;
//        Student student=new Student();
//        student.study();
//        student.eat();
//        student.walk();
//        Person person=new Student();
//        person.walk();//编译看左边，运行看右边
//    }
//    public void study(){
//        System.out.println("指定要学习");
//    }
//    public void eat(){
//        System.out.println("学生更应该多多干饭");
//    }
//
//    @Override
//    public void walk() {
//        super.walk();
//        System.out.println("学生可以略微锻炼");
//    }
//}
//public class Student extends Person{
//    public static void main(String[] args) {
//        Student student=new Student();
//        Person person=(Person)student;
//        person.eat();
//        person.toString();
//    }
//}
//public class Student extends Person{
//    private double radius;
//    public Student(double radius,String color, double weight) {
//        super(color, weight);
//        this.radius=radius;
//    }
//    public double getRadius(){
//        return radius;
//    }
//    public void setRadius(double radius){
//        this.radius=radius;
//    }
//    public double findArea(){
//
//        return 0.0;
//    }
//    public static void main(String[] args) {
//
//    }
//}

