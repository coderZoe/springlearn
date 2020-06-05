package com.coderzoe.demo5;

import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/5 15:51
 * @description 实际业务类 不关心其他
 */
@Component
public class Landlord {
    public void rent(){
        System.out.println("签合同");
        System.out.println("收房租");
    }
}
