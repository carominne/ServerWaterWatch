package be.uliege.caroline.server;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import be.uliege.caroline.server.Patient;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}