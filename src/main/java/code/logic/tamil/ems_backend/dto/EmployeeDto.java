package code.logic.tamil.ems_backend.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
