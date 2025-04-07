package com.sample.spring.boot.first_project.component;

import com.sample.spring.boot.first_project.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class MicroService {

    private final RestTemplate restTemplate;

    @Value("${microservice.hostName}")
    private String microServiceHostName;

    public MicroService(@Qualifier("microServiceBeanName") RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<Student> getStudentFromMicroService() {
        String url = microServiceHostName + "/api/student/getStudents";
        return restTemplate.exchange(
                url,
                org.springframework.http.HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>() {
                }
        ).getBody();
    }

}
