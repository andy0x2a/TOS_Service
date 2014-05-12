package com.newman.tos.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: anewman
 * Date: 5/12/14
 */
@Controller
@RequestMapping("/tos")
public class TOSService {


    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    public ResponseObj check(HttpServletRequest request) {

        return new ResponseObj().withStatus(Status.ACTIVATE);
    }

}
