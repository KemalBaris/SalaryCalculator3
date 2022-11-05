public class Employe {
// değişkenler
    String name;
    int salary;
    int workHours;
    int hireYear;
    int raiseSalary;

    //kurucu method
    public Employe(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        taxSalary();
    }
// vergi hesaplama
    public double taxSalary() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }
// yıla göre zam hesaplama
    public double raiseSalary() {
        if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * 0.10;
        } else if (2021 - this.hireYear > 0 && 2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else {
            return 0;
        }
    }
//eğer ekstra mesai varsa hesaplama
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }
//ekrana yazdırma kodu
    public String toString() {

        double total2 = salary - taxSalary() + bonus() + raiseSalary();
        double total1 = salary + bonus() - taxSalary();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.taxSalary());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + total1);
        System.out.println("Toplam Maaş : " + total2);


        return null;
    }

}
