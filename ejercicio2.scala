import scala.collection.mutable.ListBuffer

object ejercicio2 {
  def main(args: Array[String]): Unit = {
    var counter=0
    println("Ingresa el tamaño de la lista a crear: ")
    val x=readInt()
    
    var palabras=new ListBuffer[String]()
        
    while (counter<x) {
      println("Ingresa la palabra "+(counter+1)+": ")
      palabras+=readLine()
            
      counter+=1
    }
    
    println("Lista original: ")
    palabras.foreach(println)
    
    println("Ingresa las palabras a cambiar: ")
    println("Ingresa la primer palabra: ")
    var x1=readLine()
    
    println("Ingresa la segunda palabra: ")
    var x2=readLine()
    
    palabras.update(0, x1)
    palabras.update(1, x2)
    
    println("Lista modificada: ")
    palabras.foreach(println)
  }
}