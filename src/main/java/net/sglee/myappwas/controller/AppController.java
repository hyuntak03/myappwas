package net.sglee.myappwas.controller;

//import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    private static final Logger logger =
            LoggerFactory.getLogger(AppController.class);

    @RequestMapping(
            value = "/msg",
            method = RequestMethod.GET)
    @ResponseBody
    public String sendMsg(
            @RequestParam("name") String _name) {
//        JSONObject jsonObject = service.selectAllRecords(_tableName);
//        if(jsonObject != null) {
//            return jsonObject.toString();
//        } else {
//            return "no records";
//        }
        return "Hello" + _name;
    }
}
