import java.time.*;
/**
 * 用于员工工资发放
 * 2020-7-18
 * @author aliang
 */

public class test7182 {
    public static void main(String[] args)
    {
        Employee[] staff=new Employee[3];
        staff[0] =new Employee("aliang",75000,1978,11,15);
        staff[1] =new Employee("aming",50000,1984,10,1);
        staff[2] =new Employee("achao",40000,1954,11,10);
        for (Employee e: staff)
            e.raiseSalary(5);
        for(Employee e : staff)
            System.out.println("name:"+e.getName()+",salary:"+e.getSalary()+",hireday:"+e.getHireDay());
    }
}
class  Employee
{
    private String name;
    private double salary;
    private  LocalDate hireDay;
    public Employee(String n,double s,int year,int month,int day)
    {
        name=n;
        salary=s;
        hireDay=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double a)
    {
       double raise=salary*a/100;
       salary+=raise;
    }

}
