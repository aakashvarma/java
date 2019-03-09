class Patient{
    String patientName;
    double height;
    double weight;

    public Patient(String name, double height, double weight){
        this.patientName = name;
        this.height = height;
        this.weight = weight;
    }

    public double computeBMI(){
        return 703 * weight/(height*height);
    }

    public static void main(String[] args){
        Patient obj = new Patient("Aakash", 157.4, 88.7);
        System.out.println(obj.computeBMI());
    }
}