package test2.T2.annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("test2.T2.annotation") // 修正包路径
public class ConfigAnnotation {
}
