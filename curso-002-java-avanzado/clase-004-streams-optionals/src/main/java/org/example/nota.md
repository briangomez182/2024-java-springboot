# ✨ Tipos de Datos Convertibles a Streams en Java

## 1. 🔧 Tipos de Datos
En Java, puedes convertir los siguientes tipos de datos a un **Stream**:

- **Colecciones (`Collection`)**: Las listas que vimos.
- **Arreglos (`Array`)**: Incluye vectores.
    - Usa el método `Arrays.stream()` o `Stream.of()`.
- **Mapas (`Map`)**: Las claves, valores o entradas.
- **Cadenas (`String`)**: Convierte a un Stream de caracteres.

---

# 🔄 Operaciones Intermedias

## 2. 🌐 Transformaciones
- **`filter`**: Filtra elementos que cumplen una condición.
- **`map`**: Transforma cada elemento en otro.
- **`flatMap`**: Descompone estructuras complejas en un único Stream.
- **`distinct`**: Elimina duplicados.
- **`sorted`**: Ordena los elementos.

## 3. 🌟 Acciones en el Stream
- **`peek`**: Realiza una acción en cada elemento sin modificarlo.
- **`limit`**: Reduce el Stream a un número máximo de elementos.
- **`skip`**: Omite los primeros elementos del Stream.

---

# ⚖️ Operaciones Terminales

## 4. ✅ Búsqueda y Verificación
- **`findFirst(Predicate)`**: Encuentra el primer elemento que cumple la condición.
- **`findAny(Predicate)`**: Encuentra cualquier elemento que cumple la condición.
- **`allMatch(Predicate)`**: Verifica si todos los elementos cumplen la condición.
- **`anyMatch(Predicate)`**: Verifica si al menos un elemento cumple la condición.
- **`noneMatch(Predicate)`**: Verifica si ningún elemento cumple la condición.

## 5.  ✅ Recolección y Reducción
- **`collect(Collector)`**: Recolecta los elementos en una estructura mutable (como lista o mapa).
- **`toArray()`**: Convierte los elementos del Stream en un arreglo.
- **`reduce(BinaryOperator, accumulator)`**: Combina los elementos en un único resultado usando una función acumuladora.

## 6.  ✅ Estadísticas y Acciones
- **`count()`**: Cuenta el número de elementos en el Stream.
- **`average()`**: Calcula el promedio de elementos numéricos.
- **`sum()`**: Suma los elementos numéricos del Stream.
- **`forEach(Consumer)`**: Realiza una acción en cada elemento del Stream.

---

