package Components;

import Employee.Empinfo;
import Empservices.Employeefluxservice;
import Repository.EmployeeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeeserviceImpl implements Employeefluxservice {

    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;

    @Override
    public Mono<Empinfo> createEmployee(Empinfo Empinfo) {
        return employeeCrudRepository.save(Empinfo);
    }

    @Override
    public Mono<Empinfo> updateEmployee(Empinfo Empinfo) {
        return employeeCrudRepository.save(Empinfo);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeCrudRepository.deleteAll();
    }

    @Override
    public Flux<Empinfo> findAllEmployees() {
        return employeeCrudRepository.findAll();
    }

    @Override
    public Mono<Empinfo> getBySalary(String salary) {
        return employeeCrudRepository.findFirstBySalary(salary);
    }
}
