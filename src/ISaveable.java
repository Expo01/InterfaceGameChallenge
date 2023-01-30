import java.util.List;

public interface ISaveable {
    List<String> write(); //defining as list for maximum flexibility so class can implement this as ArrayList, LinkedList. etc.
    void read(List<String> savedValues);
}
