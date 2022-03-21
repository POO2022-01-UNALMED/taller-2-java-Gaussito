public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;

    int cantidadAsientos(){
        int cantidadAsiento = 0;
        for (Asiento asiento:asientos){
            if (!(asiento == null)){
                cantidadAsiento++;
            }
        }
        return cantidadAsiento;
    }
    String verificarIntegridad(){
        for (Asiento asiento:asientos){

            if ((!(asiento == null))) {
                if ( !((motor.registro == asiento.registro) && (motor.registro == registro)) ){
                    return "Las piezas no son originales";
                }
            }

        }
        return  "Auto original";
    }
}