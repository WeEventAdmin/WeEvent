package com.webank.weevent.processor.service;

import java.util.List;

import com.webank.weevent.processor.model.CEPRule;
import com.webank.weevent.processor.model.CEPRuleExample;
import com.webank.weevent.processor.utils.RetCode;

public interface CEPRuleService {
    CEPRule selectByPrimaryKey(String id);

    List<CEPRule> selectByRuleName(String ruleName);

    RetCode insert(CEPRule record);

    List<CEPRule> getCEPRuleList(String ruleName);

    RetCode updateByPrimaryKey(CEPRule record);

    RetCode setCEPRule(String id, int type);

    RetCode updateByPrimaryKeySelective(CEPRule record);

    int getCountByCondition(CEPRuleExample cEPRuleExample);
}