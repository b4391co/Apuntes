## 5- Asegúrate de que tienes bien configurado XDebug y que eres capaz de realizar depuración en tu código.


#### la línea de código que se acaba de ejecutar (señálala expresamente o indica en un texto de qué línea se trata)

#### el valor de la variable que contenga el código de familia que se acaba de añadir

#### el contenido del array superglobal $_COOKIE. Explica en la propia imagen por qué no está presente el código de familia que se acaba de añadir a la cookie

<div align='center'><img src='./.assets/20240131011531.png'/></div>

## 6- Sitúa puntos de ruptura en la instrucción session_start(). Muestra en sendas capturas:

#### a) valor de la directiva `session.auto_start`

<div align='center'><img src='./.assets/20240131171232.png' height='250px'/></div>

#### b) antes de ejecutarse `session_start()`, ¿existe `$_SESSION`? ¿Por qué?

<div align='center'><img src='./.assets/20240131170414.png'/></div>

Al tener `session.auto_start=0` no se inicia al ejecutar el script, por lo tanto la superglobal `$_SESSION` se inicializa cuando se ejecute ` session_start()`.
#### c) justo después de ejecutarse `session_start()` ¿existe `$_SESSION`?¿Está vacía?¿Por qué?

<div align='center'><img src='./.assets/20240131170445.png'/></div>

Después de ejecutarse `session_start()`, se espera que `$_SESSION` exista.