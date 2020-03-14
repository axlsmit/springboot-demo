package pe.com.cema.springboot.demo.model.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperationBean {

    private String operator;
    private BigDecimal[] numbers;
}
