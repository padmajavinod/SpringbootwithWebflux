package Employee;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
//FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class Empinfo {

    private String id;
    private String name;
    private long salary;


}
