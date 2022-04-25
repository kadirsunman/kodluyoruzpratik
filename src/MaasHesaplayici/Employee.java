package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String name, int salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax()
    {
        if(salary < 1000)
        {
            return 0;
        }
        else
        {
            return salary * 0.03;
        }

    }

    public double bonus()
    {
        if(workHours > 40)
        {
            return (workHours - 40) * 30;
        }
        else
        {
            return 0;
        }
    }
    public double raiseSalary()
    {
        int nowYear = 2021;
        int diffYear = nowYear - hireYear;
        double incSalary;
        if(diffYear < 10)
        {
            incSalary = salary * 0.05;
        }
        else if(diffYear < 20)
        {
            incSalary = salary * 0.1;
        }
        else {
            incSalary = salary * 0.15;
        }
        return incSalary;
    }
    public double calculateTotalSalary()
    {
        return salary + bonus() - tax();
    }
    public String toString()
    {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + calculateTotalSalary());
        System.out.println("Toplam Maaş : " + (this.calculateTotalSalary() + raiseSalary()));
        return null;
    }
}
