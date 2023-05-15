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
      
## Aproximaciones de caso de uso 

     Nombre: Venta de Monitores 
     Actores: Ing de Software
     Proposito: Guardar nombre, cedula, celular, y los prodcutos que va llevar 
  
    1. El usuario debe ingresar nombre
    2. El usuario debe ingresar cedula
    3. El usuario debe ingresar celular 
    4. El usuario debe ingresar la marca que desea 
    
    Postcondiciones: Resultado Final
    
    
## Aproximacion diagrama de flujo

      
```mermaid
flowchart TD;
    A([Inicio]) --> B["Real: saldo<br>Caracter[50]: nombre<br>Entero[50]: cedula<br>Real[50]: compra<br>Real: descuento<br>Caracter[50]: nombres<br>Caracter[50]: cedulas<br>Caracter[50]: compras<br>Caracter[50]: total<br>Entero: opc<br>Entero: numeroClientes"] --> C{{Digite su saldo}} --> D[/Leer saldo\] --> E{{Digite el numero de Clientes}} --> F[/Leer numeroClientes\] --> G["Para i <- 0 Hasta numeroClientes Con Paso 1 Hacer"/];
    G --> H{{Digite su Nombre}} --> I[/Leer nombre[i]\] --> J{{Digite su Cedula}} --> K[/Leer cedula[i]\] --> L["menu<br>1.LG: 500<br>2.ASUS: 300<br>3.APPLE: 800<br>4.SAMSUNG: 650<br>5.LENOVO: 250"] --> M{{Digite la opcion que desea}} --> N[/Leer opc\];
    M -- 1 --> O["saldo <- saldo - 500<br>Si saldo < 0 Y saldo < 500 Entonces<br>Escribir Saldo insuficiente<br>Sino<br>compra[i] <- compra[i] + 500<br>FinSi"];
    M -- 2 --> P["saldo <- saldo - 300<br>Si saldo < 0 Y saldo < 300 Entonces<br>Escribir Saldo insuficiente<br>Sino<br>compra[i] <- compra[i] + 300<br>FinSi"];
    M -- 3 --> Q["saldo <- saldo - 800<br>Si saldo < 0 Y saldo < 800 Entonces<br>Escribir Saldo insuficiente<br>Sino<br>compra[i] <- compra[i] + 800<br>FinSi"];
    M -- 4 --> R["saldo <- saldo - 650<br>Si saldo < 0 Y saldo < 650 Entonces<br>Escribir Saldo insuficiente<br>Sino<br>compra[i] <- compra[i] + 650<br>FinSi"];
    M -- 5 --> S["saldo <- saldo - 250<br>Si saldo < 0 Y saldo < 250 Entonces<br>Escribir Saldo insuficiente<br>Sino<br>compra[i] <- compra[i] + 250<br>FinSi"];
    M -- Otro --> T["Escribir opcion invalida"];
    N --> U["nombres[i] <- nombre[i]<br>cedulas[i] <- ConvertirATexto(cedula[i])<br>compras[i] <- ConvertirATexto(compra[i])"];
    G --> V["Para a <- 0 Hasta numeroClientes Con Paso 1 Hacer"/];
    V --> W["saldo <- saldo + ((compra[a] + cedula[a]) / 3) / numeroClientes"];
    W --> V;
    V --> X{{Escribir El saldo es: + saldo}} --> Y([Fin]);


```

</details>

<br style="height:100px;"></br>
      
    
      
      







