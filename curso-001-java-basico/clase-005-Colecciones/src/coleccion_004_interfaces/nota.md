Una interfaz en Java es una estructura que se utiliza para definir un contrato que las clases pueden implementar. Una interfaz actúa como una especie de plantilla o esquema que declara métodos, pero no proporciona una implementación de ellos. Las clases que implementan una interfaz se comprometen a proporcionar una definición concreta de los métodos que declara la interfaz.

Características principales de las interfaces en Java:
Definición de métodos abstractos: Los métodos dentro de una interfaz son abstractos por defecto, lo que significa que no tienen cuerpo (hasta Java 8).

Declaración de constantes: Las interfaces pueden contener variables, pero estas son públicas, estáticas y finales (constantes) por defecto.

Palabra clave interface: Para definir una interfaz, se utiliza la palabra clave interface.

Implementación de múltiples interfaces: Java no permite herencia múltiple en clases, pero sí permite que una clase implemente múltiples interfaces, lo que permite simular la herencia múltiple.

Modificadores de acceso:

Los métodos de una interfaz son públicos por defecto.


Aquí tienes la tabla y contenido en formato Markdown (.md):

markdown
Copiar código
# Diferencias entre Clase Abstracta e Interfaz en Java

| **Aspecto**              | **Clase Abstracta**                                           | **Interfaz**                                                 |
|--------------------------|-------------------------------------------------------------|------------------------------------------------------------|
| **Definición**           | Se define con la palabra clave `abstract` y puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación). | Se define con la palabra clave `interface` y, por defecto, solo declara métodos abstractos (sin implementación). |
| **Herencia**             | Una clase **solo puede heredar** de una única clase abstracta (herencia simple). | Una clase puede **implementar múltiples interfaces** (simula herencia múltiple). |
| **Métodos**              | Puede tener métodos abstractos y métodos concretos.          | Hasta Java 8 solo tiene métodos abstractos. Desde Java 8 puede tener métodos `default` y `static` con implementación. |
| **Constructores**        | Puede tener constructores para inicializar datos.            | No puede tener constructores. No se puede crear una instancia de una interfaz. |
| **Variables**            | Puede tener variables de instancia y constantes.             | Solo puede contener **constantes** (variables `public`, `static` y `final` por defecto). |

---