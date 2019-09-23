package com.springboot.springbootfocus.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt> TimeTask</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/29</dd>
 * </dl>
 *
 * @author lizhu
 */
@Component
@EnableScheduling
public class TimeTask {

    @Scheduled(cron = "0/5 * * * * ? ")
    public void exec(){
        Constants.addData();
        //System.out.println(Constants.list);
    }
}
