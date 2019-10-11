/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersion;

import java.util.Scanner;

/**
 *
 * @author AULAFISI
 */
public class PruebaAplicacion {

 public static void main(String[] args) {

  Instituto miInstituto = new Instituto();
  int codigo[] = {
   100820,
   100120,
   200110,
   204530,
   100150,
   100012,
   100213,
   100250,
   100540,
   100420
  };
  String nombre[] = {
   "Juan Rosales",
   "Ana Ramirez",
   "Rosa Huapaya",
   "Carlos Arana",
   "Raul Gonzales",
   "Pedro Mamani",
   "Rosario Paredes",
   "Martha Huaman",
   "Saul Espino",
   "Karen Mendiola"
  };
  float pension[] = {
   320,
   400,
   300,
   400,
   350,
   320,
   450,
   320,
   450,
   300
  };
  Scanner entrada = new Scanner(System.in);
  int pos;
  int cod;
  boolean flag;

  for (int i = 0; i < codigo.length; i++) {
   flag = miInstituto.Insertar(codigo[i], nombre[i], pension[i]);
   if (flag == false) System.out.println("Tabla llena");
  }

  for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++) {
   System.out.printf("%d\t%20s%10.2f\n",
    miInstituto.getCodigoDelAlumno(i),
    miInstituto.getNombreDelAlumno(i),
    miInstituto.getPensionDelAlumno(i));
  }

  System.out.print("\n\nCodigo del alumno: ");
  cod = entrada.nextInt();

  pos = miInstituto.Buscar(cod);
  if (pos != -1) {
   System.out.printf("\n\n%d\t%20s%10.2f\n",
    miInstituto.getCodigoDelAlumno(pos),
    miInstituto.getNombreDelAlumno(pos),
    miInstituto.getPensionDelAlumno(pos));
  } else
   System.out.println("\n\nCodigo de alumno no existe");
 }
}