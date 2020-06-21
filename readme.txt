hola a todos.

Esta es una sencilla aplicacion para generar diccionarios. 

Utilizo este un metodo recursivo con estructura de arbol para generar las combinaciones. La razon de esto es no sobrecargar la memoria y
tener mayor control sobre cual grupo de combinaciones queremos y cuales no.

Primeramente te pide un string el cual sera el conjunto de caracteres con los cuales se trabajara
Segundo el numero maximo de caracteres de la combinacion
Los indices en los cuales queremos que el proceso ocurra--Este punto es algo dificil de explicar pero lo intentare jejej

 Interamos sobre los caracteres del string a los cuales le queremos aplicar el procedimiento
 Se crea el arbol de combinaciones tomando como raiz la posicion presente del string y el string completo ingresado
 Si se quiere que las combinaciones en el archivo de salida tengan alguna coincidencia se puede modificar el metodo guardarCoincidencias de la clase nodo y recomplila el programa.
 Trabajare en mejorar este detalle en versiones posteriores
 Todas las combinaciones se depositaran en un archivo de texto llamado diccionario.txt el cual se recreara cada vez que se inicie el programa perdiendo toda informacion anterior



ejemplo de salida 

string abc
longitud maxima : 3 caracteres

a -> nodo raiz 0
aa ->combinaciones hijas
aaa
aab
aac
ab
aba
abb
abc
ac
aca
acb
acc
b--> nodo raiz 1
...
