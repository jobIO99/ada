/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersion;

/**
 *
 * @author AULAFISI
 */
public class Alumno {

 //ATRIBUTOS CODIGO, NOMBRE, PENSION
 private int codigoDelAlumno;
 private String nombreDelAlumno;
 private float pensionDelAlumno;

 //CONSTRUCTOR DE ALUMNO
 public Alumno(int codigo, String nombre, float pension) {
  codigoDelAlumno = codigo;
  nombreDelAlumno = nombre;
  pensionDelAlumno = pension;
 }
 
 //GETTERS Y SETTERS
 public void setCodigoDelAlumno(int codigo) {
  codigoDelAlumno = codigo;
 }
 public int getCodigoDelAlumno() {
  return codigoDelAlumno;
 }
 public void setNombreDelAlumno(String nombre) {
  nombreDelAlumno = nombre;
 }
 public String getNombreDelAlumno() {
  return nombreDelAlumno;
 }
 public void setPensionDelAlumno(float pension) {
  pensionDelAlumno = pension;
 }
 public float getPensionDelAlumno() {
  return pensionDelAlumno;
 }


}
