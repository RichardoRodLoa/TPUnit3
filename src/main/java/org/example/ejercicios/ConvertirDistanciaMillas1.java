package org.example.ejercicios;

public class ConvertirDistanciaMillas1 {
    public static void main(String[] args) {
        // Crear una instancia de distanciaViaje con origen "Medellin", destino "Bogota" y distancia en kilómetros de 100.0.
        distanciaViaje viaje = new distanciaViaje("Medellin", "Bogota", 100.0);
        
        // Obtener la distancia en kilómetros del viaje.
        double distanciaKilometros = viaje.distanciaKilometros();
        
        // Convertir la distancia en kilómetros a millas utilizando la función convertirAKilometros.
        double distanciaMillas = convertirAKilometros(distanciaKilometros);
        
        // Mostrar la distancia entre el origen y el destino en millas.
        mostrarDistancia(viaje, distanciaMillas);
    }

    // Clase interna para representar un viaje con origen, destino y distancia en kilómetros.
    static class distanciaViaje {
        private final String origen;
        private final String destino;
        private final double distanciaKilometros;

        public distanciaViaje(String origen, String destino, double distanciaKilometros) {
            this.origen = origen;
            this.destino = destino;
            this.distanciaKilometros = distanciaKilometros;
        }

        public double distanciaKilometros() {
            return distanciaKilometros;
        }

        public String origen() {
            return origen;
        }

        public String destino() {
            return destino;
        }
    }

    // Método estático para convertir millas a kilómetros.
    static double convertirAKilometros(double millas) {
        return millas * 0.621371;
    }

    // Método estático para mostrar la distancia entre origen y destino en millas.
    static void mostrarDistancia(distanciaViaje viaje, double distanciaMillas) {
        System.out.println("La distancia entre " + viaje.origen() + " y " + viaje.destino() + " es de " + distanciaMillas + " millas. ");
    }
}
