package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cerseilannister on 02/09/16.
 */

@Controller
public class SampleController
{

    @RequestMapping("/")
    @ResponseBody
    String home()
    {
        return "Hello World!";
    }

    @RequestMapping("/Peter")
    String peter()
    {
        return "foo";
    }
}
