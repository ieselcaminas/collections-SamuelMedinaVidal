package InterfazComparable.FelipeYSusTareas;

public class Tarea implements Comparable<Tarea>{
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "prioridad=" + prioridad +
                ", duracion=" + duracion +
                '}';
    }

    @Override
    public int compareTo(Tarea other) {
        if (this.prioridad == other.prioridad) {
            return this.duracion - other.duracion;
        }else{
            return other.prioridad - this.prioridad;
        }
    }
}
