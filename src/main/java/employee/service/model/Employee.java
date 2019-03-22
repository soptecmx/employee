package employee.service.model;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private Long organizationId;
    private Long departmentId;
    private int age;
    private String position;

}
