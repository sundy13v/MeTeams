
package com.springdemo.web;


import com.cn.provider.DemoService;
import com.springdemo.service.MessageSenderProx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: zhanghua
 * @Date: 2015年5月6日 上午10:27:19
 * @ModifyUser: feizi
 * @ModifyDate: 2015年5月6日 上午10:27:19
 * @Version:V6.0
 */

@Controller
public class DemoController {

    private static final int SEND_NUMBER = 5;

    @Autowired
    private MessageSenderProx messageSenderProx;
    @Autowired
    private DemoService demoService;
    @RequestMapping("/hello")
    public ModelAndView handleRequest() throws Exception {

        System.out.println("==========================Hello World!=========================");
            String a=demoService.getName("a","b");
            messageSenderProx.send("FirstQueue","{\"username\":\"username\",\"password\":\"password\"}");
            return new ModelAndView("/hello");


    }

}
