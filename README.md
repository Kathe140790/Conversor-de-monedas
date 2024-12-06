CONVERSOR DE MONEDAS
* Se prepara el entorno en IntelliJ
* Se importa la biblioteca en GSON
* Para este programa se uso la API: https://www.exchangerate-api.com/
* --> Para facilitar el análisis de los datos que se obtendrán de la API,
*  recomendamos el uso de herramientas como Postman.

Desarrollo
1. Empleamos la clase HttpClient para realizar solicitudes a la API de
   tasas de cambio y obtener datos esenciales. El uso de HttpClient en
   Java facilita la conexión y la obtención de respuestas de manera
   eficiente. Además, proporciona una base sólida para realizar
   operaciones HTTP de manera más estructurada y versátil.
2. en el uso de la clase HttpRequest para configurar y personalizar
  nuestras solicitudes a la API de tasas de cambio. La clase HttpRequest
  en Java nos brinda un control detallado sobre los parámetros de nuestras
  solicitudes, lo que resulta esencial para adaptar la consulta a
  nuestras necesidades específicas.
3. Para el filtrado de monedas, será necesario utilizar el atributo
4. "Currency Code" del JSON.
5. En esta aplicacion se realizará la conversion de USD a Peso Argentino,
   de USD a Peso Colombiano y de USD a Real Brasileño.
7. Se crea un menu para definir el tipo de convercion a realizar.
   Permitiendo al usuario seleccionar opciones numéricas y proporcionar
   datos para la conversión, utilizando la clase Scanner para capturar
   la entrada del usuario. 


