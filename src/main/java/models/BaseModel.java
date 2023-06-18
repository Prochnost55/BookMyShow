package models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// @MappedSuperClass annotations is used to tell that this BaseModel class attributes should be present in all the Entities

@MappedSuperclass
@Getter
@Setter

// @Entity is not required as we don't want to create a table for BaseModal
public abstract class BaseModel {
    @Id // this is used to tell that id is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}