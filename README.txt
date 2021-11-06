
Se debe instalar el WAR CacheTest.war, en los servidores manejados agregaremos un argumento el cual selecciona 
el archivo ecache.xml que se utilizara

-Decache-file=<ruta_archivo>

Se encuentran tres archivos de cache diferentes

1. ecache-0.xml : Cache generico que no utiliza replicacion

2 ecache-1.xml y ecache-2.xml : Cache que define multicast como mecanismo de replicación para cada servidor
  se debe utilizar un archivo diferente, ya que estos definen un puerto diferente para poder intregrarse 

3. ecache-conf : Otro esquema por RMI registrando cada maquina sin hacer uso de multicast





