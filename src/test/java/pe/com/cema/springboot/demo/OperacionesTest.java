package pe.com.cema.springboot.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.com.cema.springboot.demo.model.bean.OperationBean;
import pe.com.cema.springboot.demo.rest.controller.OperationRestController;

import java.math.BigDecimal;

@SpringBootTest
public class OperacionesTest {

    @Autowired
    private OperationRestController operationRestController;

    @Test
    public void testWhenSumTwoNumbersThenResultIsFive() {
        final OperationBean operationBean = OperationBean.builder().operator("suma")
                .numbers(new BigDecimal[]{
                        new BigDecimal("1"),
                        new BigDecimal("4")
                }).build();
        BigDecimal resultado = operationRestController.makeOperation(operationBean);
        Assertions.assertEquals(new BigDecimal("5"), resultado);
    }

    @Test
    public void testWhenSubtractTwoNumbersThenResultIsThree(){
        final OperationBean operationBean = OperationBean.builder().operator("resta")
                .numbers(new BigDecimal[]{
                        new BigDecimal("7"),
                        new BigDecimal("4")
                }).build();
        BigDecimal resultado = operationRestController.makeOperation(operationBean);
        Assertions.assertEquals(new BigDecimal("3"), resultado);
    }

    @Test
    public void testWhenSubtractThreeNumbersThenResultIsOne(){
        final OperationBean operationBean = OperationBean.builder().operator("resta")
                .numbers(new BigDecimal[]{
                        new BigDecimal("7"),
                        new BigDecimal("4"),
                        new BigDecimal("2")
                }).build();
        BigDecimal resultado = operationRestController.makeOperation(operationBean);
        Assertions.assertEquals(new BigDecimal("1"), resultado);
    }
}