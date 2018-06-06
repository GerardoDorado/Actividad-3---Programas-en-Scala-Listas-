import scala.collection.mutable.ListBuffer

object ejercicio3 {
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
    
    println("Ingresa la palabra a elminar: ")
    var palabraEliminar=readLine()
    
    
    for(e <- palabras if e.equals(palabraEliminar)){
				palabras.remove(palabras.indexOf(e))
		}
    
    println("Lista modificada: ")
    palabras.foreach(println)
    
  }
}