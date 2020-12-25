package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    private String name;
    private int age;
    private String sex;
    private int money;
    private Date date;


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + sex + '\'' +
                ", 薪资=" + money +
                ", 入职时间=" + sdf.format(date) +
                '}';
    }


    public Emp() {
    }

    public Emp(String name, int age, String sex, int money,int year,int mon ,int day) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.money = money;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,mon);
        cal.set(Calendar.DATE,day);
        this.date = cal.getTime();
//        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Date date2 = new Date();
        Emp emp1 = new Emp("张三",21,"男",6000,2000,6,24);
        Emp emp2 = new Emp("张三",22,"女",7000,2003,9,15);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.equals(emp2));
    }
}
