import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
   int id;
   String name;
   double salary;
   public Employee(int id, String name, double salary) {
      super();
      this.id = id;
      this.name = name;
      this.salary = salary;
   }
}
public class Lambda {
   public static void main(String[] args) {
      List<Employee> list = new ArrayList<Employee>();

      // Adding employees
      list.add(new Employee(115, "Thev", 32000.00));
      list.add(new Employee(125, "Ramanujam", 40000.00));
      list.add(new Employee(135, "Nirmal", 35000.00));
      list.add(new Employee(143, "Hari", 20000.00));
      list.add(new Employee(125, "Raga", 29000.00));
      list.add(new Employee(135, "Naveen", 25000.00));
      list.add(new Employee(143, "Sakthi", 36000.00));
      list.add(new Employee(125, "Balaji", 24000.00));
      list.add(new Employee(135, "Vishnu", 32000.00));
      System.out.println("Sorting the employee list based on the name");

      // implementing lambda expression
      Collections.sort(list, (p1, p2) -> {
         return p1.name.compareTo(p2.name); 
      }); 
      for(Employee e : list) {
         System.out.println(e.id + " " + e.name + " " + e.salary);
      }
   }
}
