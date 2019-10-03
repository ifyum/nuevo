# desocupar cualquier puerto

ejecutar: 


netstat -oan

buscar el puerto  en direccion local y copiar el PID
para saber el nombre del programa
ejecutar:

tasklist /svc /FI "PID eq nroPID"

PARA CERRAR EL PROGRAMA POR CMD

taskkill /F /PID nroPID

-------
eliminar contenedor de docker 
primero listar:
 
 docker ps -a
 
luego usar:
 
 docker rm id

eliminar todas las imagenes de docker

docker rmi $(docker images -a -q)