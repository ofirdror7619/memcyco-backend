package com.memcyco.backend.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    void shouldReturnHelloWorld() {
        assertThat(helloService.getHelloMessage()).isEqualTo("Hello World");
    }
}
