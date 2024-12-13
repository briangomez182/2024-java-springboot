## Encapsulamiento

Siguiendo con la clase Auto, los atributos de un Auto como él (color, marca, modelo) deben ser privados de ese auto,
para evitar que sean modificados desde otra clase externa. En cambio, puedo crear métodos públicos como acelerar() 
y frenar() para interactuar con los atributos (color, marca, modelo) pero de manera controlada.


- ***public:*** Cuando una variable o método se declara como público, se vuelve accesible desde cualquier lugar en el programa.
Otras clases pueden acceder a estas variables y métodos sin restricciones.
-  ***private:*** Cuando se declara una variable o método como privado, solo se puede acceder a ellos dentro de la misma clase.
Esto oculta los detalles internos de la clase a otras partes del programa.
- ***protected:*** Este modificador permite el acceso a las clases que se encuentran dentro del mismo paquete y a las 
subclases (clases hijas heredadas) de la clase padre que contiene el elemento protegido. Esto es útil en la herencia (concepto que veremos más adelante).