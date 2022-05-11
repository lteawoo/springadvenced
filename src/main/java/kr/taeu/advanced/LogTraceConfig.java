package kr.taeu.advanced;

import kr.taeu.advanced.trace.logtrace.FieldLogTrace;
import kr.taeu.advanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
