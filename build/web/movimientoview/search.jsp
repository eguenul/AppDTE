<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> <!?Con esto garantizamos que se vea bien en dispositivos m�viles?> 
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<script src="scripts/HistorialDte.js"></script>
<script src="scripts/ajax.js"></script>
</head>
<body> 
    
    <div align="center">
        <h1>
        BUSQUEDA DE DOCUMENTO
        </h1>
    </div>
  

    <form class="navbar-form" action="respuesta.php" method="post">
        <fieldset>
		<legend>RANGO DE BUSQUEDA:</legend>
               	<label for="FechaDesde">Desde:</label>
                <input   type="date" name="FechaDesde" id="FechaDesde">
                 <label for="FechaHasta">Hasta:</label>
		<input  type="date" name="FechaHasta" id="FechaHasta">
               <button class="btn btn-primary btn-sm" type="Button" onclick="Buscar();">
                 <span class="glyphicon glyphicon-search"></span>
                    Buscar</button>
               <button class="btn btn-primary btn-sm" type="Button" onclick="window.location='busquedafecha';">
                 <span class="glyphicon glyphicon-file"></span>
                    Nuevo</button>  
          <button onclick="window.location='index.jsp';" type="button" name="btnLimpiar" class="btn btn-primary btn-sm">
          <span class="glyphicon glyphicon-home"></span>Home 
           </button>
        </fieldset>  
                
</form>
    <div id="contenido">
    </div>

  
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
    
</html>