package jetBrainsTasks;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Mark");
        Employee emp2 = new Employee(2, "Anna");
        Employee emp3 = new Employee(3, "Tom");
        Map<String, Employee> employees = new HashMap<>();
        employees.put(emp1.getName(), emp1);
        employees.put(emp2.getName(), emp2);
        employees.put(emp3.getName(), emp3);

//        System.out.println(employees);
//        TreeMap<String, Employee> sorted = new TreeMap<>(employees);
//        System.out.println(sorted);
//        List<Employee> sortedByValues= new ArrayList<>(employees.values());
//        Collections.sort(sortedByValues);
//        System.out.println(sortedByValues);

//        employees.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(System.out::println);
//
//        employees.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(System.out::println);

//        List<String> names = new ArrayList<>(employees.keySet());
//        names.stream().sorted().forEach(System.out::println);
//        List<Employee> employees1 = new ArrayList<>(employees.values());
//        employees1.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);


    }

}
