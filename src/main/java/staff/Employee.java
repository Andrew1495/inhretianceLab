package staff;

public abstract class Employee {

    protected String name;
    protected String niNumber;
    protected double salary;

    public String getName() {
        return name;
    }

    public String getniNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        char temp = name.charAt(0);
        if(name.length() != 0 && temp != ' ') {
            this.name = name;
        }
    }
    public void raiseSalary(Double multi){
        if(multi > 0) {
            this.salary = salary * multi;
        }
    };

    public double payBonus(){
        return this.salary*0.01;
    }



}
