package com.tencent.supersonic.headless.server.pojo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class HiveParametersBuilder implements DbParametersBuilder {
    @Override
    public List<DatabaseParameter> build() {
        List<DatabaseParameter> databaseParameters = new ArrayList<>();
        DatabaseParameter host = new DatabaseParameter();
        host.setComment("Hive JDBC连接");
        host.setName("url");
        host.setPlaceholder("jdbc:hive2://<host ip>:10000/<database name>");
        databaseParameters.add(host);

        DatabaseParameter version = new DatabaseParameter();
        version.setComment("Hive版本");
        version.setName("version");
        version.setPlaceholder("请输入Hive版本");
        version.setDataType("list");
        version.setValue("4.0");
        version.setCandidateValues(Lists.newArrayList("4.0"));
        databaseParameters.add(version);

        DatabaseParameter userName = new DatabaseParameter();
        userName.setComment("用户名");
        userName.setName("username");
        userName.setPlaceholder("请输入用户名");
        databaseParameters.add(userName);

        DatabaseParameter password = new DatabaseParameter();
        password.setComment("密码");
        password.setName("password");
        password.setPlaceholder("请输入密码");
        databaseParameters.add(password);

        return databaseParameters;
    }
}
