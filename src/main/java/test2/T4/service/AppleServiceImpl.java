package test2.T4.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test2.T4.dao.AppleDaoImpl;
import test2.T4.domain.Apple;

import java.util.List;

@Service
public class AppleServiceImpl {
    private final AppleDaoImpl appleDao;

    @Autowired
    public AppleServiceImpl(AppleDaoImpl appleDao) {
        this.appleDao = appleDao;
    }

    public String getApplesAsJson(int count) {
        List<Apple> apples = appleDao.getApples(count);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(apples);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}