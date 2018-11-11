package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: IndexController
 * @package: com.nowcoder.controller
 * @describe:
 * @auther: huangxianchao
 * @date: 2018/4/23
 * @time: 22:43
 **/
@Controller
public class IndexController {


    /**
     * @methodName: index
     * @param: []
     * @describe: 项目启动进入界面
     * @auther: huangxianchao
     * @date: 2018/4/23
     * @time: 22:45
     **/
    @RequestMapping(path = {"/","/index"})
    @ResponseBody
    public  String index(){
        return "Hello NowCoder";
    }

    /**
     * @methodName: profile
     * @param: [groupId, userId, type, key]
     * @describe: TODO
     * @auther: huangxianchao
     * @date: 2018/4/23
     * @time: 23:19
     **/
    @RequestMapping(value = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId, @PathVariable("userId")int userId,
                          @RequestParam(value = "type",defaultValue = "1") int type,
                           @RequestParam(value = "key",defaultValue = "nowcoder")String key){
        return String.format("{%s},{%d},{%d},{%s}",groupId,userId,type,key);
    }

    @RequestMapping(value = {"/vm"})
    public String news(){
        return "news";
    }
}
