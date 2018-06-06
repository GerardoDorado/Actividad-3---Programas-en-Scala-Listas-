import scala.collection.mutable.ListBuffer

object PalabraRepetidad {
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
    
    println("Ingresa la palabra a buscar: ")
    var buscarPalabra=readLine()
    
    var contador=0
    for(e <- palabras if e.equals(buscarPalabra)){
			 contador+=1
		}
    
    println("La palabra "+buscarPalabra+" aparece: "+contador+" veces.")
  }
}