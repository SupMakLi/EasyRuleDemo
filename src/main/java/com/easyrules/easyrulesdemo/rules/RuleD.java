package com.easyrules.easyrulesdemo.rules;

import com.easyrules.easyrulesdemo.facts.BusinessTypeC;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule(name = "规则D", description = "打印D")
public class RuleD {
    @Condition
    public boolean when(Facts facts) {
        BusinessTypeC businessCfact = (BusinessTypeC)facts.get("businessCfact");
        return businessCfact.getUserId().equals("1");
    }

    @Action
    public void then(Facts facts) throws Exception {
        System.out.println("D");
    }
}
