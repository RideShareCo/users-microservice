package io.mcore.ride.sharing.users.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;

    public String firstName;
    
    public String lastName;
    
    
}
