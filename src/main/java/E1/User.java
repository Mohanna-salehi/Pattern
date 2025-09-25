package E1;

import lombok.*;
import lombok.Builder;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int age;
    private String birthday;
    private String job;
    private boolean isMarried;
    private String address;
    private String username;
    private String password;
}
