package com.example.designpattern.app.structural.bridge;

import com.example.designpattern.app.structural.bridge.model.*;
import com.example.designpattern.app.structural.bridge.sample.Abstraction;
import com.example.designpattern.app.structural.bridge.sample.ConcreateImplementor;
import com.example.designpattern.app.structural.bridge.sample.RefinedAbstraction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BridgeController {

    @RequestMapping("/bridge/sample")
    public ResponseEntity<String> bridgeSample() throws Exception {

        Abstraction abstraction = new RefinedAbstraction(new ConcreateImplementor());

        return ResponseEntity.ok(abstraction.operation());

    }

    @RequestMapping("/bridge")
    public ResponseEntity<Void> bridge() throws Exception {
        Building bank = new Bank(new SteelDoor());
        Building hospital = new Hospital(new GlassDoor());

        log.info("bank : " + bank.build());

        log.info("hospital : " + hospital.build());

        return ResponseEntity.ok().build();

    }
}
