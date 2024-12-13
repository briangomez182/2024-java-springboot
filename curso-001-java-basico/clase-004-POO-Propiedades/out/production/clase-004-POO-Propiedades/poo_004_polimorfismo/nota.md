## Que debemos hacer para que auto se considere Polimorfico, debe heredarle sus métodos a 2 o más clases.

- Herencia: AutoDeportivo y Camion heredan de Auto, por lo que comparten atributos y métodos comunes.
- Sobre escritura: Los métodos acelerar() en AutoDeportivo y Camion sobreescriben el método de la clase base, proporcionando un comportamiento específico para cada tipo de vehículo.
- Polimorfismo: Al crear una lista de objetos de tipo Auto y agregar tanto un AutoDeportivo como un Camion, podemos tratar ambos objetos como si fueran simplemente Auto. Cuando llamamos a acelerar(), se ejecuta la versión específica del método implementada en cada clase, demostrando el polimorfismo.