package interfaces.vehiculos;

public interface Vehiculo {
    int VELOCIDAD_MAX = 120;

    public void acelerar(int nuevaVelocidad);
    public void frenar(int nuevaVelocidad);
    public void getVelocidad();
}