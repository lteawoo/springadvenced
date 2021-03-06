package kr.taeu.advanced.trace.hellotrace;

import kr.taeu.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

public class HelloTraceV2Test {

    @Test
    void begin_end() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello");
        TraceStatus status3 = trace.beginSync(status2.getTraceId(), "hello");
        trace.end(status3);
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello");
        trace.exception(status2, new IllegalArgumentException());
        trace.exception(status1, new IllegalArgumentException());
    }
}