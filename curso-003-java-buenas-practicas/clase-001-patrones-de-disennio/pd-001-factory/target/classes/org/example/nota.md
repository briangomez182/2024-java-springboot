## Paso a paso Método Factory.

1) Creamos la interfaz Pago dentro del paquete interfaces y su metodo crearPago().
2) Crear un paquete implementaciones que dentro tenga cada una de las condiciones que teniamos anteriormente, estas clases implementan la interfaz Pago.
3) Crear un paquete factories con una clase llamada PagoFactory o FabricacionDePago.
4) Creamos una constante de tipo mapa, donde sus claves seran el tipo de pago de nuestro Enum y  sus valores seran cada instancia de Pago
5) Dentro de la clase PagoFactory creamos un metodo llamado fabricarPago(), que retorne una interfaz Pago y que reciba por parametros el tipo de pago que se esta buscando
5) En main instanciamos la fabrica, luego creamos la instancia y listo