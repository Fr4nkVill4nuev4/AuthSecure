Prueba_Hasmap
20250827 - Frankling Villanueva. 
20250236 - Jonathan Rivera.

4 ---- ANALISIS REQUERIDO ----

1- ¿Por qué ArrayList o LinkedList NO son aceptables?
No es aceptable debido a que el manejo de memoria para estos casos no es tan eficiente, ya que ArrayList y LinkedList.
como primer obstaculo permiten duplicidad, aparte de ello también manejan un estricto orden de inserción y manejan la 
memoria con elementos en contigüidad de memoria y en nodos enlazados. Destaca en inserciones/eliminaciones
en el inicio o final, pero su acceso por índice es más lento ya que recorren toda la lista para buscar 

2- ¿Por qué HashSet NO resuelve el problema por sí solo?
HashSet no resuelve el problema por la ausencia de "clave" : "Valor"ya que guarda únicamente un conjunto de elementos 
únicos y no permite autenticación ya que aunque permite verificar la existencia de elementos no permite asociar 
elementos directamente

3- ¿Por qué TreeMap NO es la opción ideal?
NO es ideal por la sobre carga. Ya que organza y Ordena internamente las claves de todos sus elementos mediante un 
árbol Red-Black.tiene un rendimiento O(log n) y con el paso y escalabilidad llega un punto en el que rendimiento 
se degrada

4- ¿Cuál es la ÚNICA estructura basada en hashing que resuelve todas las operaciones en tiempo promedio constante 0(1)?
Para este caso la opcion optima es HashMap ya que utiliza una funcion de has para convertir la clave en un indice
diecto donde se almacena el valor del usuario en formato "clave" : "Valor" ofrece el mejor rendimiento para
operaciones básicas de inserción, búsqueda y eliminación

Historial de acciones:

20250827 - Frankling Villanueva 

Main.java
AuthService.java
Metodo Login
Metodo Registrar

20250236 - Jonathan Rivera.

AuthService.java
Metodo Autenticacion
Metodo Eliminar

Usuario.java

