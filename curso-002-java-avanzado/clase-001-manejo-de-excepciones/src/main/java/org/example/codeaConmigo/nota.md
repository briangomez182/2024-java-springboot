Crea una aplicación en Java que gestione una lista de empleados. Cada empleado tendrá un nombre, un apellido y un salario. Deberás implementar las siguientes funcionalidades:

Crear una clase personalizada de excepción llamada InvalidSalaryException, que se lance cuando se intente asignar un salario negativo o mayor a 100,000.
En la clase principal:
Crea un método addEmployee que reciba el nombre, apellido y salario de un empleado. Este método deberá lanzar la excepción InvalidSalaryException si el salario es inválido.
Usa un bloque try-catch-finally para controlar la excepción al intentar agregar empleados. En el bloque finally, informa al usuario que la operación ha concluido (independientemente de si se agregó el empleado o no).
Muestra un mensaje adecuado si ocurre una excepción y permite continuar con la ejecución.