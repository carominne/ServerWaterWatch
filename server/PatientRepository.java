package be.uliege.caroline.server;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;
import be.uliege.caroline.server.Patient;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository <T, ID extends Serializable>  extends CrudRepository<Patient, Integer> {


}