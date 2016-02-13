package ant.farm.c.controller;

import ant.farm.C;
import ant.farm.c.module.MC;
import ant.farm.x.module.MX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(C.ROOT + "/c")
public class Service {
    @Autowired
    private MC mc;
    @Autowired
    private MX mx;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String service(@RequestBody String a) {
        return "service: " + a + mc.call() + mx.call();
    }
}
