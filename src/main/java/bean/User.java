package bean;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 使用Entity注解会自动从代码生成数据库表
 * Entity这个标记依赖于pom.xml中的spring-boot-starter-data-jpa
 */
//@Entity
public class User implements Serializable{
    private static final long serialVersionUID = -6749384460553909926L;
//    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int sex;
    private Date birthday;
    private String mobile;
    private String remark;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
