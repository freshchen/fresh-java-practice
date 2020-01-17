package com.example.springbootjooq.demo;

import com.example.springbootjooq.generated.tables.pojos.User;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DSLContext create;

    com.example.springbootjooq.generated.tables.User USER = com.example.springbootjooq.generated.tables.User.USER;

    @Override
    public void delete(int id) {
        create.delete(USER).where(USER.ID.eq(id)).execute();
    }

    @Override
    public void insert(User user) {

        create.insertInto(USER)
                .columns(USER.NAME,USER.AGE)
                .values(user.getName(), user.getAge())
                .execute();
    }

    @Override
    public int update(User user) {
        create.update(USER).set((Record) user);
        return 0;
    }

    @Override
    public User selectById(int id) {
        return create.select(USER.NAME,USER.AGE).from(USER).where(USER.ID.eq(id)).fetchInto(User.class).get(0);
    }

    @Override
    public Iterator<User> selectAll(int pageNum, int pageSize) {
        return null;
    }
}
