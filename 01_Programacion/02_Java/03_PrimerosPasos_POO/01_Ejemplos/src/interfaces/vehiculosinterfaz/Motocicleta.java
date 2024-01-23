package interfaces.vehiculosinterfaz;

public class Motocicleta implements Vehiculo{
    private int velocidad;

    public Motocicleta() {
        this.velocidad = 0;
    }

    public void getVelocidad() {
        System.out.println(velocidad);
    }

    @Override
    public void acelerar(int nuevaVelocidad) {
        this.velocidad += nuevaVelocidad;        
    }

    @Override
    public void frenar(int nuevaVelocidad) {
        this.velocidad -= nuevaVelocidad;        
        
    }
}
