/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico18;

/**
 *
 * @author Pc
 */
public class empleados {
    int codigo_empleado;
    String nombre_empleado;
    double numero_horas_trabajadas_mes;
    double valor_hora_trabajada;
    int retencion_fuente;
    double porcentaje_retencion;
    double salario_bruto;
    double salario_neto;
    
  public double calcular_porcentaje_retencion(double retencion) {
    return retencion/100;
    }
  public double calcular_salario_bruto(double numero_horas_trabajadas_mes, double valor_hora_trabajada) {
      return numero_horas_trabajadas_mes * valor_hora_trabajada;
    }    
   public double calcular_salario_neto(double salario_bruto, double porcentaje_retencion) {
       return salario_bruto - (salario_bruto * porcentaje_retencion);
   }
}
