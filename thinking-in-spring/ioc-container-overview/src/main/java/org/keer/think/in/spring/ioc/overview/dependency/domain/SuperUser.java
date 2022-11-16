package org.keer.think.in.spring.ioc.overview.dependency.domain;

import org.keer.think.in.spring.ioc.overview.annotation.Super;

/**
 * @author huangjunyi
 * @date 2022/11/16 18:28:19
 */
@Super
public class SuperUser extends User {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
