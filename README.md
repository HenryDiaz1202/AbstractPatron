# Patrones de diseño


## Patrones de creación

### ◙ -> Abstract Factory (Fábrica abstracta): Proporciona un contrato para la creación de familias de objetos relacionados o dependientes sin tener que especificar su clase concreta.

![](images/abstract.png)


### ◙ -> Builder (Constructor): Simplifica la creación de objetos complejos definiendo una clase cuyo propósito es construir instancias de otra clase.

![](images/builder.png)

### ◙ -> Factory Method (Método de fabricación): Permite definir un método estándar para crear un objeto, además del constructor propio de la clase, si bien la decisión del objeto a crear se delega en las subclases.

![](images/interfaz.png)


En este ejercicio, el cero representá a la figura cuadrado, así que en el input que dice Introduce tipo de figura, ponemos 0 y en el siguiente ponemos el valor del lado del cuadrado, en cambio el 1 representaría el círculo pero si no lo ponemos, simplemente ponemos cualquier valor y siempre será el círculo.

![](images/claseFRY.png)

Usamos 3 clases diferentes, en cada clase hay código específico para cada una, en círculo y cuadrado pedimos los datos, que es el lado y una función para dibujar las figuras.

![](images/claseCIR.png)

En la siguiente clase está la fábrica, donde se hace una instacnia de la clase correspondiente.

![](images/facbrica.png)

Y la clase llamada PruebaFactoria.java, se encargar de diseñar la interfaz que se mostró al principio.


### ◙ -> Prototype (Prototipo): Facilita la creación dinámica al definir clases cuyos objetos pueden crear copias de sí mismos.


### ◙ -> Singleton (Único): Permite tener una única instancia de una clase en el sistema, además de permitir que todas las clases tengan acceso a esa instancia.


![](images/single.png)

Aquí se aplica lo que es el singletón, hacemos la instancia.


![](images/APLSINGLE.png)

Lo siguiente es para conectar con base de datos POSTGRESQL, podemos descargar el POSTGRESQl, también podemos descargar por externo el jdbc para realizar la conexión.
