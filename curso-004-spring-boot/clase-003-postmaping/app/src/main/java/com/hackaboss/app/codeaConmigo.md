Sistema de Gestión de Pedidos de Comida

Estamos desarrollando un sistema para gestionar pedidos de comida en un restaurante.
El objetivo es crear una API RESTful utilizando Spring Boot que permita a los clientes 
realizar pedidos, agregar nuevos platos al menú y verificar el estado de un pedido.
Para esto se solicita implementar lo siguientes endpoints:


GET /menu: Devuelve la lista completa de platos disponibles en el menú.
GET /pedido/{id}: Devuelve la información detallada de un pedido específico por su ID.
POST /pedido: Permite a un cliente realizar un nuevo pedido.
POST /menu/agregar: Permite agregar un nuevo plato al menú.

💡Nota: Utilizar como base de datos una Collection a elección para evitar todavía la 
configuración de Bases de Datos.

Una vez creados todos los endpoints, realizar pruebas de cada uno de ellos mediante Postman.
Una vez finalizadas, exportar la “colección” de Postman y guardarla.