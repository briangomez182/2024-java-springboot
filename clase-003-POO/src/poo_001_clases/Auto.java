package poo_001_clases;

 public class Auto {
        // Atributos
        private String color;
        private String marca;
        int velocidad;

        // Métodos


     public Auto() {
     }

     public Auto(String color, String marca, int velocidad) {
         this.color = color;
         this.marca = marca;
         this.velocidad = velocidad;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public int getVelocidad() {
         return velocidad;
     }

     public void setVelocidad(int velocidad) {
         this.velocidad = velocidad;
     }

     public String acelerar() {
            // Código para acelerar el carro
         return "Acelerando";
        }

        public String frenar() {
            // Código para frenar el carro
            return "Frenando";
        }
    }

