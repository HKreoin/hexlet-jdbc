package hexlet.jdbc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private String username;
    private String phone;
    private Long id;

    User(String username, String phone) {
        this.username = username;
        this.phone = phone;
        this.id = null;
    }
}
