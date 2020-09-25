package SpringPercipio.profile;

import lombok.Data;

@Data
public class Profile {

    private String name;
    private String role;

    public Profile(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Profile(){

    }
}
