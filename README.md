# Aplicaciones_Mobiles_semana_3
compra online
# Proyecto: Sistema de Cálculo de Despacho

## Introducción
Este proyecto corresponde a un caso de estudio de una empresa de distribución de alimentos que implementa un servicio de despacho a domicilio.  
El objetivo es desarrollar una aplicación en **Java**, ejecutable por consola, que permita calcular automáticamente el costo de despacho según reglas de negocio establecidas, además de mostrar información relacionada con el vehículo de reparto.

## Requerimientos Funcionales
1. El sistema debe permitir ingresar el nombre del cliente.
2. El sistema debe validar que el correo ingresado sea una cuenta Gmail.
3. El sistema debe recibir como entrada el monto de la compra en pesos chilenos.
4. El sistema debe recibir como entrada la distancia en kilómetros para el despacho.
5. El sistema debe validar que la distancia de entrega sea menor o igual a 20 km.
6. El sistema debe mostrar al inicio un mensaje con las **reglas de negocio del despacho**:
   - Compras ≥ 50,000 CLP → despacho gratis.
   - Compras entre 25,000 y 49,999 CLP → $150 por kilómetro.
   - Compras menores a 25,000 CLP → $300 por kilómetro.
   - El servicio aplica solo dentro de un radio máximo de 20 km.
7. El sistema debe calcular el costo de despacho y mostrar la operación detallada, por ejemplo:  
10 km = 150 x 10 = $1500
8. El sistema debe mostrar el total a pagar (compra + despacho).
9. El sistema debe mostrar datos predeterminados del vehículo de reparto: marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros.

## Requerimientos No Funcionales
1. El programa debe ser ejecutable en consola (CMD) sin necesidad de un IDE.
2. El código debe estar escrito en Java estándar (JDK ≥ 8).
3. El sistema debe manejar entradas inválidas con mensajes de error claros.
4. El programa debe ser fácil de mantener y comprender, con comentarios explicativos.
5. El sistema debe cerrarse correctamente tras finalizar el cálculo.

## Desarrollo
El programa se desarrolla en Java utilizando la clase `Scanner` para capturar entradas de usuario por teclado.  
Se emplean estructuras condicionales `if-else` para validar datos y aplicar las reglas de negocio.  
La aplicación presenta un mensaje inicial con las condiciones del servicio, permitiendo al cliente conocer las tarifas antes de ingresar sus datos.  
La salida final incluye:  
- Resumen de la compra.  
- Distancia y cálculo detallado del despacho.  
- Total a pagar.  
- Datos del vehículo de reparto predeterminado (Toyota RAV4).  

## Conclusión
La implementación de este programa permitió reforzar conceptos básicos de programación en Java, tales como entrada de datos con `Scanner`, validaciones, estructuras condicionales, cálculos aritméticos y presentación de resultados en consola.  
Además, se comprendió la importancia de entregar al usuario información clara desde el inicio, mostrando las reglas del negocio y la forma en que se calculan los costos de despacho.  
Este ejercicio constituye una base sólida para futuros desarrollos de sistemas más complejos en el área de distribución y logística.

## Bibliografía
- Deitel, P., & Deitel, H. (2017). *Java: How to Program* (11th ed.). Pearson.  
- Oracle. (2025). *Java Documentation*. Recuperado de https://docs.oracle.com/javase/  
- Pressman, R. (2014). *Ingeniería de Software: Un enfoque práctico* (7a ed.). McGraw-Hill.  
