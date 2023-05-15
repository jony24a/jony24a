# Proyecto Base
> Author: Jonatan Andres Novoa Rodriguez 


## Enfoque 
En su labor como programador de software ha sido el elegido para el desarrollo de un programa que calcule las ventas de monitores, pidiendo como datos bases pedir el nombre de la persona quien compra el prodcuto, segundo pedor qie ingrese si numero de cedula, luego de eso pedir un numero de celular, apartir de esos datos bases que salga la marca del monitor que deasea las cuales son LG, SAMSUNG, ASUS, APPLE, e ingresar la cantidad de monitores, los precios ya estan estipulados para cada monitor. 

**Aclaraciones**

+ La aplicacion debe enfocar la venta de 4 marcas difernetes en la venta de monitores.
+ Los datos ya estan especificados cada uno con su precio y solo se puede ingresar una marca y la cantidad que desa llevar.
+ No almacena los datos de las personas que compran. 

## HISTORIA DE USUARIO 

Como Ing de Software quiero poder capturas lo que pide la persona, de la marca de su gusto y dar su precio total de cuantas cosas va a lleva. 

**Escenario [1]
>***Escribir Nombre, Numero de Cedula, Numero de Celular, Prodcuto que desea llevar, Cantidad que desea llevar. 

+ **Given [** Soy el Ing de Software **]**

      -Ingrese su nombre completo 
      -Ingrese su numero de cedula
      -Ingrese su numero de celular
      -Ingrese el nombre del producto que va llevar 
      -Ingrese la cantidad que desea llevar
      

+ **When [** Seleccionar las opciones para dar el resultado **]**
      
+ **Then[** Debo de poder mostrar al usuario sus datos despues de la compra, como si fuera una factura **]**

      -Nombre de la persona 
      -Numero de cedula 
      -Numero de Celular 
      -Productos que va a llevar 
      -Producto que va a llevar 
      -Suma de las cosas que va a llevar
      
##Aproximaciones de caso de uso 

     Nombre: Venta de Monitores 
     Actores: Ing de Software
     Proposito: Guardar nombre, cedula, celular, y los prodcutos que va llevar 
  
    1. El usuario debe ingresar nombre
    2. El usuario debe ingresar cedula
    3. El usuario debe ingresar celular 
    4. El usuario debe ingresar la marca que desea 
    
    Postcondiciones: Resultado Final
    
    
##Aproximacion diagrama de flujo

<p> 
      
```mermaid
flowchart TD;
    A([Inicio]) --> B["Real: saldo<br>Caracter: nombre[50], nombres[50], cedulas[50], compras[50]<br>Entero: cedula[50], compra[50], opc, numeroClientes <- 0>"] --> C["Digite su Saldo"] --> D[/Leer saldo\] --> E["Digite el numero de Clientes"] --> F[/Leer numeroClientes\] --> G["Para i <- 0 Hasta numeroClientes Con Paso 1 Hacer"] --> H["Digite su Nombre"] --> I[/Leer nombre[i]\] --> J["Digite su Cedula"] --> K[/Leer cedula[i]\] --> L["menu<br>1.LG<br>2.ASUS<br>3.APPLE<br>4.SAMSUNG<br>5.LENOVO"] --> M["Digite la opcion que desea"] --> N[/Leer opc\];
    N --> O["Segun opc Hacer"] --> P1["Escribir \"LG = 500\"<br>saldo = saldo - 500<br>Si saldo < 0 Y saldo < 500 Entonces<br>Escribir \"Saldo insuficiente\"<br>Sino<br>compra[i] = compra[i] + 500<br>FinSi"] --> O
    N --> O["Segun opc Hacer"] --> P2["Escribir \"ASUS = 300\"<br>saldo = saldo - 300<br>Si saldo < 0 Y saldo < 300 Entonces<br>Escribir \"Saldo insuficiente\"<br>Sino<br>compra[i] = compra[i] + 300<br>FinSi"] --> O
    N --> O["Segun opc Hacer"] --> P3["Escribir \"APPLE = 800\"<br>saldo = saldo - 800<br>Si saldo < 0 Y saldo < 800 Entonces<br>Escribir \"Saldo insuficiente\"<br>Sino<br>compra[i] = compra[i] + 800<br>FinSi"] --> O
    N --> O["Segun opc Hacer"] --> P4["Escribir \"SAMSUNG = 650\"<br>saldo = saldo - 650<br>Si saldo < 0 Y saldo < 650 Entonces<br>Escribir \"Saldo insuficiente\"<br>Sino<br>compra[i] = compra[i] + 650<br>FinSi"] --> O
    N --> O["Segun opc Hacer"] --> P5["Escribir \"LENOVO = 250\"<br>saldo = saldo - 250<br>Si saldo < 0 Y saldo < 250 Entonces<br>Escribir \"Saldo insuficiente\"<br>Sino<br>compra[i] = compra[i] + 250<br>FinSi"] --> O
    N --> O["De Otro Modo"] --> P6["Escribir \"opcion invalida\""] --> O
    O --> Q["nombres[i] = nombre[i]<br>cedulas[i] = ConvertirATexto(cedula[i])<br>compras[i] = ConvertirATexto(compra[i])"] --> G;
    G --> R["Para a = 0 Hasta numeroClientes Con Paso 1 Hacer"] --> S["saldo = saldo + ((compra[a] + cedula[a]) / 3) / numeroClientes"] --> T["FinPara"] --> U["Escribir \"El saldo es: \" + saldo"] --> V([Fin]);

```
      
    
      
      







