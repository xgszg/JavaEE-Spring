package test2.T2.javaBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test2.T2.javaBean.Service.TestService;
import test2.T2.javaBean.controller.TestController;
import test2.T2.javaBean.dao.TestDao;

@Configuration
public class JavaConfig {
    @Bean
    public TestDao getTestDao() {
        return new TestDao();
    }
    @Bean
    public TestService getTestService() {
        TestService ts = new TestService();
        ts.setTestDao(getTestDao());
        return ts;
    }
    @Bean
    public TestController getTestController() {
        TestController tc = new TestController();
        tc.setTestService(getTestService());
        return tc;
    }

}
