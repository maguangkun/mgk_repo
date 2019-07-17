package day1;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class Configuration {
    private static final transient Logger log = LoggerFactory.getLogger(Configuration.class);
    public static void main(String[] args) {
    /*    Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro1.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
//        Subject subject = SecurityUtils.getSubject();
        Map<String, ?> beans = ((IniSecurityManagerFactory) factory).getBeans();
        Object o = beans.get("myRealm.username");
        System.out.println(o.toString());*/
    }
}
