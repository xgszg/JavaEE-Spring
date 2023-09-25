package test2.T2.annotation.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import test2.T2.annotation.dao.TestDao;
@Service("testService")
public class TestServiceImpl implements TestService{
    @Resource(name = "testDao")
    private TestDao testDao;
    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
