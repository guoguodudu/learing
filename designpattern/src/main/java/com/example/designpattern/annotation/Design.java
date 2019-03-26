package com.example.designpattern.annotation;

public class Design {

    @OperationLogDetail(detail = "通过手机号获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    public void  kk(){

        System.out.println("------------");
    }
}
