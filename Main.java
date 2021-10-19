
public class Main {
  
  public static void main(String[] args) {

    PriorityQueue<Integer, String> pacientes = new PriorityQueue<>();

    Paciente paciente1 = new Paciente(2, "Joao");
    Paciente paciente2 = new Paciente(1, "Jose");
    Paciente paciente3 = new Paciente(2, "Maria");
    Paciente paciente4 = new Paciente(3, "Pedro");
    Paciente paciente5 = new Paciente(1, "Joana");
    Paciente paciente6 = new Paciente(3, "Paulo");

    pacientes.insert(paciente1);
    pacientes.insert(paciente2);
    pacientes.insert(paciente3);
    pacientes.insert(paciente4);
    pacientes.insert(paciente5);
    pacientes.insert(paciente6);

    System.out.println(pacientes.removeMin());
    
  }
}
