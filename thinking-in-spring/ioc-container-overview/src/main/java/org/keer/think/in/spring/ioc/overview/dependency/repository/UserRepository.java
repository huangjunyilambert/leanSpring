package org.keer.think.in.spring.ioc.overview.dependency.repository;

import org.keer.think.in.spring.ioc.overview.dependency.domain.User;

import java.util.Collection;

/**
 * @author huangjunyi
 * @date 2022/11/16 21:17:32
 */
public class UserRepository {
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
