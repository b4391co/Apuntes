# 1. - Anclaje

### Vamos a reflexionar por qué en el diseño se ha optado por crear una clase Anclaje si ya existía la clase Anclajes.

## Responde a las siguientes preguntas sobre la clase Anclaje:

### 1.1 -¿Modela un objeto del mundo real? ¿Cuál?

Sí, modela el anclaje de una bicicleta.

### 1.2 -¿Modela un ADT? ¿Cuál?

Sí, `Anclaje`.

### 1.3 -¿Cuáles son las operaciones sobre este tipo de dato abstracto?

`isOcupado`, `getBici`, `anclarBici`, `liberarBici`, `toString`.

### 1.4 -Describe el tipo de dato correspondiente a este ADT. ¿Que tipo de dato es? ¿Incluye algún otro tipo de dato abstracto? ¿Cuál?

El ADT es `Anclaje`, también incluye la interfaz `Movil` que viene de `../bicicleta/Movil.java`.

### 1.5 -¿De qué modo reduce la complejidad del problema. Fíjate, p.e., en el método ocuparAnclaje(int posicion, Movil bici) de Anclajes.

la clase `alclaje` encapsula la lógica de un anclaje ya que se delega la gestión al objeto. 

### 1.6 -¿Aisla la complejidad? ¿Qué operaciones aisla?

Sí, aísla la complejidad de la gestión de un anclaje con las operaciones : `isOcupado`, `getBici`, `anclarBici`, `liberarBici`.

### 1.7 -¿Qué detalles de implementación esconde al resto de las clases que componen la aplicación?

Oculta los detalles de implementación de cómo se gestiona la ocupación del anclaje y qué bicicleta está anclada. El resto de las clases solo necesita interactuar con los métodos públicos de `Anclaje`, es decir `anclaje.isOcupado()` o `anclaje.getBici()` sin conocer la lógica interna.

### 1.8 -¿Limita los efectos de los cambios? Piensa un ejemplo de cómo la clase Anclaje aisla del resto del código los cambios producidos en su lógica.

No, ya que solo tendríamos que aplicar los cambios en la clase `anclaje` para que funcionasen.

### 1.9 -Indica un ejemplo de cómo facilita la reutilización del código, si es que encuentras alguno.

Se puede reutilizar, por ejemplo, si se instala una nueva estación, esta puede usar la clase `anclaje` y trabajar sobre ella.

### 1.10 -¿Empaqueta operaciones relacionadas entre sí? ¿Cuáles? ¿La clase presenta una alta o baja cohesión?

Si, la operación `toString()` utiliza `isOcupado()`.

### 1.11 -¿Consideras que la clase Anclaje ha surgido como resultado de una refactorización? ¿En qué crees que consistió esta refactorización?

Sí, de una que englobase todos los anclajes, esta, en cambio es individual. 

### 1.12 -¿De qué modo la clase respeta o viola el principio SRP? Señala un dónde y cómo lo consigue o no lo consigue.

> El principio de responsabilidad única o SRP establece que cada módulo o clase debe tener responsabilidad sobre una sola parte de la funcionalidad proporcionada por el software y esta responsabilidad debe estar encapsulada en su totalidad por la clase.

Respeta el principio SRP, `Anclaje` se encarga unicamente de la gestión de un único anclaje.

### 1.13 -¿De qué modo la clase respeta o viola el principio OCP? Señala un dónde y cómo lo consigue o no lo consigue.

> La definición de OCP es: La idea de este principio es que las clases están abiertas a la extensión pero cerradas a la modificación.

Respeta el principio OCP, ya que podemos añadir nuevas funciones y no tenemos que modificar las ya definidas.

# 2. - Anclajes

### Calidad de una clase
### Responde a las siguientes preguntas sobre la clase Anclajes:

## 2.1 - Abstraction
### 2.1.1 - ¿Cuál es el propósito central de la clase?

La gestión de los anclajes de una estación.

### 2.1.2 - ¿Está bien nombrada la clase y su nombre describe su propósito central?

Sí, `Anclajes` hace referencia a su proposito.

### 2.1.3 - ¿La interfaz de la clase deja en claro cómo se debe usar la clase?

La interfaz es clara y sus funciones indican como se deben usar.

### 2.1.4 - ¿Es la interfaz de la clase lo suficientemente abstracta como para no tener que pensar en cómo se implementan sus servicios? ¿Puedes tratar la clase como una caja negra?

>La prueba de caja negra, test funcional o prueba comportamental, es un tipo de prueba de software directa, cuya finalidad es analizar la compatibilidad entre las interfaces de cada uno de los componentes del software. No tiene en consideración la lógica interna del sistema.

La clase es lo suficientemente abstracta, los usuarios pueden tratarla como una caja negra sin necesidad de conocer los detalles internos de implementación.

### 2.1.5 - ¿Los servicios de la clase son lo suficientemente completos como para que otras clases no tengan que interferir con sus datos internos?

Son completos y manejan la gestión de anclajes sin necesidad de otras clases.

### 2.1.6 - ¿Ha pensado en subdividir la clase en clases de componentes y la ha subdividido tanto como pudo?

La clase Anclajes no está subdividida en clases de componentes.

## 2.2 - Encapsulación
### 2.2.1 - ¿La clase minimiza la accesibilidad a sus miembros?

minimiza la accesibilidad a sus miembros al definir los atributos como `private`.

### 2.2.2 - ¿La clase evita exponer los datos de los miembros?

La clase no expone sus miembros al proporcionar métodos para interactuar con los anclajes y no exponer directamente los datos internos.

### 2.2.3 - ¿La clase oculta sus detalles de implementación a otras clases?

Si, las funciones son claras y no hace falta interactuar con la estructura interna.

### 2.2.4 - ¿Evita la clase hacer suposiciones sobre sus usuarios, incluidas sus clases derivadas?

Sí, no existen superposiciones ni clases derivadas.

### 2.2.5 - ¿Es la clase independiente de otras clases? ¿Exhibe alto o bajo acoplamiento?

La clase no depende de otras clases para funcionar.
