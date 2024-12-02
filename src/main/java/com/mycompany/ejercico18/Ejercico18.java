/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercico18;
import java.util.Scanner;
public class Ejercico18 {
    public static void main(String[] args) {
        double numero_horas_trabajadas_mes;
        double valor_hora_trabajada;
        double salario_bruto;
        double salario_neto;
        double porcentaje_retencion;
        String nombre, apellido, nombre_empleado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese codigo de empleado: ");
        int codigo_empleado = entrada.nextInt();
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.next();
        
        System.out.println("Ingreses apellido del empleado: ");
        apellido = entrada.next();
        nombre_empleado = nombre +" "+ apellido;
        
        System.out.println("Ingrese el numero de las horas trabajadas al mes: ");
        numero_horas_trabajadas_mes = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de la hora trabajada: ");
        valor_hora_trabajada = entrada.nextDouble();
        
        
        System.out.println("Ingrese el valor de la retencion: ");
        
        double retencion = entrada.nextDouble();
       
        empleados empleado1 = new empleados();
        
        
        porcentaje_retencion = empleado1.calcular_porcentaje_retencion(retencion);
        salario_bruto = empleado1.calcular_salario_bruto(numero_horas_trabajadas_mes, valor_hora_trabajada);
        salario_neto = empleado1.calcular_salario_neto(salario_bruto,porcentaje_retencion);
       
        
        System.out.println("Codigo:" + codigo_empleado);
        System.out.println("Nombre : " + nombre_empleado);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}