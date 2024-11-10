# Ejercicio 1: Repositorio Local

#### 1.
```Shell
1. Realizar un primer commit en el que añades dos ficheros .txt Uno con tu nombre y otro con el nombre actividades; por ejemplo (sabela.txt y actividades.txt). En el primero introduce una breve descripción de ti y en el segundo añade alguna de tus aficciones (leer, hacer deporte, etc.):

    $ nano marcos.txt
    $ nano actividades.txt
    $ git add .
```

#### 2.
```Shell
2. Realizar otro commit modificando el primer .txt añadiendo una nueva línea, comentando por qué estás en este ciclo:

    $ nano marcos.txt
    $ git add .
    $ git commit -m "Primeiro .txt modificado"
```

#### 3.
```Shell
3. Crear una carpeta con dos ficheros, todo desde linea de comados:

    $ mkdir Ejercicio1
    $ mv marcos.txt /Ejercicio1
    $ mv actividades.tct /Ejercicio1
```

#### 4.
```Shell
4. Realizar otro commit con las siguientes modificaciones:

    $ nano actividades.txt
    $ nano .gitignore 

(dende o nodo raíz do repositorio, dentro desde arquivo escribimos o nome da carpeta da que non queremos facer un seguimento)
```

#### 5.
```Shell
5. Realiza un checkout para volver a las primeras versiones de los ficheros .txt (el primer commit):

    $ git log

(Copiamos o id do commit que remeos restablecer, neste caso: 023960b8ef614ab880838211136995901566ba99)

    $ git checkout 023960b8ef614ab880838211136995901566ba99
    $ git push origin master
```

# Ejercicio 2: Trabajando con repositorios locales.

#### 1.
```Shell
1. Crear un repositorio nuevo (todo desde línea de comandos) con el nombre pagina_web y muestra su contenido desde línea de comandos:

    $ mkdir Ejercicio2
    $ mkdir pagina_web
    $ more pagina_web
```

#### 2.
```Shell
2. Comprueba y explica el estado del repositorio: 

    $ git status

· Tenemos diferentes archivos que no se encuentran en el seguimeinto de git, los cuales son: ".gitignore" y "comandos.md"
```

#### 3.
```Shell
3. Crear un fichero index.html con el siguiente contenido:

    $ nano index.html
(Copiamos el contenido otorgado por el profesor)
```

#### 4.
```Shell
4. Realizar un commit con el mensaje "Primera página html":

    $ git add .
    $ git commit -m "Primera página html"
```

#### 5. 
```Shell
5. Muestra y explica el estado del repositorio:

    $ git status

· Que, al igual que antes, tenemos diferentes archivos los cuales se encuentran sin seguimiento, los cuales son: ".gitignore" y "comandos.md"
```

#### 6.
```Shell
6. Cambiar la página web para que muestre en un listado 3 ciudades que te gustaría visitar:

    $ nano index.html
```

#### 7.
```Shell
7. Hacer un commit de los cambios, con el mensaje “Añadidas 3 ciudades que visitar":
    $ git add .
    $ git commit -m "Añadidas 3 ciudades que visitar"
```

#### 8.
```Shell
8. Muestra el historial de commits del repositorio:

    $ git log
```

#### 9.
```Shell
9.Crea una carpeta por cada ciudad que hayas indicado en el listado anterior. Introduce dentro de cada carpeta un fichero index.html con información por cada ciudad:

    $ mkdir oslo
    $ cd oslo
    $ nano oslo.html
    $ cd .. 
    $ mkdir venecia
    $ cd venecia
    $ nano venecia.html
    $ cd ..
    $ mkdir bilbao
    $ cd bilbao
    $ nano bilbao.html
```

#### 10.

```Shell
10. Hacer un commit de los cambios, con el mensaje “Añadida información sobre las ciudades a visitar”:

    $ git add .
    $ git commit -m "Añadida información sobre las ciudades a visitar"
```

#### 11.
```Shell
11. Volver a mostrar el historial de cambios:

    $ git log
```

# Ejercicio 3: Fundamentos de GIT

#### 1.
```Shell
1. Crear un repositorio nuevo con el nombre libro y mostrar su contenido. Comprueba el estado del respositorio:

    $ mkdir libro
    $ more libro
```

#### 2.
```Shell
2. Crerar un fichero indice.txt con el siguiente contenido:

    $ nano indice.txt
```

#### 3. 
```Shell
3. Realizar un commit con el mensaje “Añadido índice del libro”:

    $ git add .
    $ git commit -m "Añadido índice del libro"

```
#### 4.
```Shell
4. Comprueba y explica el estado del repositorio:

    $ git status

Como de todas las veces que hicimos git add . no lo hicismo desde la misma carpeta, sino que no salimos de /ud02, seguimos teniendo los mismos archivos en no seguimiento.
```

#### 5. 
```Shell
5. Cambiar el índice.txt para que contenga lo siguiente:

    $ nano indice.txt
```

#### 6. 
```Shell
6. Hacer un commit de los cambios con el mensaje “Añadido 4: La bella y la bestia”. Comprueba el estado del repositorio.


    $ git add .
    $ git commit -m "Añadido 4: La bella y la bestia"
    $ git status
```

#### 7. 
```Shell
7. Muestra el historial del repositorio:

    $ git log
```

#### 8. 
```Shell
8. Crea la carpeta capítulos y dentro de ella el fichero capitulo2.txt con el siguiente texto:

    $ mkdir capitulos
    $ cd capitulos
    $ nano capitulo2.txt
```

#### 9. 
```Shell
9. Hacer un commit con el mensaje “Añadido capitulo 2”:

    $ git add .
    $ git commit -m "Añadido capitulo 2"
```

#### 10. 
```Shell
10. Volver a mostrar historial de cambios:

    $ git log
```

#### 11. 
```Shell
11. Crear el fichero capitulo3.txt en la carpeta capitulos con el sigueinte texto:

    $ nano capitulo3.txt
```

#### 12.
```Shell
12. Ver el estado del repositorio de forma abreviada e indicar qué significa cada letra.


    $
```

#### 13.
```Shell
13. Modificar el índice.txt añadiendo “Capitulo 5: Frozen"

    $ cd ..
    $ nano indice.txt
```

#### 14.
```Shell
14. Subir los cambios al repositorio ingorando el capitulo3.txt:

· Nos dirigimos al archivo .gitignore del nodo raíz y escribimos el nombre del archivo que no queremos que tenga seguimiento, en este caso: "capitulo3.txt"

    $ git add .
    $ git commit -m "Ignorado archivo capitulo3.txt"
    $ 
```

#### 15.
```Shell
15. Modificar el fichero para que se ignoren todos aquellos ficheros que comiencen por _ a excepción del fichero _ayuda.txt (ya no se debe ignorar capitulo3.txt):

    · Escribimos "_*" y "!_ayuda.txt"
```

#### 16.
```Shell


    $ nano _logs.txt
```

#### 17.
```Shell


    $ nano _ayuda.txt
```

#### 18.
```Shell


    $
```


#### 19.
```Shell


    $
```

#### 20.
```Shell


    $
```

#### 21.
```Shell


    $
```

#### 22.
```Shell


    $
```

#### 23.
```Shell


    $
```

#### 24.
```Shell


    $
```

#### 25.
```Shell


    $
```

#### 26.
```Shell


    $
```

#### 27-
```Shell


    $
```