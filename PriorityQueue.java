import java.util.ArrayList;

public class PriorityQueue<K, V> implements Comparable<Entry<K,V>>{
  
  ArrayList<Entry<K,V>> list = new ArrayList<>();
  int size = 0;

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public Entry<K,V> min(){
    return null;
  }

  public Entry<K,V> insert(Entry<K,V> element){
    list.add(element);
    size += 1;
    return element;
  }

  public Entry<K,V> removeMin(){
    Entry<K,V> min = min();
    list.remove(min());
    return min;
  }

  @Override
  public int compareTo(Entry<K, V> o) {
    
    return 0;
  }



}
