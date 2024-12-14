## 1. Crear archivos y ejecutables en C:
```Shell
#La extensión para los archivos programados en c es '.c'
1. Creamos el archivo base, utilizaremos el editor "nano":

    $ nano HolaMundo.c


2. Una vez haya sido creado, ejecutamos el siguiente comando:

    #Lo que hace el parámetro '-o' es darle un nombre de salida al ejecutable.
    $ gcc HolaMundo.c -o HolaMundo_Ejecutable


3. Para ejecutar dicho archivo, utilizaremos el comando:

    $ ./HolaMundo_Ejecutable
```


## 2. Crear archivos y ejecutables en Java:

Hace falta tener en cuenta, que dentro de todos los archivos java, hay que llamar a la clase por el MISMO NOMBRE QUE EL DEL ARCHIVO.

```Shell
#La extensión para los archivos programados en Java es '.java'

1. Creamos el archivo base, utilizaremos el editor "nano":

    $ nano HolaMundo.java


2. Descargamos los archivos necesarios, para ello, ejecutamos el siguiente comando:

    #El número puede variar en función de la version instalada.
    $ sudo apt install openjdk-11-jdk-headless


3. Una vez descargados, compilamos el programa de java:

    $ javac HolaMundo.java


4. Una vez nos haya dado como salida el archivo "HolaMundo.class", ejecutamos dichos archivo:

    $ java HolaMundo
    #Observamos como no tenemos que escribir la extensión del archivo '.class' a ejecutar.
```


## 3. Crear archivos y ejecutables en Python:

```Shell
#La extensión para los archivos programados en Python es '.py'

1. Creamos el archivo base, utilizaremos el editor "nano":

    $ nano HolaMundo.py


2. Ejecutamops dicho script sin necesidad de compilador:

    $ python3 HolaMundo.py
```