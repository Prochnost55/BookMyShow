package models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

// These keywords are called annotations

// Entity annotation is part of JPA. Entity defines that this class will be a table in the database
// if connection is formed correctly then a table with name actor will be created.
// A table needs an id (primary key). We are using BaseModal to declare the ids for all the  types of entities.
@Entity

// Getter and Setter are part for lombok library.
// If we declare getter and setter at the top then we don't need to define getter and setter methods in the class. It gets handled by lombok.
@Getter
@Setter

public class Actor extends BaseModel{
    private String name;
    private int age;
}
