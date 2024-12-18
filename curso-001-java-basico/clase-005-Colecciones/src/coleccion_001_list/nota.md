## LinkedList 

Es una clase que implementa la interfaz principal List. Almacena elementos en una estructura de lista doblemente 
enlazada, es decir, enlaza con el elemento de adelante y con el elemento de atlas.

Ejemplo: Imagina que tenemos un tren de vagones:

Cada vagón es como un elemento en una lista.
Los vagones están conectados uno detrás de otro.

### ¿Qué pasa si queremos agregar un nuevo vagón al medio del tren?

Simplemente, desconectamos los vagones que están a los lados del lugar donde queremos agregar el nuevo y lo conectamos.
Es fácil y rápido, ¡como jugar con bloques!
Así es como funciona una LinkedList:

Cada elemento (vagón) tiene una conexión con el elemento anterior y el siguiente.
Agregar o quitar elementos en cualquier lugar es muy fácil.
Pero si quieres encontrar un vagón en específico en medio del tren, tienes que ir contando uno por uno desde el principio.

## ArrayList

Los **ArrayLists** en Java son una estructura de datos que se utiliza para almacenar una colección de elementos. Son flexibles y dinámicos.

### ¿Cómo sería el tren si fuera un ArrayList?

Ahora imagina que nuestro tren en todos sus vagones tienen un número para identificarlo, y están ordenados por número. 0,1,2,3,4,5

Para encontrar un vagón, solo tenemos que buscar su Índice o número.
Pero si queremos agregar un (1) nuevo vagón, (uno solito) en medio digamos que en la posicion 3, tenemos que mover y sumarle a todos los vagones la cantidad de vagones que le sumaron. El puesto 4 pasa a ser el 5, el puesto 5 pasa a ser el 6 y asi. ¡Es un poco más complicado!
Así es como funciona un ArrayList:


## En resumen:

LinkedList es como un tren con vagones que se pueden conectar y desconectar fácilmente. Es bueno para cuando necesitas agregar o quitar cosas en cualquier lugar.
ArrayList es como un tren con vagones enumerados. Es bueno para cuando necesitas encontrar algo rápido, pero agregar o quitar cosas en el medio puede ser más lento.
¿Cuándo usar cada uno?

LinkedList: Cuando necesitas una lista donde puedas agregar y quitar elementos fácilmente, sin importar dónde estén.
ArrayList: Cuando necesitas una lista donde puedas buscar elementos rápidamente por su posición, y no necesitas agregar o quitar elementos muy seguido.
Ejemplo:

LinkedList: Una lista de tareas pendientes. Puedes agregar o quitar tareas en cualquier momento.
ArrayList: Una lista de los estudiantes de un salón de clases, ordenados por número de lista.