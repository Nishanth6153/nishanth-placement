import java.util.PriorityQueue;
import java.util.Queue;


class Patient implements Comparable<Patient> {
    String name;
    int tokenNumber;

    public Patient(String name, int tokenNumber) {
        this.name = name;
        this.tokenNumber = tokenNumber;
    }
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.tokenNumber, other.tokenNumber);
    }
}

public class SimpleHospital {
    public static void main(String[] args) {
       
        Queue<Patient> patientQueue = new PriorityQueue<>();

        patientQueue.add(new Patient("Alice", 3)); 
        patientQueue.add(new Patient("Bob", 1)); 
        patientQueue.add(new Patient("Charlie", 2)); 

     
        Patient firstPatient = patientQueue.peek();

       
        if (firstPatient != null) {
            System.out.println("The patient treated first is: " + firstPatient.name + " (Token #" + firstPatient.tokenNumber + ")");
        }
    }
}