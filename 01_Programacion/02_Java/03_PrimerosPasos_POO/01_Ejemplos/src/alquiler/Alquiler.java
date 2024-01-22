package alquiler;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaAlquiler;
    private int diasAlquilado;
    
    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler, int diasAlquilado) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.diasAlquilado = diasAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getDiasAlquilado() {
        return diasAlquilado;
    }

}