package day1;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial {
    private static final transient Logger log = LoggerFactory.getLogger(Tutorial.class);
    public static void main(String[] args) {
        log.info("My First Apache Shiro Application");

        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject currentUser = SecurityUtils.getSubject();
//        Session session = currentUser.getSession(); session.setAttribute("someKey", "aValue");
//        String value = (String) session.getAttribute("someKey");
//        if (value.equals("aValue")) {
//            System.out.print("Retrieved the correct vlaue! [" + value + "]");
//        }
        if (!currentUser.isAuthenticated()) {
        UsernamePasswordToken token = new UsernamePasswordToken("mgk", "123456");
        token.setRememberMe(true);
        try {
            currentUser.login(token);
        } catch (UnknownAccountException uae) {
            System.out.println("There is no user with username of " + token.getPrincipal());
        } catch (IncorrectCredentialsException ice) {
            System.out.println("Password for account " + token.getPrincipal() + " was incorrect!");
        } catch (LockedAccountException lae) {
            System.out.println("The account for username " + token.getPrincipal() + " is locked. " + "Please contact your administrator to unlock it.");
        }
    }
    String qx  = "yuangong";
    if(currentUser.hasRole(qx)){
        System.out.println("恭喜您"+qx+"有该权限");
    }else {
        System.out.println("抱歉您没有该权限"+ qx);
    }
    String cz = "query";
    if(currentUser.isPermitted(cz)){
        System.out.println("此用户有该权限"+cz);
    }else{
        System.out.println("此用户有无权限"+cz);
    }
        currentUser.logout();
        System.exit(0);
    }
}
