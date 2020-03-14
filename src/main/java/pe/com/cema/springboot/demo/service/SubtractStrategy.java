package pe.com.cema.springboot.demo.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class SubtractStrategy implements OperationStrategy {
    @Override
    public BigDecimal makeOperation(BigDecimal[] numbers) {
        AtomicReference<BigDecimal> result = new AtomicReference<>(numbers[0]);
        Stream.of(Arrays.copyOfRange(numbers, 1, numbers.length))
                .forEach(i -> result.set(result.get().subtract(i)));
        return result.get();
    }
}
