
public class Main {
  
  public static void main(String[] args) {

    PriorityQueue<Integer, String> queue = new PriorityQueue<>();


    queue.insert(2, "Joao");
    queue.insert(1, "Jose");
    queue.insert(2, "Maria");
    queue.insert(3, "Pedro");
    queue.insert(1, "Joana");
    queue.insert(3, "Paulo");

    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 
    System.out.println(queue.min()); 
    System.out.println(queue.removeMin()); 
    System.out.println("Tamanho da fila: " + queue.size()); 

    
  }
}
