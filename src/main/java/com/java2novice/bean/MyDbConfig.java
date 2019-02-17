package com.java2novice.bean;

import org.springframework.beans.factory.annotation.Value;

public class MyDbConfig {

    @Value("${db.host.url}")
    private String dbHost;
    private String dbPort;
    private String dbService;
    private String dbUrl;
    private String dbPassword;
    @Value("${k1}")
    private String k1;


    public String getDbHost() {
        return dbHost;
    }
    public void setDbHost(String dbHost) { this.dbHost = dbHost; }
    public String getDbPort() { return dbPort; }
    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }
    public String getDbService() {
        return dbService;
    }
    public void setDbService(String dbService) {
        this.dbService = dbService;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public String getDbPassword() {
        return dbPassword;
    }
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    public String getK1() {        return k1;    }
    public void setK1(String k1) {        this.k1 = k1;    }

    @Override
    public String toString(){
        return dbHost+"|"+dbPort+"|"+dbService+"|"+dbUrl+"|"+dbPassword+"|"+k1;
    }

}