package guru.springframework.spring5webapp.model;

import org.springframework.beans.factory.annotation.Value;

public class DummyJmsBroker {

    @Value("${ray.jms.username}")
    private String username;

    @Value("${ray.jms.password}")
    private String password;

    @Value("${ray.jms.jmsUrl}")
    private String jmsUrl;

    @Override
    public String toString() {
        return "DummyJmsBroker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jmsUrl='" + jmsUrl + '\'' +
                '}';
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

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
