package Empservices;

import Employee.Empinfo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Employeefluxserviceimpl {

    public Mono<Empinfo> createEmployee(Empinfo Empinfo);
    public Mono<Empinfo> updateEmployee(Empinfo Empinfo);
    public void deleteEmployee(String id);
    public Flux<Empinfo> findAllEmployees();
    public Mono<Empinfo> getBySalary(String salary);
}
