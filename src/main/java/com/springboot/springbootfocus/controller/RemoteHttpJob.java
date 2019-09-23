package com.springboot.springbootfocus.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * <dl>
 * <dt> RemoteHttpJob</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/4/15</dd>
 * </dl>
 *
 * @author lizhu
 */
@RestController
@RequestMapping("/remote")
public class RemoteHttpJob {

    private Logger logger = LoggerFactory.getLogger(RemoteHttpJob.class);

    @RequestMapping(value = "/job",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)

    public String execute(@RequestBody  JSONObject param){
        logger.debug("开始执行任务");
        if(logger.isInfoEnabled()){
            logger.info("执行的时间为:{}",param.getString("date"));
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result","success");
        return jsonObject.toJSONString();
    }

}
