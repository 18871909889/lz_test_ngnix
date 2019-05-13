package lz.ngnix.lz_ngnix_02.api;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: Recvmsg
 * @Package: lz.ngnix.lz_ngnix_02.api
 * @ProjectName lz_test_ngnix
 * @Description: TODO
 * @date 2019-04-26  14:58
 */
@RestController
public class Recvmsg {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "bb")
    @RabbitHandler
    @GetMapping("/getRecvmsg")
    public String getRecvmsg(Message message){
        String json = null;
        try {
            json = new String(message.getBody(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return json;
    }

}
