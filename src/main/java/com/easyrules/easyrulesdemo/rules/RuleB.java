package com.easyrules.easyrulesdemo.rules;

import com.easyrules.easyrulesdemo.facts.BusinessTypeA;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule(name = "规则B", description = "打印B")
public class RuleB {
    @Condition
    public boolean when(Facts facts) {
        BusinessTypeA businessAfact = (BusinessTypeA)facts.get("businessAfact");
        return businessAfact.getDays() <= 3;
    }

    @Action
    public void then(Facts facts) throws Exception {
        System.out.println("B");
    }
}
