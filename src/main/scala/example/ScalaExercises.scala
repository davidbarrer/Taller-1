package example

import scala.annotation.tailrec
import scala.math.Pi

object ScalaExercises {

  //FUNCIONES ANONIMAS-------------------------------------------------------------------------------------------

  /*EJERCICIO1:
        Una función literal llamada areaTrianguloRectangulo
        que se encargue de calcular el área de un triángulo rectángulo. Recibe los dos
        lados rectos.

 */

  val areaTrianguloRectangulo = (base: Int, altura: Int) => {
    (base * altura) / 2
  }


  /*EJERCICIO2
           Una función literal con un tipo basado en funciones valoresa
          llamada areaDeUnCirculo.
 */

  val areaCirculo = new Function1[Double, Double] {
    def apply(radio: Double): Double = Pi * radio * radio
  }



  //FUNCIONES DE PRIMERA CLASE Y FUNCIONES DE ALTO ORDEN------------------------------------------------------------

  /*EJERCICIO3
      una función literal llamada calSalario que reciba dos
      parámetros de tipo Double (devengado y deducciones) y que retorna el valor
      clásico del salario de una persona:
      devengado − deducciones

   */

  val calSalario = (devengado: Double, deducciones: Double) => {
    devengado - deducciones
  }



  /*EJERCICIO4
      Una función literal llamada calSalarioBono que reciba
      dos parámetros de tipo Double (devengado y deducciones) y calcule el salario
      con el siguiente valor.
                          devengado ∗ 1,10 − deducciones
   */


  val calSalarioBono = (devengado: Double, deducciones: Double) => {
    (devengado * 1.10) - deducciones
  }



  /*EJERCICIO5
        Una función llamada compSalario que recibe tres parámet-
        ros: el primero una función de tipo (Double,Double)=>Double y las otras dos
        son: devengado y deducciones. Prueba esta función pasado las dos funciones
        anteriores calSalario y calSalarioBono.
 */

  def compSalario(f: (Double, Double) => Double, devengado: Double, deducciones: Double) = f(devengado, deducciones)





  //EJERCICIO6
    /*una función llamada genCalSalarioBono esta función se
  encarga de generar funciones que computan diferente bonos. La función
    */

  def genCalSalarioBono(bono: Double): (Double, Double) => Double =
    (devengado: Double, deducciones: Double) => {
      (devengado * (1 + (bono / 100))) - deducciones
    }

  /*EJERCICIO7 Implementnación EJERCICIO6
        la función generadora de funciones genCalSalarioBono
        cree la función literal calSalario5 que da un bono del 5 %.
   */

  val genSalario5 = genCalSalarioBono(5)


  /*EJERCICIO8 Implementación EJERCICIO6
      A partir de la función generadora de funciones genCalSalarioBono
       crea la función literal calCalario20 que da un bono del 20 %.
   */

  val genSalario20 = genCalSalarioBono(20)


  //CLAUSURAS ---------------------------------------------------------------------------------------------------

  /*EJERCICIO9
            Una función calSalarioBonoClausura que reciba dos
          parámetros (devengados y deducciones) y que aplique la siguiente fórmula:
                        devengado × bono − deducciones
          Donde bono es una valor declarado externamente (Una clausura).
   */

  val bono = 1.10

  def calSalarioBonoClausura(devengado: Double, deducciones: Double) = {
    (devengado * bono) - deducciones
  }


  //EJERCICIO 10 PRUEBA DIRECTA EN test/scala/example/ScalaExercisesSpec

  //FUNCIONES APLICADAS PARCIALMENTE------------------------------------------------------------------------------


  /*EJERCICIO11
        La función genCalSalarioBono en una función lit-
      eral calCalario15 que se obtiene a través de la aplicación parcial de genCalSalarioBono
      con un valor 0,15 (15)

   */

  val tmp = genCalSalarioBono(_) //Aplicación parcial de GenSalarioBono

  val calSalario15 = tmp(15)


  /*EJERCICIO12
    La función genCalSalarioBono en una función lit-
      eral calCalario200 que se obtiene a través de la aplicación parcial de genCalSalarioBono
      con un valor 2.00 (200)
   */

  val tmp2 = genCalSalarioBono(_) //Aplicación parcial de GenSalarioBono

  val calSalario200= tmp(200)


  //EJERCICIO13 NO SE HACE
  //EJERCICIO14 NO SE HACE


  //RECURSIVIDAD Y RECURSIVIDAD DEL COLA-------------------------------------------------------------------------

  /*EJERCICIO15
   Funcion de factorial de forma recursiva
   */

  def factorial(n:Int):Int =
    if (n <= 1) 1
    else n * factorial(n-1)

  //EJERCICIO 16 Funcion fibonacci de forma recursiva
  def fibonacci(n:Int):Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }


  /*EJERCICIO17
   Funcion de factorial de forma Tail rec
   */
  def factorialTailRec(n:Int):Int = {
    @tailrec
    def aux(n:Int,counter:Int):Int = n match {
      case 0 => counter
      case _ => aux(n-1,n*counter)
    }
    aux(n,1)
  }


  /*
    factorialTailRec(4)
    aux(4,1)

    n match ------   case _ => aux(4-1, 4*1)
    n match ------   case _ => aux(3-1, 3*4*1)
    n match ------   case _ => aux(2-1, 2*3*4*1)
    n match ------   case _ => aux(1-1, 1*2*3*4*1)
    n match ------   case 0 => (1*2*3*4*1) = 24


   */

















}
