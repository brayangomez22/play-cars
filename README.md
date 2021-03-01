# CHALLENGE - DISEÑANDO UN CRUD DESDE CERO - GRUPO VERDE #

## Summary ##

En este reto tenemos la intención de diseñar un CRUD desde cero usando las tecnologías de Spring Boot + MySQL + ReactJS (o angular). Se espera resolver este reto en 4 dias, donde el problema se presentaría en el caso de uso, en el momento de iniciar el reto.

## Use Case/Problem ##

Crear un juego donde se pueda evidenciar los conceptos de Spring Boot + MySQL + ReactJS (o angular) - Full Slack. Este juego debe ser desarrollado bajo el concepto de Cliente - Servidor (Frontend y Backend).

Lo que se busca en este **juego** es crear unos **carros** y posicionarlo en una **pista** (cada carro tiene un **conductor**), puede existir tantos **carros** como **carriles**, cada pista deberá tener el mismo **limite de distancia** (kilómetros) para el recorrido del **carro**, los carros **avanzan de forma aleatoria** aumentado su **distancia** por medio de **metros** (los kilómetros de debe convertir a metros para que el avance sea en metros)

Cada avance debe existir un **dado** (de 1 a 6) que permita mover el **carro** y se debe multiplicar por 100, donde si se tira el dado y sacas 5 entonces debería ser 5\*100 = 500 metros de recorrido.

Al final debe existir un **podio** donde se clasifique **primer**, **segundo** y **tercer ganador**.

## Funcionalidades ##

 *  **Configurar Juego**\: Crear juego con jugadores, el juego debe tener los limites de kilómetros por cada pista (un jugador puede ser un conductor y un conductor debe tener un carro asociado y un carro debe estar asociado a un carril que a su vez debe estar en una pista)
 *  **Iniciar el jueg**o: iniciar con un identificado del juego, se debe tener la lista de carros en donde se pueda iterar y avanzar según la posición de la pista o carril, esto debe ser de forma aleatoria (por medio del dado).
 *  **Asignar podio (fin del juego)**\: Se debe seleccionar primer, segundo y tercer lugar en la medida que los carros llegan a la meta (asignar al podio).
 *  **Guardar datos**\: Se debe persistir los resultados con los nombres de los conductores en la posición del podio y agregar un contador de las veces que ha ganado.
 *  **Refrescar constantemente**\: se debe tener una ventana donde se pueda refrescar de forma automática los resultados del juego, así ver en tiempo real cómo esta avanzando el carro.

  


## Evaluation criteria ##

| Criteria                                                                                               | Percentage |
| ------------------------------------------------------------------------------------------------------ | ---------- |
| Aplica los principios de programación orientada a objetos                                              | 30.0 %     |
| Creación de objetos de entidades; pista, juego, carril, carro, conductor, jugador, podio (no anémicas) | 30.0 %     |
| Cumple con las funcionalidades descritas dentro del caso de uso                                        | 40.0 %     |