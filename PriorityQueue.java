import java.util.ArrayList;

public class PriorityQueue<K, V> {
  
  ArrayList<Entry<K,V>> list = new ArrayList<>();

  //O(1)
  public int size(){
    return list.size();
  }

  //O(1)
  public boolean isEmpty(){
    return list.isEmpty();
  }


  //O(1)
  public Entry<K,V> min(){
    return list.get(0);
  }

  //O(1)
  public Entry<K,V> insert(Entry<K,V> element){
    list.add(element);
    return element;
  }

  //O(1)
  public Entry<K,V> removeMin(){
    Entry<K,V> min = min();
    list.remove(min);
    return min;
  }



}
