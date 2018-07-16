package one.kastordriver.dailyvision.controlller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kastor on 7/1/2018.
 */
@RestController
public class StatisticsController {

    @PostMapping("/do")
    @ResponseStatus(HttpStatus.OK)
    public void dodo() {

    }
}
