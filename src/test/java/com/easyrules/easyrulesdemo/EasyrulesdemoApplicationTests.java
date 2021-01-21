package com.easyrules.easyrulesdemo;

import com.easyrules.easyrulesdemo.facts.BusinessTypeA;
import com.easyrules.easyrulesdemo.facts.BusinessTypeB;
import com.easyrules.easyrulesdemo.facts.BusinessTypeC;
import com.easyrules.easyrulesdemo.listeners.MyRuleListener;
import com.easyrules.easyrulesdemo.rules.*;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class EasyrulesdemoApplicationTests {

    @Test
    void testRule() {
        //初始化规则
        RuleA ruleA = new RuleA();
        RuleB ruleB = new RuleB();
        RuleC ruleC = new RuleC();
        RuleD ruleD = new RuleD();
        //将规则注册到规则库中
        Rules rules = new Rules();
        rules.register(ruleA);
        rules.register(ruleB);
        rules.register(ruleC);
        rules.register(ruleD);

        //初始化规则引擎
        DefaultRulesEngine defaultRulesEngine = new DefaultRulesEngine();
        //注册监听
        defaultRulesEngine.registerRuleListener(new MyRuleListener());
        //获取事实数据
        //假设业务场景A是请假天数判断
        BusinessTypeA factA = new BusinessTypeA();
        factA.setDays(10);
        //假设业务场景是金额判断
        BusinessTypeB factB = new BusinessTypeB();
        factB.setMoney(new BigDecimal(100000));
        //假设业务场景是用户id判断
        BusinessTypeC factC = new BusinessTypeC();
        factC.setUserId("1");

        Facts facts = new Facts();
        facts.put("businessAfact",factA);
        facts.put("businessBfact",factB);
        facts.put("businessCfact",factC);

        //执行规则
        defaultRulesEngine.fire(rules,facts);
    }

}
