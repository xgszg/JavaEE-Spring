package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.AppleDaoImpl;
import domain.Apple;

import java.util.List;

@Service
public class AppleServiceImpl {

    @Autowired
    private AppleDaoImpl appleDao;

    public List<Apple> getApples(int count) {
        List<Apple> apples = appleDao.getApples(count);
        return apples;
    }
}