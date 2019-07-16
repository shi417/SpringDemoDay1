package autowiredByComponent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"autowiredByComponent","dIandAOP"})
public class PeopleConfig {

}
