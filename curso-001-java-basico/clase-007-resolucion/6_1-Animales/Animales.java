package animales;


public class Animales {

    public static void main(String[] args) {
       
                
        Mamifero mamifero = new Mamifero(4, "Vivíparo", "Amarillo", "Savannah", 1, "León", 5, "Pelaje", "Carnívoro");
        Ave ave = new Ave(2.5, "Planeador", "Marrón", "Curvado", 2, "Águila", 10, "Plumaje", "Carnívoro");
        Reptil reptil = new Reptil(1.5, "Serradas", "Veneno letal", "Selva", 3, "Serpiente", 3, "Escamas", "Carnívoro");

        // Llamar al método saludar desde cada objeto
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
        
        //crear un animal vacio y asignarle un mamífero
        Animal animal = new Animal();
        animal = mamifero;
        
       
    }
    
}
