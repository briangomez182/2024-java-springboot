
## Clases Abstractas e Interfaces

### Clases Abstractas

Una clase abstracta es una clase especial en Java que tiene la principal característica de que no puede ser instanciada directamente. Esto quiere decir, que no se pueden crear objetos a partir de ella. Se utiliza como una plantilla o modelo para crear otras clases derivadas. Las clases abstractas pueden contener métodos abstractos (sin cuerpo o implementación) y métodos concretos (con implementación de código).

Cuales son las características de las clases abstractas:

- **Palabra clave abstract:** Se deben declarar abstracta, usando la palabra clave abstract antes de la palabra clave class.

- **Métodos abstractos:** Puede tener tanto métodos abstractos como métodos implementados. Sin embargo, una clase abstracta debe tener de forma OBLIGATORIA al menos un método abstracto.

- **Herencia:** Otras clases pueden extender o (heredar) de una clase abstracta. Esto significa que las clases hijas deben tener implementaciones de forma OBLIGATORIA para todos los métodos abstractos que tenga la clase abstracta mediante sobre escritura de métodos. Que es sobre escritura en java 