# crud-web-jsp

#TEMA:  Jsp-Servlet

#PROYECTO JAVA WEB:  Web Application

#PAQUETE "Modelo": 
    
   -CLASE "Conexion": Clase de Conexion de la base de datos "mybd", mediante "JDBC".
    
   -CLASE "Dao": Clase compuesta por los métodos "CRUD", 
    ("insertar","modificar","eliminar","listar").
    
   -CLASE "usuario": Clase "usuario", entidad(Entity), de la tabla "usuario" de la base de datos.

#PAQUETE "Servlet":
    
   -CLASE "Ser": Clase Servlet, que genera una "page" web, a partir de los parametros de la peticion de "JSP" 
    ("btnInsert", "btnUpdate","btnDelete" mediante el método "processRequest". 
      En el método se instancia la clase "Dao","usuario".
    
#CARPETA "WEB": 

  -"index.jsp": Es un "Java Server Pages", Compuesto por un Formulario, con el método "POST", 
    los parametros de la peticion ("btnInsert","btnUpdate","btnDelete") 
    y una "List"(lista de usuarios) que muestra los datos de la tabla "usuario".
    
    
