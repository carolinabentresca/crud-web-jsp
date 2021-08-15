# crud-web-jsp

#TEMA :   Jsp-Servlet

#PROYECTO JAVA WEB :   Web Application

#PAQUETE "Modelo" : 
    
   - CLASE "Conexion" :  Conexion de la base de datos "mybd", mediante "JDBC".
    
   - CLASE "Dao" :  Clase de métodos "CRUD" ("insertar","modificar","eliminar","listar").
    
   - CLASE "usuario" :  Clase entidad(Entity), de la tabla "usuario" de la base de datos.

#PAQUETE "Servlet" :
    
   - CLASE "Ser" :  Clase Servlet, genera una "page Web",  a partir de los parametros 
        de la peticion del "index.jsp", Mediante el método "processRequest".
    
#CARPETA "WEB" : 

  - "index.jsp" :  Compuesto por un Formulario, método "POST", los parametros 
        ("btnInsert","btnUpdate","btnDelete") y "List" muestra una lista
        de datos de la tabla "usuario".
    
    
