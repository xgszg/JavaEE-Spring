package test2.T3.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import test2.T3.dao.AppleDaoImpl;
import test2.T3.domain.Apple;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl {
    private AppleDaoImpl appleDao;

    @Autowired
    public AppleServiceImpl(AppleDaoImpl appleDao) {
        this.appleDao = appleDao;
    }
    // 获取苹果列表并转换为JSON串
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