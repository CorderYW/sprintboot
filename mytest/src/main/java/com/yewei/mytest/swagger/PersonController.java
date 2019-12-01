package com.yewei.mytest.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户相关接口")
@RestController
@RequestMapping(value = "/web/api/person")
public class PersonController {


    @ApiOperation(value = "用户详细信息", notes = "通过id获得用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", defaultValue = "0")})
    @RequestMapping(value="page",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public Person  getById(@RequestParam(value="id",defaultValue = "0") Long id){
        return new Person(id,2,"小小","杭州");
    }

    //大咖分页列表
    @ApiOperation(value = "删除用户信息", notes = "通过ID删除用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", defaultValue = "0")})
    @RequestMapping(value="delete",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public String  delete(@RequestParam(value="id",defaultValue = "0") Long id){

        return "删除成功";
    }
}
