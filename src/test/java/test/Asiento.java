package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
        switch (color) {
            case "rojo":
            case "verde":
            case "amarillo":
            case "negro":
            case "blanco":
                this.color = color;
            default:
        }
    }
}
