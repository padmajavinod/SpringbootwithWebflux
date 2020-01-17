package Controller;

import Employee.Empinfo;
import Empservices.Employeefluxservice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class Employeecontroller {

    @Autowired
    private Employeefluxservice Employeefluxserviceimpl;



    @GetMapping(value = "/getEmployees", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Empinfo> getEmployees() {
        return Employeefluxserviceimpl.findAllEmployees();

    }

    @GetMapping("/getEmployees/v1/{salary}")
    public Mono<Empinfo> getBySalary(@PathVariable("salary") String salary) {
        return Employeefluxserviceimpl.getBySalary(salary);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/createEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createEmployee(@RequestBody Empinfo Empinfo) {
        Employeefluxserviceimpl.createEmployee(Empinfo);
    }


    @PutMapping(value = "/updateEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Empinfo> updateEmployee(@RequestBody Empinfo Empinfo) {
        return Employeefluxserviceimpl.updateEmployee(Empinfo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value = "/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable("id") String id) {

        Employeefluxserviceimpl.deleteEmployee(id);
    }


//    public void getbyid()
//    {
//
//    }
}
