package com.easyrules.easyrulesdemo.engine;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;

/**
 * 模仿DefaultRulesEngine 写自己的规则引擎
 */
public class MyRuleEngine implements RulesEngine {

    @Override
    public RulesEngineParameters getParameters() {
        return null;
    }

    @Override
    public void fire(Rules rules, Facts facts) {

    }
}
