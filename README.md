# Parcial2
https://github.com/TheBaphomet666/Parcial2.0.git
https://parcial2pinto.herokuapp.com
Se usa un API REST conectado con openweathermap.org/ en este caso sin embargo es extensible ya que se tiene ina inteface connector la cual es usada por el WeatherService con inyección de dependecias de Spring
Así mismo es extensible ya que el REST controller usa una interfaz WeatherService que es la que se encarga de ofrecer los servicios esto hace que se puedan hacer más implementaciones de esas intefaces y solo con el cambio de las anotaciones
también se usa patron modular en los javascripts