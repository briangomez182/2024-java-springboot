package org.example.excepciones;

public class MiExcepcionPersonalizada extends Exception {
    //Constructor por defecto
    public MiExcepcionPersonalizada() {
        super();  //Llama al constructor de la clase Exception
    }

    //Constructor con un parametro
    public MiExcepcionPersonalizada(String message) {
        super(message);
    }


}