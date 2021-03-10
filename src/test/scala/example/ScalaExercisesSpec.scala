package example


import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.math.Pi

class ScalaExercisesSpec extends AnyFlatSpec with Matchers {

  //TEST EJERCICIO1


  "Área de un triángulo rectángulo con base 3 y altura 2" should "debe ser igual a 3" in {
    ScalaExercises.areaTrianguloRectangulo(3, 2) shouldEqual 3
  }

  "Área de un triángulo rectángulo con base 8 y altura 4" should "debe ser igual a 16" in {
    ScalaExercises.areaTrianguloRectangulo(8, 4) shouldEqual 16
  }

  "Área de un triángulo rectángulo con base 20 y altura 10" should "debe ser igual a 100" in {
    ScalaExercises.areaTrianguloRectangulo(20, 10) shouldEqual 100
  }

  //TEST EJERCICIO2


  "Área de un circulo con radio 1" should "Debe ser igual a pi" in {
    ScalaExercises.areaCirculo(1) shouldEqual Pi
  }

  "Área de un circulo con radio 10" should "Debe ser igual a 314.1592653589793" in {
    ScalaExercises.areaCirculo(10) shouldEqual 314.1592653589793
  }

  "Área de un circulo con radio 15 " should "Debe ser igual a 706.8583470577034" in {
    ScalaExercises.areaCirculo(15) shouldEqual 706.8583470577034
  }



  //TEST EJERCICIO3



  "El salario básico devengado de 200 menos deducciones de 20" should "Debe ser igual a 180" in {
    ScalaExercises.calSalario(200, 20) shouldEqual 180
  }


  "El salario básico devengado de 3000 menos deducciones de 1000 " should "Debe ser igual a 2000" in {
    ScalaExercises.calSalario(3000, 1000) shouldEqual 2000
  }


  "El salario básico devengado de 50000 menos deducciones de 10000" should "Debe ser igual a 40000" in {
    ScalaExercises.calSalario(50000, 10000) shouldEqual 40000
  }



  //TEST EJERCICIO4


  "El salario básico devengado de 200 con bono de 10%, menos deducciones de 20" should "Debe ser igual a 200" in {
    ScalaExercises.calSalarioBono(200, 20) shouldBe 200.0 +- 0.01
  }


  "El salario básico devengado de 6000 con bono de 10%, menos deducciones de 2000" should "Debe ser igual a 4600.0" in {
    ScalaExercises.calSalarioBono(6000, 2000) shouldBe 4600.0 +- 0.01
  }


  "El salario básico devengado de 34300 con bono de 10%, menos deducciones 7200 " should "Debe ser igual a 30530.0" in {
    ScalaExercises.calSalarioBono(34300, 7200) shouldBe 30530.0 +- 0.01
  }



  //TEST EJERCICIO5



  "El salario básico devengado de 200 menos deducciones de 10" should "Debe ser igual a 190" in {
    ScalaExercises.compSalario(ScalaExercises.calSalario, 200, 10) shouldEqual 190
  }

  "El salario básico devengado de 200 con bono de 10% menos deducciones de 30" should "Debe ser igual a 190" in {
    ScalaExercises.compSalario(ScalaExercises.calSalarioBono, 200, 30) shouldBe 190.0 +- 0.01}



  //TEST EJERCICIO6 con Aplicación en  EJERCICIO7


  "El salario básico devengado de 200 con bono de 5%, menos deducciones de 10 " should "Debe ser igual a 200" in {
    val genSalario5 = ScalaExercises.genCalSalarioBono(5)
    genSalario5(200, 10) shouldEqual 200
  }


  "El salario básico devengado de 8750 con bono de 5%, menos deducciones de 700 " should "Debe ser igual a 8487.5" in {
    val genSalario5 = ScalaExercises.genCalSalarioBono(5)
    genSalario5(8750, 700) shouldBe 8487.5 +- 0.01
  }


  "El salario básico devengado de 15000 con bono de 5%, menos deducciones de 2000 " should "Debe ser igual a 13750.0" in {
    val genSalario5 = ScalaExercises.genCalSalarioBono(5)
    genSalario5(15000, 2000) shouldBe 13750.0 +- 0.01
  }



  //TEST EJERCICIO6 con Aplicación en  EJERCICIO8



  "El salario básico devengado de 200 con bono de 20%, menos deduccione de 10 " should "Debe ser igual a 230" in {
    val genSalario20 = ScalaExercises.genCalSalarioBono(20)
    genSalario20(200, 10) shouldEqual 230
  }

  "El salario básico devengado de 300000 con bono de 20%, menos deduccione de 50000 " should "Debe ser igual a 310000.0" in {
    val genSalario20 = ScalaExercises.genCalSalarioBono(20)
    genSalario20(300000, 50000) shouldEqual 310000.0
  }


