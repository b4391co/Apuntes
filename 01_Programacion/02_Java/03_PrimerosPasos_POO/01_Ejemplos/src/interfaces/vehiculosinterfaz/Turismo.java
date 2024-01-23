package interfaces.vehiculosinterfaz;

public class Turismo implements Vehiculo {
    private int velocidad;

    public Turismo() {
        this.velocidad = 0;
    }

    public void getVelocidad() {
        System.out.println(velocidad);
    }

    @Override
    public void acelerar(int nuevaVelocidad) {
        this.velocidad += (velocidad + nuevaVelocidad < VELOCIDAD_MAX)? nuevaVelocidad: VELOCIDAD_MAX;
    }

    @Override
    public void frenar(int nuevaVelocidad) {
        this.velocidad -= nuevaVelocidad;        
        
    }
}
