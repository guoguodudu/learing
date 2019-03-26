package com.example.designpattern.annotation;

import com.example.designpattern.DesignpatternApplicationTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogAspectTest extends DesignpatternApplicationTests {

    @OperationLogDetail(detail = "通过手机号获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Test
    public void kk() {

    }


}