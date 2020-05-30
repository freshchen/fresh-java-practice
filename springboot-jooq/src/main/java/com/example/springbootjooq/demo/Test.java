package com.example.springbootjooq.demo;

import com.example.springbootjooq.generated.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep2;
import org.jooq.impl.DSL;

/**
 * @author darcy
 * @since 2020/05/06
 **/
public class Test {


    public static void main(String[] args) {
        com.example.springbootjooq.generated.tables.User USER = com.example.springbootjooq.generated.tables.User.USER;
        DSLContext using = DSL.using("jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "z123456");
        InsertValuesStep2<UserRecord, String, String> values = using.insertInto(USER)
                .columns(USER.NAME, USER.AGE)
                .values("1", "1");
        System.out.println(values);
    }
}
