package backend.server.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/car")
public class ComparisonController {

    @GetMapping("/compare")
    public String compareCars(){
        return "";
    }
}