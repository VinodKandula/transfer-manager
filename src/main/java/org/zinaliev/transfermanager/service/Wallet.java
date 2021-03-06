package org.zinaliev.transfermanager.service;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.joda.money.Money;

@ToString
@EqualsAndHashCode
public class Wallet {

    @Getter
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Object lock = new Object();

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Money money;

}
