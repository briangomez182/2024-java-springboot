# 🍽️ Sistema de Gestión de Pedidos de Comida

Estamos desarrollando un sistema para gestionar pedidos de comida en un restaurante.
El objetivo es crear una **API RESTful** utilizando **Spring Boot** que permita a los clientes:

✅ Realizar pedidos.
✅ Agregar nuevos platos al menú.
✅ Verificar el estado de un pedido.

## 📌 Endpoints a Implementar

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| **GET** | `/menu?tipoMenu=vegetariano` | Devuelve la lista completa de platos disponibles en el menú o filtrados por `tipoMenu` si es enviado. |
| **POST** | `/menu/agregar` | Permite agregar un nuevo plato al menú. |
| **GET** | `/pedido` | Permite a un cliente realizar un nuevo pedido. |
| **POST** | `/pedido/agregar` | Permite a un cliente realizar un nuevo pedido. |
| **GET** | `/pedido/{id}` | Devuelve la información detallada de un pedido específico por su ID. |

## 🛠️ Consideraciones

💡 **Nota:** Utilizar como base de datos una **Collection** a elección para evitar la configuración de bases de datos.

## 🧪 Pruebas

1. Una vez creados todos los endpoints, realizar pruebas de cada uno de ellos mediante **Postman**.
2. Exportar la **colección** de Postman y guardarla.

🚀 ¡Manos a la obra!
