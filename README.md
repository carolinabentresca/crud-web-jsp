# crud-web-jsp

#TEMA :   Jsp-Servlet

#PROYECTO JAVA WEB :   Web Application

#PAQUETE "Modelo" : 
    
   - CLASE "Conexion" :  Clase Conexion de la base de datos "mybd", mediante "JDBC".
    
   - CLASE "Dao" :  Clase de métodos "CRUD" ("insertar","modificar","eliminar","listar").
    
   - CLASE "usuario" :  Clase entidad(Entity), de la tabla "usuario" de la base de datos.

#PAQUETE "Servlet" :
    
   - CLASE "Ser" :  Clase Servlet,genera una "page" web, a partir de los parametros de la peticion "JSP" 
         ("btnInsert", "btnUpdate","btnDelete")mediante el método "processRequest". 
    
#CARPETA "WEB" : 

  - "index.jsp" :  "Java Server Pages", Compuesto por un Formulario, método "POST", 
        los parametros de la peticion ("btnInsert","btnUpdate","btnDelete") 
        y un "List"(lista de usuarios) que muestra los datos de la tabla "usuario".
    
    
