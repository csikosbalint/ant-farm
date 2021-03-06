package ant.farm.b.controller;

import ant.farm.B;
import ant.farm.b.module.MB;
import ant.farm.x.module.MX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(B.ROOT + "/b")
public class Service {
    @Autowired
    private MB mb;

    @Autowired
    private MX mx;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String service(@RequestBody String a) {
        ant.farm.c.api.ServiceApi capi = new ant.farm.c.api.ServiceApi();
        String ccall = "error with c";

        try {
            ccall = capi.serviceUsingGET("fromC");
        } catch (ant.farm.c.ApiException e) {
            e.printStackTrace();
        }

        return "service: " + a + mb.call() + mx.call() + ccall;
    }
}
