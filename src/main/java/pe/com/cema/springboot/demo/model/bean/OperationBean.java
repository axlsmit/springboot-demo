package pe.com.cema.springboot.demo.model.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@Builder
public class OperationBean {

    private String operator;
    private BigDecimal[] numbers;

}
