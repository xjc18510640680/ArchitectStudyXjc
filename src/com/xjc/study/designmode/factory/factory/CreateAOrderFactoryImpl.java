package com.xjc.study.designmode.factory.factory;

import com.xjc.study.designmode.factory.CreateOrderFactoryService;
import com.xjc.study.designmode.factory.CreateOrderService;
import com.xjc.study.designmode.factory.impl.CreateAOrderServiceImlp;

/**
 * Description: TODO
 *
 * @title: CreateAOrderFactoryImpl
 * Created by 19040838 on 2021.02.07 14:35
 */
public class CreateAOrderFactoryImpl implements CreateOrderFactoryService {
    @Override
    public CreateOrderService createOrder() {
        return new CreateAOrderServiceImlp();
    }
}
