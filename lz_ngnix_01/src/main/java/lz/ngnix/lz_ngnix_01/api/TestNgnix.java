package lz.ngnix.lz_ngnix_01.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: TestNgnix
 * @Package: lz.ngnix.lz_ngnix_01.api
 * @ProjectName lz_test_ngnix
 * @Description: TODO
 * @date 2019-04-19  16:25
 */
@RestController
public class TestNgnix {

    @Value("${server.port}")
    String post;


    @RequestMapping("/")
    public String getpost(){
        return  "这是ngnix的访问：" + post;
    }
}
