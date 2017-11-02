package com.example;

import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DockerClient dockerClient;

    @RequestMapping("/")
    public String index() throws DockerException, InterruptedException {
        return String.valueOf(dockerClient.info().containersRunning());
    }
}
