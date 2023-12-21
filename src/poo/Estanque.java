package poo;

public class Estanque {
    private int capacidad;


    public Estanque() {
        this.setCapacidad(40);
    }

    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Estanque{" +
                "capacidad=" + capacidad +
                '}';
    }
}
