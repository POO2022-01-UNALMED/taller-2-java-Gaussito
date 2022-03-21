public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
        switch (color) {
            case "rojo", "verde", "amarillo", "negro", "blanco" -> this.color = color;
            default -> {}
        }
    }
}
