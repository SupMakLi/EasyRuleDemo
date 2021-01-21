package com.easyrules.easyrulesdemo.rules;

import com.easyrules.easyrulesdemo.facts.BusinessTypeA;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule(name = "规则A", description = "打印A")
public class RuleA {
    @Condition
    public boolean when(Facts facts) {
        BusinessTypeA businessAfact = (BusinessTypeA)facts.get("businessAfact");
        return businessAfact.getDays() > 3;
    }

    @Action
    public void then(Facts facts) throws Exception {
        System.out.println("A");
    }
}
