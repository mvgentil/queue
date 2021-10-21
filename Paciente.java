
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

  public void setKey(Integer key) {
    this.key = key;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Paciente [key=" + key + ", value=" + value + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((key == null) ? 0 : key.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Paciente other = (Paciente) obj;
    if (key == null) {
      if (other.key != null)
        return false;
    } else if (!key.equals(other.key))
      return false;
    if (value == null) {
      if (other.value != null)
        return false;
    } else if (!value.equals(other.value))
      return false;
    return true;
  }

  
  
}
