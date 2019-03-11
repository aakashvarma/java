class Employee extends Person {
    private double annSalary;
    private int yearofWork;
    private String natInsureNo;

    public Employee(String name, double salary, int year, String no) {
        super(name);
        annSalary = salary;
        yearofWork = year;
        natInsureNo = no;
    }

    public double getSalary() {
        System.out.println("Salary: " + annSalary);
        return annSalary;
    }

    public int getYearOfWork() {
        System.out.println("Year employee started to work in: " + yearofWork);
        return yearofWork;
    }

    public String getInsureNo() {
        System.out.println("National Insurance Number: " + natInsureNo);
        return natInsureNo;
    }
}