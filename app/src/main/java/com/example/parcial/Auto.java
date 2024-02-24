public class Auto {

    interface Funcionalidades {
        void encender();
        void apagar();
    }

    interface Conectividad {
        void conectarcarplay();
        void conectarBluetooth();
    }

    static class Carro implements Funcionalidades, Conectividad {
        private String marca;
        private String modelo;
        private String tipo = "Auto Grande";

        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public Carro(String marca, String modelo, String tipo) {
            this.marca = marca;
            this.modelo = modelo;
            this.tipo = tipo;  // Corregir la asignación del tipo
        }

        public void encender() {
            System.out.println("Encendiendo el Auto " + marca + " " + modelo);
        }

        public void apagar() {
            System.out.println("Apagando el Auto " + marca + " " + modelo);
        }

        public void conectarcarplay() {
            System.out.println("Conectando conectarcarplay " + marca + " " + modelo);
        }

        public void conectarBluetooth() {
            System.out.println("Conectando a Bluetooth en el Auto " + marca + " " + modelo);
        }

        public void mostrarTipo() {
            System.out.println("Tipo de carro: " + obtenerTipo());
        }

        protected String obtenerTipo() {
            return tipo;
        }
    }

    static class Camioneta extends Carro {
        private String tipo;

        public Camioneta(String marca, String modelo, String tipo) {
            super(marca, modelo);
            this.tipo = tipo;
        }

        public void mostrarTipo() {
            System.out.println("Tipo de Camioneta: " + tipo);
        }

        protected String obtenerTipo() {
            return tipo;
        }
    }

    public static void main(String[] args) {
        Carro comp1 = new Carro("Chevrolet", "sail ");
        Carro comp2 = new Carro("Chevrolet", "Spark", "carro");
        Camioneta Camionetap1 = new Camioneta("Chevrolet", "TAHOE", " -");

        comp1.encender();
        comp1.conectarcarplay();
        comp1.conectarBluetooth();
        comp1.mostrarTipo();
        comp1.apagar();

        comp2.encender();
        comp2.conectarcarplay();
        comp2.conectarBluetooth();
        comp2.mostrarTipo();
        comp2.apagar();

        Camionetap1.encender();
        Camionetap1.conectarcarplay();
        Camionetap1.mostrarTipo();
        Camionetap1.apagar();
    }
}
