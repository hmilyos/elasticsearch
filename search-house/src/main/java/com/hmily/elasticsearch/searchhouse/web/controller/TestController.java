package com.hmily.elasticsearch.searchhouse.web.controller;

import com.hmily.elasticsearch.searchhouse.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/test/apires")
    @ResponseBody
    public ApiResponse testApiResponse(){
        return ApiResponse.ofSuccess("test ApiResponse");
    }

//    @GetMapping("/403")
//    public String test403(){
//        return "403";
//    }
//
//    @GetMapping("/404")
//    public String test404(){
//        return "404";
//    }
//
//    @GetMapping("/500")
//    public String test500(){
//        return "500";
//    }
//
//    @GetMapping("/logout")
//    public String testLogout(){
//        return "logout";
//    }


}
