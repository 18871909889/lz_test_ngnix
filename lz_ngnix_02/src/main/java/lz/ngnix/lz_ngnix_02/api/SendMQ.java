package lz.ngnix.lz_ngnix_02.api;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: SendMQ
 * @Package: lz.ngnix.lz_ngnix_02.api
 * @ProjectName lz_test_ngnix
 * @Description: TODO
 * @date 2019-04-26  14:33
 */
@RestController
public class SendMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/sendmsg")
    public String sendmsg(){
        rabbitTemplate.convertAndSend("bb", "李钊最帅！！！");
        return "发送成功！";
    }

}
