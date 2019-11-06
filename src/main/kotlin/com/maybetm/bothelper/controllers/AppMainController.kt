package com.maybetm.bothelper.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * @author zebzeev-sv
 * @version 06.11.2019 22:39
 */
@Controller("/")
class AppMainController {

    @GetMapping
    fun indexRequest(): String {
        return "appMain";
    }
}