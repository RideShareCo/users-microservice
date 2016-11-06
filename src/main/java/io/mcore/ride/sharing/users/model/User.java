package io.mcore.ride.sharing.users.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    public String id;

    public String firstName;
    
    public String lastName;
    
    
}
