package com.easyrules.easyrulesdemo.rules;

import com.easyrules.easyrulesdemo.facts.BusinessTypeB;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

import java.math.BigDecimal;

@Rule(name = "规则C", description = "打印C")
public class RuleC {
    @Condition
    public boolean when(Facts facts) {
        BusinessTypeB businessBfact = (BusinessTypeB)facts.get("businessBfact");
        return businessBfact.getMoney().compareTo(new BigDecimal(10000)) == 1 ;
    }

    @Action
    public void then(Facts facts) throws Exception {
        System.out.println("C");
    }
}
