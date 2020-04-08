package guru.springframework.spring5webapp.model;

import org.springframework.beans.factory.annotation.Value;

public class DummyDataSource {

    @Value("${ray.datasource.username}")
    private String username;

    @Value("${ray.datasource.password}")
    private String password;

    @Value("${ray.datasource.dbUrl}")
    private String dbUrl;

    @Override
    public String toString() {
        return "DummyDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
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

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
