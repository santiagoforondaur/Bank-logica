# Bank-logica

Esto es una aplicacion backend que fue elaborado en el lenguaje de programacion de java y en framework de spring, en la cual se puede gestionar operaciones basicas de una cuenta bancaria (clientes, cuentas, transacciones,transferencia y intereses


Características principales


- Operaciones de deposito,retiro y transferencia
- Cálculo de intereses 
- Manejo de errores de negocio con `DomainException`
- API REST con control de respuestas HTTP



 Estructura del proyecto

 1. En el package model se encuentra las clases con sus dominios con sus atrivutos(Account,Money, Transactions,etc...)
 2. Pasamos al FileManeger el cual nos permite implementar el JSON
 3. Pasamos al JsonRepository el cual nos sirve como interfaz con el anterior paso
 4. despues creamos la clase InterestStrategy para generar el interes
 5. ya de ahi pasamos al BankService el cual es una interfaz para el controller
 6. por siguiente creamos el BankController con el cual vamos a recibir la informacion de BankService y vamos poner la api con la que podamos acceder al localhost
 7. despues abriremos la clase principal que sera BankAplication

- La api que nos permitira confirmar que si este funcionando sera la siguiente:
  http://localhost:8080/api/bank/

Thunder Client

  Para comprobar el servidor podemos ir al thunder client enviamos al new request la api de la cual estamos trabajando y enviamos la peticion

Aqui deberia ir la prueba del servidor en funcionamiento pero este querido personaje no le funcina el 8080 ni el 9090 entonces solo dejare la logica detras del proyecto para que sea entendible  




  ![images](https://github.com/user-attachments/assets/fcbe61de-7df7-4430-bf51-25d8b23f52a5)
