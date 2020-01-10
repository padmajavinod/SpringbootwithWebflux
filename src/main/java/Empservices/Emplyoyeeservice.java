package Empservices;

        import Employee.Empinfo;
        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.function.Predicate;
        import java.util.stream.Stream;

@Service
public class Emplyoyeeservice {

   // Hard coded practice with java 8 stream and lamdas
//    private List<Empinfo> emp = new ArrayList<>(Arrays.asList(
//            new Empinfo(1, "padmaja", 1000),
//            new Empinfo(2, "venkatesh", 2000),
//            new Empinfo(3, "shiva", 3000)));
//
//    public List<Empinfo> getEmpdetails() {
//
//        return emp;
//
//    }
//
//    public Empinfo getempid(int id) {
//
//        return emp.stream()
//                .filter(empinfo -> empinfo.getId() == id)
//                .findFirst().get();
//    }
//
//    public void addemployee(Empinfo empinfo) {
//        emp.add(empinfo);
//    }
//
//    public void updateemployee(int id,Empinfo empinfo) {
//
//        for (int i=0;i<=emp.size();i++) {
//            Empinfo e=emp.get(id);
//            if(empinfo.getId()== id) {
//                emp.set(id, empinfo);
//            }
//        }
//    }
//
//    public void deleteemployee(int id) {
//        emp.removeIf(empinfo -> empinfo.getId() == id);
//    }



}
