package kr.taeu.aop.exam;

import kr.taeu.aop.exam.annotation.Trace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final ExamRepository repository;

    @Trace
    public void request(String itemId) {
        repository.save(itemId);
    }
}
