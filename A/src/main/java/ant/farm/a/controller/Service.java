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
        ant.farm.b.api.ServiceApi bapi = new ant.farm.b.api.ServiceApi();
        ant.farm.c.api.ServiceApi capi = new ant.farm.c.api.ServiceApi();
        String bcall = "error with b";
        String ccall = "error with c";
        try {
            bcall = bapi.serviceUsingGET("fromB");
        } catch (ant.farm.b.ApiException e) {
            e.printStackTrace();
        }

        try {
            ccall = capi.serviceUsingGET("fromC");
        } catch (ant.farm.c.ApiException e) {
            e.printStackTrace();
        }

        return "service: (from ma) " + ma.call() + "\n" +
                "service: (from c) " + ccall +
                "service: (from b) " + bcall;
    }
}
