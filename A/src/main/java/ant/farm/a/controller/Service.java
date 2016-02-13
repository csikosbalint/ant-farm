package ant.farm.a.controller;

import ant.farm.A;
import ant.farm.a.module.MA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(A.ROOT + "/a")
public class Service {
    @Autowired
    private MA ma;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String service(@RequestBody String a) {
        return "service: " + a + ma.call();
    }
}
