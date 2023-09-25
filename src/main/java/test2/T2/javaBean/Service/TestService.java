package test2.T2.javaBean.Service;
import test2.T2.javaBean.dao.TestDao;

public class TestService{
    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
