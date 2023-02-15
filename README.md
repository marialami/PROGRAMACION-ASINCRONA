# PROGRAMACION-ASINCRONA

Una pastelería tiene un sistema para controlar el estado de un pedido el cual puede encontrarse en el estado pendiente, pagado y recibido, sin embargo para poder pasar al estado pagado yo debo realizar el pago, el cual podría efectuarse correctamente o no. Este proceso se hace por medio de una promesa en donde se intenta hacer el pago y se buscan dos resultados en el cual se puede completar el pago o no para poder avanzar a la siguiente etapa de mi pedido. Para esto se utilizan dos hilos de ejecución, uno en el que se ejecuta la promesa que intenta realizar un pago, y otro que mientras tanto informa al usuario que el pago se está realizando y este se ejecuta hasta recibir el resultado de la promesa.


> ### Diego Alejandro Prado
> ### Maria Lucia Lacouture
> ### María Paula Acero 
