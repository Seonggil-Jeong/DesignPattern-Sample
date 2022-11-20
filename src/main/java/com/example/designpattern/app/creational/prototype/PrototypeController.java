package com.example.designpattern.app.creational.prototype;

import com.example.designpattern.app.creational.prototype.sample.Manager;
import com.example.designpattern.app.creational.prototype.sample.MessageBox;
import com.example.designpattern.app.creational.prototype.sample.Product;
import com.example.designpattern.app.creational.prototype.sample.UnderlinePen;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PrototypeController {

    @RequestMapping("/prototype")
    public ResponseEntity<Void> prototype() throws Exception {
        final String underlinePenName = "strong message";
        final String messageBoxName = "warning box";

        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox = new MessageBox('*');

        manager.register(underlinePenName, underlinePen);
        manager.register(messageBoxName, messageBox);

        Product underlinePenProduct = manager.create(underlinePenName);
        underlinePenProduct.use("Hello world");

        Product messageBoxProduct = manager.create(messageBoxName);
        messageBoxProduct.use("Hello world");


        return ResponseEntity.ok().build();
    }
}
