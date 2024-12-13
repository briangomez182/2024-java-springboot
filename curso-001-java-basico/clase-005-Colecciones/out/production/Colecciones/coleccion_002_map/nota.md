### Map

Un Map es una estructura de datos que se utiliza para almacenar pares clave-valor. En otras palabras, relaciona un valor (el valor) con una etiqueta única (la clave). Esto es útil cuando necesitas asociar datos relacionados. Imagina que tienes un diccionario en el que buscas una palabra (la clave) para obtener su definición (el valor). En Java, un Map funciona de manera similar. Puedes buscar un valor específico proporcionando la clave correspondiente.

Algunas características clave de los Map en Java son:

- No permite claves duplicadas: Cada clave en un Map debe ser única, lo que significa que no puedes tener dos claves iguales con valores diferentes.

- Eficiencia en la búsqueda: Los Map están diseñados para permitir una búsqueda rápida de valores asociados con una clave. Esto se logra mediante una estructura de datos optimizada, como un árbol o una tabla hash.

- Implementaciones diferentes: En Java, hay varias implementaciones de la interfaz Map, como HashMap, TreeMap y LinkedHashMap, que ofrecen diferentes comportamientos y características.

- Utilidad para el almacenamiento de configuraciones y asociaciones: Los Map son útiles para almacenar configuraciones de aplicaciones, datos relacionados y asociaciones clave-valor en general.

⚠️ **Hacer la Clase Mapas con el ejemplo de JUAN, MARIA Y PEDRO**

___

# MapasTren.class explicación y luego Codigo

### Sigamos con nuetro ejemplo del tren y los vagones que se que les gustó.

Imagina ahora que cada vagón de nuestro tren tiene un identificador unico (un número, una palabra, un hash) y que dentro de cada vagón hay una caja fuerte.

- El número del vagón sería la clave (key).
- La caja fuerte sería el valor (value).
- La relación entre el número del vagón y la caja fuerte es lo que define un Map.
- Un Map en Java es como un tren donde cada vagón tiene una identificación única y contiene un objeto específico.

### Por ejemplo:

- Vagón 1: Caja fuerte con un libro de aventuras.
- Vagón 3: Caja fuerte con un juego de mesa.
- Vagón 7: Caja fuerte con un peluche.