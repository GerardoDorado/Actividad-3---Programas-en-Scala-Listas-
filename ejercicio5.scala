
import scala.collection.mutable.ListBuffer

object ejercicio5 {
  def main(args: Array[String]): Unit = {
    var counter1=0
    var counter2=0
    
    println("ELIMINACION DE LAS PALABRAS: ")
    println("Ingresa el tamaño de las listas a crear: ")
    val x=readInt()
    
    var palabras1=new ListBuffer[String]()
    var palabras2=new ListBuffer[String]()
        
    while (counter1<x) {
      println("Ingresa la palabra "+(counter1+1)+" de la lista 1: ")
      palabras1+=readLine()
            
      counter1+=1
    }
    println("\nLista 1")
    palabras1.foreach(println)
    
    while (counter2<x) {
      println("Ingresa la palabra "+(counter2+1)+" de la lista 2: ")
      palabras2+=readLine()
            
      counter2+=1
    }
    
    println("\nLista 2")
    palabras2.foreach(println)
    
    val pal = palabras1
    
    for(i<-palabras1){
      for(a <- palabras1 if (i.equals(a) && (palabras1.indexOf(i)!=palabras1.indexOf(a)) )  ){
				palabras1.remove(palabras1.indexOf(i))
		  }
    }
    
    println("\nLista 1")
    palabras1.foreach(println)
  }
}