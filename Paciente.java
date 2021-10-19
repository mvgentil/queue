
public class Paciente implements Entry<Integer,String>{

  private Integer key;
  private String value;

  public Paciente(Integer key, String value){
    this.key = key;
    this.value = value;
  }

  @Override
  public Integer getKey() {
    return key;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Paciente [key=" + key + ", value=" + value + "]";
  }

  
  
}
