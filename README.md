# ArrayExercisEldar


Ejercicio 

Dado un array de strings, unir todos los elementos del array con espacios, convierta todas las letras a minúsculas y envíe el resultado a
'stdout'.

#### Ejemplo:
my_array = ["FirstWord", "SecondWord", "THIRDWORD"]
Resultado esperado: "firstword secondword thirdword" sin comillas.

#### Restricciones
• La longitud de la matriz no supera los 10.

• Cada elemento del array contiene una cadena de letras en inglés solo, ascii[a-z, A-Z] y espacio, ascii[32].



## Solución propuesta:

Para solucionar este ejercicio, se emplea un StringBuilder para construir eficientemente la cadena resultante. Se recorre el array de strings y, para cada elemento, se añade a nuestro StringBuilder. Se añade un espacio entre cada palabra, excepto antes de la primera palabra. Finalmente, antes de añadir la palabra al StringBuilder, se convierte a minúsculas usando el método toLowerCase().


