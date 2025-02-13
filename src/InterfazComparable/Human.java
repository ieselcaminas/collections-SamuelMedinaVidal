package InterfazComparable;

public class Human implements Comparable<Human>{
    private String name;
    private double salary;

    public Human(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.name + " - " + this.salary;
    }
    @Override
    public int compareTo(Human  other){
        //Esto sería de menor a mayor
        return Double.compare(this.getSalary(), other.getSalary());
        //y esto sería de mayor a menor
        //return Double.compare(other.getSalary(), this.getSalary());
        /*
         Y en este caso, si tienen el mismo nombre, los ordenamos por salario de menor
         a mayor
         */
        /*if (this.name.equals(other.getName())){
            return Double.compare(this.getSalary(), other.getSalary());
        }else{
            return this.name.compareTo(other.getName());
        }*/
    }
}
