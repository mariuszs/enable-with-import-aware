package demo.config;

import demo.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

@Configuration
public class FooConfig implements ImportAware {

    private Map<String, Object> annotationAttributes;

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        annotationAttributes = importMetadata.getAnnotationAttributes(EnableHelloWorld.class.getName());
    }

    @Bean
    public Foo foo() {
        assert annotationAttributes != null;
        return new Foo((String) annotationAttributes.get("message"));
    }
}
