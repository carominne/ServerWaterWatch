package be.uliege.caroline.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInterface {
    private static final Logger log = LoggerFactory.getLogger(RestInterface.class);

    @GetMapping("/patient")
    public PatientAdri getPatient() {
        log.info("Get patient request");
        return new PatientAdri("Claude", 32);
    }

    @PostMapping("/patient")
    public void postPatient(@RequestBody PatientAdri patient) {
        log.info("post patient request " + patient.toString());
        return;
    }

}