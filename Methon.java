/*
public class Methon{
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.name="王晓宁");
        System.out.println(p.age=18);
        p.eat();
        p.sleep();
    }
}
class Person{
    //属性
    String name;
    int age;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Customer c=new Customer();
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.eat("面条"));
    }
}
class Customer{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String eat(String food){
        return food;
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Person p=new Person();
        p.name="王晓宁";
        p.age=18;
        p.student();
        p.showage();
        System.out.println(p.addage(2));
    }
}
class Person{
    String name;
    int age;
    int sex;
    public void student(){
        System.out.println("studenting");
    }
    public void showage(){

        System.out.println(age);
    }
    public int addage(int j){
        age+=j;
        return age;
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.r=3.1;
        double ares=c.mianji();
        System.out.println(ares);

    }
}
class Circle{
    double r;
    public double mianji(){
        double ar=3.14*r*r;
        return ar;
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Mathon m=new Mathon();
        m.tuxing(8);
    }
}
class Mathon{
    public void tuxing(int a){
        for (int i=0;i<a;i++){
            for (int j=0;j<a-i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Student[] arr=new Student[20];
        for (int i=0;i<arr.length;i++){
            arr[i]=new Student();
            arr[i].number=i+1;
            arr[i].state=(int)(Math.random()*(4-1+1)+1);
            arr[i].score=(int)(Math.random()*(100+1)+1);
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i].state==1){
                System.out.println(arr[i].score);
            }
        }
    }
}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Methon m=new Methon();
        m.printAreas(5);
    }
    public void printAreas(int i){
        for (int j=1;j<=i;j++){
            double ares=Math.PI*j*j;
            System.out.println("半径="+j+"  面积="+ares);
        }
    }
}
*/
/*
*方法的重载：在同一个类中，允许定义一个以上的同名方法，参数列表不同
*         {同一个类，相同方法名，参数列表不同}
public class Methon{
    public static void main(String [] args){
        Methon m=new Methon();
        m.getsum(2);
        m.getsum(2,3);
        m.getsum("chinese");
    }
    //如下构成重载
    public void getsum(int i){
        System.out.println(i*i);
    }
    public void getsum(int i,int j){
        System.out.println(i*j);
    }
    public void getsum(String i){
        System.out.println(i);
    }
}
public class Methon{
    public static void main(String [] args){
        Methon m=new Methon();
        m.max(5,7);
        m.max(3.14,1.22);
        m.max(1.22,3.44,2.33);
    }
    public void max(int i,int j){
        if (i>j){
            System.out.println(i);
        }
        else{
            System.out.println(j);
        }
    }
    public void max(double i,double j){
        if (i>j){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
    }
    public void max(double i,double j,double k){
        double t=i;
        if (i<j){
            t=j;
        }
        if (t>k){
           System.out.println(t);
        }
        else {
            System.out.println(k);
        }
    }
}
*/
/*
*方法参数的值传递机制
*
//基本数据类型赋值：数据值;引用数据类型：地址值
public class Methon{
    public static void main(String [] args){
        int m=10;
        int n=10;
        System.out.println("m="+m+" n="+n);
        n=20;
        System.out.println("m="+m+" n="+n);
    }
}
public class Methon{
    public static void main(String [] args){
        double r;
        Methon m=new Methon();
        m.Find(3.3);
    }
    public void Find(double r){
        double j=3.14*r*r;
        System.out.println(j);
    }
}
*/
/*
public class Methon{
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(18);
        int j=p.getAge();
        System.out.println(j);
    }
}
class Person{
    private int age;
    public void setAge(int i){
        age=i;
    }
    public int getAge(){
        return age;
    }
}
*/
