package be.uliege.caroline.server;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity // This tells Hibernate to make a table out of this class
public class Patient {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private Integer room;

  private String name;
  
  private String forename;
  
  private Integer dehydrationState;
  
  private Integer heartbeat;
  
  private Integer spo2; 
  
  private String gender;
  
  private Integer age;
  
  private String birthday;
  
  private Integer weight;
  
  private Integer height; 
  
  private Integer medication1;
  
  private Integer medication2;
  
  private Integer medication3;
  
  private Integer disease1;
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public Integer getRoom() {
	    return room;
  }

  public void setRoom(Integer room) {
    this.room = room;
  }
  
  public String getForename() {
	    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }
  
  public String getGender() {
	    return gender;
  }

  public void setGender(String gender) {
	    this.gender = gender;
	}
  
  
  public Integer getDehydrationState() {
	    return dehydrationState;
  }
	
  
  public void setDehydrationState(Integer dehydrationState) {
	  this.dehydrationState = dehydrationState;
  }
  
  public Integer getHeartbeat() {
      return heartbeat;
  }

  public void setHeartbeat(Integer heartbeat) {
      this.heartbeat= heartbeat;
  }

  public Integer getSpo2() {
      return spo2;
  }

  public void setSpo2(Integer spo2) {
      this.spo2 = spo2;
  }
  
  public Integer getAge() {
	    return age;
}

public void setAge(Integer age) {
  this.age = age;
}

public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
  
  public Integer getWeight() {
	    return weight;
}

public void setWeight(Integer weight) {
this.weight = weight;
}

public Integer getHeight() {
    return height;
}

public void setHeight(Integer height) {
this.height = height;
}

public Integer getMedication1() {
    return medication1;
}

public void setMedication1(Integer medication1) {
this.medication1 = medication1;
}
  
public Integer getMedication2() {
    return medication2;
}

public void setMedication2(Integer medication2) {
this.medication2 = medication2;
}

public Integer getMedication3() {
    return medication3;
}

public void setMedication3(Integer medication3) {
this.medication3 = medication3;
}

public Integer getDisease1() {
    return disease1;
}

public void setDesease1(Integer desease1) {
this.disease1 = desease1;
}

}