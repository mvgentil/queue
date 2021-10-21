
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue<K,V>{
  
  LinkedList<Paciente> list = new LinkedList<>();

  //O(1)
  public int size(){
    return list.size();
  }

  //O(1)
  public boolean isEmpty(){
    return list.isEmpty();
  }

  //O(1)
  public Entry<Integer, String> min() throws NullPointerException{
    Entry<Integer, String> min = list.peek();
    if(min == null){
        throw new NullPointerException("Fila Vazia");
    } else {
        return min;
      }
  }

  //O(n)
  public Entry<Integer, String> insert(Integer key, String value){
    Paciente newPaciente = new Paciente(key, value);
    if(list.isEmpty()) {
      list.addFirst(newPaciente);
      return newPaciente;
    } else {
      list.add(newPaciente);
        Collections.sort(list, new Comparator<Paciente>() {
          @Override
          public int compare(Paciente p1, Paciente p2) {
            if(p2.getKey() > p1.getKey()) return -1;
            if(p2.getKey() < p1.getKey()) return 1;
            return 0;
          }
        });
      return newPaciente;
    }
  }

  //O(1)
  public Paciente removeMin(){
    return list.poll();
  }

}
