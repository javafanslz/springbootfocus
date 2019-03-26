package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.service.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt> ProfileController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@RestController
public class ProfileController {

    @Autowired
    private SpeakService speakService;

    @RequestMapping("/speak")
    public String speak(){
        return speakService.speak();
    }

}
