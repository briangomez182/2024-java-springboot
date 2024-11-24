## ¿Por qué utilizar las Propiedades de la POO?

La POO es un paradigma de programación. Ahora que era un paradigma? 

> Es una manera de resolver un problema, Supongamos que nuestro problema es armar un rompecabezas. Solución:
> - ¿Se puede armar de arriba hacia abajo?
> - ¿Se puede arma de abajo hacia arriba?
> - ¿Se puede arma de derecha hacia la izquierda?
> - ¿Se puede arma de izquierda hacia derecha?
> - o Todas correctas?

Bueno esto nos permite modelar el mundo real de una manera más intuitiva y manejable. 
Al organizar nuestro código en clases y objetos, podemos crear sistemas más complejos, 
reutilizables y fáciles de mantener.

## Ahora ¿Cuáles son estas Propiedades de la POO?

    - Abstracción
    - Encapsulamiento
    - Herencia
    - Polimorfismo

## Por ejemplo, Vamos a dar un bosquejo general de Abstraction.

Cuando creamos una clase Auto, nos enfocamos en sus propiedades como (color, marca, modelo) y sus funcionalidades (acelerar, frenar), sin preocuparnos por los detalles internos del motor.

## Encapsulamiento??

Siguiendo con la clase Auto, los atributos de un Auto como el (color, marca, modelo) deben ser privados de ese auto, para evitar que sean modificados desde otra clase externa. En cambio, puedo crear métodos públicos como acelerar() y frenar() para interactuar con los atributos (color, marca, modelo) pero de manera controlada.

## Y la Herencia??

Bueno imagínate que podemos crear una clase AutoDeportivo que herede de la clase Auto. Esta nueva clase tendrá todas las características de la clase auto, pero además podrá tener atributos y métodos nuevos y específicos como turbo o cambiarModoPista.

## Y el Polimorfismo?? Esta es uno de los más dificiles y que me costó mucho cuando era estudiante.

Imaginemos una que tengo 10 objetos que son Autos. En este grupo o coleccion de autos puede contener tanto objetos de la clase Auto como de la clase AutoDeportivo.
Supongamos que son 5 de la clase AutoDeportivo y 5 Camiones.
Ahora, cada uno de los 10 autos tienen el método acelerar(), Pero los autos creados mediante la clase AutoDeportivo podría acelerar mucho más rápido si tiene el turbo activado. Y los camiones aceleran mucho más lento.

## Vamonos a una demo y practiquemos cada una de las propiedades de la POO


