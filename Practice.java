

//***********打印三角形***********************
/*
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        for (int j=0;j<i;j++){
            for (int t=0;t<i-j-1;t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//**********获取随机数组**********************
/*
public class Practice{
    public static void main(String [] args){
        Student[] s=new Student[20];
        for (int i=0;i<s.length;i++){
            //给数组元素赋值
            s[i] = new Student();
            s[i].number=i+1;
            s[i].state=(int)(Math.random()*(6-1+1)+1);
            s[i].score=(int)(Math.random()*(100+1)+1);
        }
        for (int i=0;i<s.length;i++){
            System.out.print(s[i].number+" ");
            System.out.print(s[i].state+" ");
            System.out.print(s[i].score+" ");
            System.out.println();
        }
    }
}
class Student{
    int number;
    int state;
    int score;
}
*/
//***********从键盘输入***********************
/*
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        System.out.println("数字"+i+"的情况如下：");
        System.out.println("个位数:"+i%10);
        System.out.println("十位数:"+i/10%10);
        System.out.println("百位数:"+i/100);
    }
}
*/
//************if练习************************
/*
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if (i==100){
            System.out.println("奖励一台BMV");
        }else if (i>80){
            System.out.println("奖励一台手机");
        }else if (i>60){
            System.out.println("奖励一个iPad");
        }else {
            System.out.println("啥也没有");
        }
    }
}
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        int i=(int)(Math.random()*(99-10+1)+1);
        Scanner scanner=new Scanner(System.in);
        System.out.println(i);
        int j=scanner.nextInt();
        if (i==j){
            System.out.println("奖金一万美元");
        }else if (i/10==j%10 && i%10==j/10){
            System.out.println("奖金三千美元");
        }else if (i%10==j%10 || i/10==j/10){
            System.out.println("奖金一千美元");
        }else{
            System.out.println("彩票作废");
        }
    }
}
*/
//************switch练习*********************
/*
public class Practice{
    public static void main(String [] args){
        int i=(int)(Math.random()*(26-1+1)+1);
        System.out.println(i);
        switch (i){
            case 1:
                System.out.println('A');
                break;
            case 2:
                System.out.println('B');
                break;
            case 3:
                System.out.println('C');
                break;
            case 4:
                System.out.println('D');
                break;
            case 5:
                System.out.println('E');
                break;
            default:
                System.out.println("其他字母");
        }
    }
}
*/
//**************for练习**********************
/*
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        if (m<n){
            int t=m;
            m=n;
            n=t;
        }
        int i;
        for (i=m;i>0;i--){
            if (m%i==0 && n%i==0){
                System.out.println("最大公因数="+i);
                break;
            }
        }
        System.out.println("最小公倍数="+(m*n/i));
    }
}
public class Practice{
    public static void main(String [] args){
        int sun=0;
        for (int i=1;i<100;i+=2){
            sun+=i;
        }
        System.out.println(sun);
    }
}
public class Practice{
    public static void main(String [] args){
        int sum=0,count=0;
        for (int i=1;i<100;i++){
            if (i%7==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("个数="+count+"，总和"+sum);
    }
}
//水仙花数
public class Practice{
    public static void main(String [] args){
        for (int i=100;i<1000;i++){
            int j,m,n;
            j=i%10;
            m=i/10%10;
            n=i/100;
            j=j*j*j+m*m*m+n*n*n;
            if (i==j){
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int count1=0,count2=0;
        while(true){
            int i=scanner.nextInt();
            if (i>0){
                count1++;
            }else if (i<0){
                count2++;
            }else {
                break;
            }
        }
        System.out.println("count1="+count1+",count2="+count2);
    }
}
*/
//**************嵌套循环**********************
/*九九乘法表
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
//求素数
public class Practice{
    public static void main(String [] args){
        for (int i=1;i<100;i++){
            int flog=1;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flog=0;
                    break;
                }
            }
            if (flog==1){
                System.out.print(i+"\t");
            }
        }
    }
}
*/
//****************数组***********************
/*
import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();//输入学生的人数
        int[] arr=new int[i];
        for (int j=0;j<arr.length;j++){
            arr[j]=scanner.nextInt();//输入j个成绩
        }
        int max=0;
        for (int j=0;j<arr.length;j++){
            if (max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println("最高分是："+max);
        for (int j=0;j<i;j++){
            if (arr[j]>=max-10){
                System.out.println("学生"+j+"成绩是"+'A');
            }else if (arr[j]>=max-20){
                System.out.println("学生"+j+"成绩是"+'B');
            }else if (arr[j]>=max-30){
                System.out.println("学生"+j+"成绩是"+'C');
            }else {
                System.out.println("学生"+j+"成绩是"+'D');
            }
        }
    }
}
public class Practice{
    public static void main(String [] args){
        int[][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
//***************this************************
/*
public class Practice{
    public static void main(String[] args) {
        boy b=new boy();
        b.setName("王晓宁");
        System.out.println(b.getName());
    }
}
class boy{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
*/
//***************instanceof*****************
//**************************************
//public class Practice{
//    public static void main(String[] args) {
//        int[] arr=new int[]{1,6,3,7,0,9};
//        int[] indexs=new int[]{0,3,2,0,1,1,4,5,2,4,4};
//        String tel="";
//        for (int i=0;i<indexs.length;i++){
//            tel+=arr[indexs[i]];
//        }
//        System.out.println("邓婵的联系方式是 "+tel);
//    }
//}
//装箱：通过调用构造器（Integer t=new Integer(11)）;
//     通过字符串参数（Float f=new Float("13.1F")）
//     自动装箱
/*
public class Practice{
    public static void main(String[] args) {
        int num=10;
        String string=num+" ";
        float f1=12.3f;
        String str=String.valueOf(f1);
        Double d=new Double(12.4);
        String str1=String.valueOf(d);
        System.out.println(string);
        System.out.println(str1);
        Integer i=128;
        Integer j=128;
        System.out.println(i==j);
    }
}
*/
//import java.util.Scanner;
//import java.util.Vector;
//public class Practice{
//    public static void main(String[] args) {
//        //实例化Scanner,从键盘获取学生人数
//        Scanner scan=new Scanner(System.in);
//        //创建Vector,相当于原来的数组
//        Vector v=new Vector();
//        //给Vector中添加数组
//        int max=0;
//        for (;;){
//            System.out.println("请输入学生的成绩");
//            int score=scan.nextInt();
//            if (score<=0){
//                break;
//            }
//            if (score>100){
//                System.out.println("输入的数据非法");
//            }
//            Integer inScore=new Integer(score);
//            v.addElement(inScore);
//            //获取最大值
//            if (max<score){
//                max=score;
//            }
//        }
//        for (int i=0;i<v.size();i++){
//            Object obj=v.elementAt(i);
//            Integer inScore=(Integer)obj;
//            int score =inScore.intValue();
//            if (max-score<10){
//                System.out.println("A");
//            }else if (max-score<20){
//                System.out.println("B");
//            }else {
//                System.out.println("D");
//            }
//        }
//
//    }
//}
/*
import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        int[] num=new int[]{2,7,11,15};
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        System.out.println("target="+target);
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                if (num[i]+num[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
*/
/*
public class Practice{
    public static void main(String[] args) {
        mathon m=new mathon();
        m.age=18;
        m.name="王晓宁";
        mathon m1=new mathon();
        m1.name="王稼瑞";
        m1.age=7;
        m.nation="CHN";
        System.out.println(m1.nation);
        m.eat();
        m.show();
    }
}
class mathon{
    String name;
    int age;
    static String nation;
    public static void show(){
        System.out.println("展示");
        walk();
    }
    public void eat(){
        System.out.println("吃吧");
    }
    public static void walk(){
        System.out.println("锻炼身体");
    }
}
*/
/*
public class Practice{
    public static void main(String[] args) {
        match.eat();
        match.walk();
    }
}
class match{
    String name;
    int age;
    public static void eat(){
        System.out.println("人总是要吃饭的");
    }
    public static void walk(){
        System.out.println("人总是要锻炼的");
        eat();
    }
}
*/
//单例的饿汉式实现
/*
public class Practice{
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);
    }
}
class Bank{
    //私有化类的构造器
    private Bank(){

    }
    //内部创建类的对象
    private static Bank instance =new Bank();
    //提供公共的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
*/
//单例的懒汉式实现
/*
public class Practice{
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);
    }
}
class Bank{
    //私有化类的构造器
    private Bank(){

    }
    //声明当前对象，未初始化
    private static Bank instance=null;
    //返回当前类对象
    public static Bank getInstance(){
        if (instance==null){
            instance=new Bank();
        }
        return instance;
    }
}
*/
/*
public class Practice{
    public static void main(String[] args) {
        Main.main(new String[100]);
        walk();
    }
    public static void walk(){
        System.out.println("多多锻炼身体");
    }
}
class Main{
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
*/
/*
public class Practice{
    public static void main(String[] args) {
       Person p=new Person();
       p.eat();
       p.toString();
       p.name="花花";
       p.age=18;
       System.out.println(p.name+","+p.age);
    }
}
class Person{
    //属性
    String name;
    int age;
    String desc;
    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //代码块
    static{
        System.out.println("hello");
    }

    //方法
    public void eat(){
        System.out.println("人总是要吃饭的");
    }
    public String toString(){
        return "name["+name+"],age["+age+"]";
    }
}
*/
/*
public class Practice{
    public static void main(String[] args) {
        int i,j;
        do {
            i=(int)(Math.random()*(34-1+1)+1);
            j=(int)(Math.random()*(34-1+1)+1);
        }while(i==j);
        System.out.println(i+","+j);

    }
}
*/