  "El salario básico devengado de 1300000 con bono de 20%, menos deduccione de 300000 " should "Debe ser igual a 300000" in {
    val genSalario20 = ScalaExercises.genCalSalarioBono(20)
    genSalario20(1300000, 300000) shouldEqual 1260000.0
  }



  //TEST EJERCICIO 9


  "El salario básico devengado de 200 con bono de 10%, menos deducciones de 5 " should "Debe ser igual a 215" in {
  ScalaExercises.calSalarioBonoClausura(200,5) shouldBe 215.0 +- 0.01}



  "El salario básico devengado de 3000 con bono de 10%, menos deducciones de 500 " should "Debe ser igual a 2800.0" in {
    ScalaExercises.calSalarioBonoClausura(3000,500) shouldBe 2800.0 +- 0.01}



  "El salario básico devengado de 5400000 con bono de 10%, menos deducciones de 400000 " should "Debe ser igual a 5540000.0" in {
    ScalaExercises.calSalarioBonoClausura(5400000,400000) shouldBe 5540000.0 +- 0.01}




  //TEST EJERCICIO 10

  "El salario básico devengado de 200 con bono de 10%, menos deducciones de 50" should "Debe ser igual a 170" in {
    ScalaExercises.compSalario(ScalaExercises.calSalarioBonoClausura,200,50) shouldBe 170.0 +- 0.01}


  "El salario básico devengado de 1000000 con bono de 10%, menos deducciones de 100000" should "Debe ser igual a 1000000.0" in {
    ScalaExercises.compSalario(ScalaExercises.calSalarioBonoClausura,1000000,100000) shouldBe 1000000.0  +- 0.01}

  "El salario básico devengado de 8000000 con bono de 10%, menos deducciones de 1000000" should "Debe ser igual a 7800000.0" in {
    ScalaExercises.compSalario(ScalaExercises.calSalarioBonoClausura,8000000,1000000) shouldBe 7800000.0 +- 0.01}


  //TEST EJERCICIO 11


  "El salario básico devengado de 200 con bono de 15%, menos deducciones de 50" should "Debe ser igual a 180" in {
    ScalaExercises.calSalario15(200,50) shouldBe 180.0 +- 0.01}


  "El salario básico devengado de 900000 con bono de 15%, menos deducciones de 80000" should "Debe ser igual a 954999.99" in {
    ScalaExercises.calSalario15(900000,80000) shouldBe 954999.99 +- 0.01}


  "El salario básico devengado de 2000000 con bono de 15%, menos deducciones de 100000" should "Debe ser igual a 180" in {
    ScalaExercises.calSalario15(2000000,100000) shouldBe 2200000.0 +- 0.01}



  //TEST EJERCICIO 12


  "El salario básico devengado de 200 con bono de 200%, menos deducciones de 50" should "Debe ser igual a 550" in {
    ScalaExercises.calSalario200(200,50) shouldBe 550.0 +- 0.01}


  "El salario básico devengado de 500000 con bono de 200%, menos deducciones de 200000" should "Debe ser igual a 1300000.0" in {
    ScalaExercises.calSalario200(500000,200000) shouldBe 1300000.0 +- 0.01}


  "El salario básico devengado de 100000 con bono de 200%, menos deducciones de 200000" should "Debe ser igual a 100000.0" in {
    ScalaExercises.calSalario200(100000,200000) shouldBe 100000.0 +- 0.01}



  //TEST EJERCICIO 15


  "El factorial de 4" should "debe ser igual a 24" in {
    ScalaExercises.factorial(4) shouldEqual 24
  }

  "El factorial de 6" should "debe ser igual a 720" in {
    ScalaExercises.factorial(6) shouldEqual 720
  }

  "El factorial de 5" should "debe ser igual a 120" in {
    ScalaExercises.factorial(5) shouldEqual 120
  }


  //TEST EJERCICIO 16


  "Fibonacci de 9 " should "debe ser igual a 34" in {
    ScalaExercises.fibonacci(9) shouldEqual 34
  }


  "Fibonacci de 5 " should "debe ser igual a 5" in {
    ScalaExercises.fibonacci(5) shouldEqual 5
  }

  "Fibonacci de 7 " should "debe ser igual a 13" in {
    ScalaExercises.fibonacci(7) shouldEqual 13
  }



  //TEST EJERCICIO 17


  "El factorial (con recursividad de cola) de 4" should "debe ser igual a 24" in {
    ScalaExercises.factorialTailRec(4) shouldEqual 24
  }


  "El factorial (con recursividad de cola) de 6" should "debe ser igual a 720" in {
    ScalaExercises.factorialTailRec(6) shouldEqual 720
  }


  "El factorial (con recursividad de cola) de 5" should "debe ser igual a 120" in {
    ScalaExercises.factorialTailRec(5) shouldEqual 120
  }



}