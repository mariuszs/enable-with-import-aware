package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Foo {

    private static final Logger log = LoggerFactory.getLogger(Foo.class);
    private final String message;

    public Foo(String message) {
        this.message = message;
    }

    @PostConstruct
    public void say(){
        log.warn(message);
    }
}
