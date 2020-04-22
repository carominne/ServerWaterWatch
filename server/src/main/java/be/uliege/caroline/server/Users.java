package be.uliege.caroline.server;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity // This tells Hibernate to make a table out of this class
public class Users {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String identifier;
  
  private String password;
  
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
  
  
  public String getPassword() {
	    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
}