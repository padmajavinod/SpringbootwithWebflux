package Repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import Employee.Empinfo;

@Repository
public interface EmployeeCrudRepository extends ReactiveCrudRepository<Empinfo, String> {

    Flux<Empinfo> findAllByName(String name);

    Mono<Empinfo> findFirstBySalary(Mono<String> salary);

}
