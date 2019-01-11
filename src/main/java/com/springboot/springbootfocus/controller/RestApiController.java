package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.vo.RestApiDemoVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt> RestApiController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/1/11</dd>
 * </dl>
 *
 * @author lizhu
 */
@RestController
@RequestMapping("/restApiDemo")
public class RestApiController {

    @ApiOperation(value = "获取用户列表",notes = "")
    @RequestMapping(value = "/queryList",method = RequestMethod.POST)
    public List<RestApiDemoVO> queryList(@RequestBody RestApiDemoVO restApiDemoVO){
        ArrayList<RestApiDemoVO> dataList = new ArrayList<>();
        dataList.add(restApiDemoVO);
        return dataList;
    }

}
