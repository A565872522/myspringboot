package controller;

import entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serviceImpl.ComputerServiceImpl;

@RestController
public class ComputerController {

    @Autowired
    ComputerServiceImpl csi;

    @RequestMapping("/insert")
    public int insert(){
        Computer c = new Computer(2,"a","b",23.3);
        return csi.insert(c);
    }
}
