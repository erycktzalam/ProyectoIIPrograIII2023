# ProyectoIIPrograIII2023

# Descripccion del proyecto:
Matriz Ortogonal creada a partir de listas enlazadas para crear la matriz de forma dinamica.

Se crea una clase Nodo con 4 enlaces arriba, abajo, derecha, izquierda junto con sus metodos set y get, en el constructor de la clase nodo se pasa un vehiculo como parametro y se inicializa a null todos
sus apuntadores.

La clase Vehiculo tiene sus propiedades de placa, color, linea, modelo y propietario. 

La clase Matriz crea una matriz de nodos, se pasa como parametro la filas y columnas que debe tener la matriz y el dato que se almacena en cada espacio de la matriz que en este caso son los
datos del vehiculo.

Entre los metodos de la clase matriz esta el de insertar, buscar y eliminar.

El metodo inicializarMatriz establece todas la referencias de cada nodo de la matriz.

El metodo imprimirMatriz recorre la matriz y obtiene los datos de cada vehiculo ingresado y luego los muestra en consola.


# Indice


1....Introducción

2....Objetivos

3....Funcionamiento del Programa

4....Manual del Usuario

5....Solucion de Algunos Problemas

# Introduccion:

Acontinuacion se presentara lo realizado en el proyecto 2 del curso de programacion 3, lo implementado dejara ver lo aprendedido en clase, como la lista dinamicas entre otros, ademas de como funciona una matriz con distintos datos, como hacer la inserccion de datos, busqueda y eliminacion todo a traves de una serie de datos ingresados manualmente por el usuario los cuales se presentaran en el funcionamiento del programa para tener un mayor entendimiento de como funciona, ademas de ver como el programa aprovecha al maximo la memoria sin desperdiciar espacios o tenerlos solo para cumplir con el tamaño de la matriz directamente.


# Objetivos:

Uno de los objetivos principales del programa o proyecto es conocer el manejo de matrices dinamicas, nodos, listas todo esto implementado en el programa en varios metodos utilizados, para el desarrollo a su maximo a traves de lo solicitado para la debida ejecucion del programa.

Conocer como funcionan las matrices dinamicas dentro de Java para que estas logren su debido funcionamiento sin ninguna dificultad y el objetivo principal pueda cumplirse que es saber como utilizar el maximo espacio de una matriz sin desperdiciar espacios o tenerlos como un espacion sin utilizar.

Reconcer la busqueda y eliminacion a traves de listas o nodos dentro del programa, para que la logica del programa siga las normas de las matrices dinamicas y cumplir los objetivos del debido funcionamiento del programa, reconociendo que la matriz tambien debe de tener una funcion dinamica dentro del programa.

Saber como funcionan los metodos o funciones ya mencionados anteriormente y colocarlos todos en la matriz para que se logre la busqueda, insercion y eliminacion de algun dato del vehiculo sin necesidad de desperdiciar espacios o llenar espacions solo para cumplir con el tamaño de la matriz o de lo solicitado por el usuario, en pocas palabras aprovechar al maximo la memoria.

# Manual del Usuario:

# Funcionamiento del Programa:

Acontinuacion encontrara una guia de como utilizar el programa y tener un maximo rendimiento al igual solventar cada una de las dudas que se puedan llegar a presentar durante el uso de dicho programa

Menu:
Como primer punto al momento de ejecutar el programa se presentara el siguiente menu con las opciones ya mencionadas anteriormente las cuales son, eliminar, buscar, insertar y salir del programa, se veria de la siguiente manera.

![image](https://user-images.githubusercontent.com/91577396/235283825-f678f4c2-4d3f-4ab6-90bf-0edf09060baf.png)

Opción 1:
Iniciemos con la primera opcion el eliminar datos, al momento de ingresar el numero, nos podemos percatar que se iniciara la opcion de eliminacion ya ingresada en el main del programa, esta opcion de eliminar puede ser editada por el usuario sin ningun problema e ingresar el dato que desea eliminar sobre el vehiculo veamos como funciona por supuesto ya debio de ingresa datos con la opcion 3.

![image](https://user-images.githubusercontent.com/91577396/235283929-795e9b9b-d218-4b6b-9803-31ad5070b986.png)

Opción 2:
Seguido de esta opcion como podemos ver tenemos la busqueda, esta opcion se utiliza igual que la anterior el usuario puede ingresar el valor de manera manual y el programa iniciara la busqueda dentro de la matriz dinamica, este dato puede ser cualquiera por ejemplo si el usuario ingreso un dato al inicio este tambien se puede buscar directamente dentro de los espacios de la matriz aprovechando todos los espacios sin desperdiciar veamos como funciona la opcion 2

![image](https://user-images.githubusercontent.com/91577396/235284035-3338c5e7-e916-4e60-b8fa-db7104d1df0f.png)

Como vemos no son datos que hemos ingresado anteriormente pero si ingresamos el dato que iniciamos, la busqueda sera exitosa como vemos el dato que ingresamos al incio se encontro exitosamente y el programa lo mostro tanto descrito en la respuesta como tambien puede hacerlo dentro de la matriz

![image](https://user-images.githubusercontent.com/91577396/235284112-1bb1b5bf-893e-467c-9726-617f60d8fb88.png)

Opción 3:
Iniciemos una de las ultimas opciones que seria la de insertar, como sabemos esta puede ser la primera que debamos utilizar para tener datos ingresados al momento de buscar y eliminar o de lo contrario tendremos los predeterminados del programa y no tendremos mayor cosa por hacer, veamos el dato que queremos ingresar sera el mismo que buscamos para que veamos que se logro tanto la busqueda como la insercion del dato

![image](https://user-images.githubusercontent.com/91577396/235284175-93bf2d70-c765-4b92-be7d-75fd8a579a9a.png)

Ahora podemos ver como el programa agrega el dato dentro de la posicion y luego dentro de la matriz para que el usuario pueda presenciarlo de ambas formas y se vea que la matriz esta agregando datos de manera exitosa sin desperdiciar espacios dentro de la misma.

Opción 4:
Como ultima opcion tenemos la de salir, esta no requiere una gran explicacion pero el usuario en cualquier momento que desea salir del programa puede ingresar el dato y este se cerrara automaticamente acabando con la compilacion de la matriz.

![image](https://user-images.githubusercontent.com/91577396/235284239-29053eea-65ff-4d2f-9cc6-30c08e4657d2.png)


# Solucion de algunos Problemas 
El programa en algun momento puede llegar a ser muy complicado, pero el entendimiento del mismo esta en llegar a saber como funciona una matriz dinamica, por lo que al momento de ejecutar el programa el usuario debe de ingresar datos de una manera manual a traves de la clase Main, luego estos se representaran en la matriz y el usuario podra ir navegando con las opciones del menu al igual estos datos deben de ser datos que concuerden con lo requerido del programa sin ingresar datos que el programa no pueda soportar.
