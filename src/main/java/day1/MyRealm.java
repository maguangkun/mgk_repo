package day1;

import org.apache.shiro.util.Nameable;

public class MyRealm implements Nameable {
    private  String connectionTimeout;
    private  String username;
    private  String password;
    public String getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(String connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String s) {

    }

    @Override
    public String toString() {
        return "MyRealm{" +
                "connectionTimeout='" + connectionTimeout + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
