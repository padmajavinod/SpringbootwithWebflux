package Controller;

import Employee.Empinfo;
import Empservices.Emplyoyeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Emplyoyeeservice empservice;


//service call with java 8 features
//    @RequestMapping("/getalldata")
//    public List<Empinfo> getEmpdetails() {
//
//        return empservice.getEmpdetails();
//
//    }
//
//
//    @RequestMapping("/getabyid/{id}")
//    public Empinfo getempid(@PathVariable("id") Integer id) {
//        return empservice.getempid(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/*")
//    public void addemployee(@RequestBody Empinfo empinfo) {
//        empservice.addemployee(empinfo);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/*/{id}")
//    public void upemployee(@RequestBody Empinfo empinfo,@PathVariable("id") Integer id) {
//        empservice.updateemployee(id,empinfo);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/*/{id}")
//    public Empinfo deleteempid(@RequestBody Empinfo empinfo,@PathVariable("id") Integer id) {
//        return empservice.getempid(id);
//    }

}
