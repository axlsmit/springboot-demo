package pe.com.cema.springboot.demo.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.com.cema.springboot.demo.factory.OperationFactory;
import pe.com.cema.springboot.demo.model.bean.OperationBean;
import pe.com.cema.springboot.demo.service.OperationStrategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/operations/")
@AllArgsConstructor
@RestController
public class OperationRestController {
    private OperationFactory operationFactory;

    @PostMapping
    public BigDecimal makeOperation(@RequestBody OperationBean operationBean) {
        final OperationStrategy operationStrategy;
        BigDecimal result;
        operationStrategy = operationFactory.getStrategy(operationBean.getOperator());
        result = operationStrategy.makeOperation(operationBean.getNumbers());
        return result;
    }

    @GetMapping
    public List<String> listOperation() {
        return Arrays.asList("suma", "resta");
    }
}
