package test2.T1.annotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component()
public class AnnotationUser {
    @Value("chenheng")
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
