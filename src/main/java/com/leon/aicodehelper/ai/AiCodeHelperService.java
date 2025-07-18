package com.leon.aicodehelper.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

import java.util.List;

//@AiService
public interface AiCodeHelperService {
    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);

    @SystemMessage(fromResource ="system-prompt.txt")
    Report chatForReport(String userMessage);
    // 学习报告
    record Report(String name, List<String> suggestionList){}
}
