package warmday.springmvc.helloworld;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HiController {
    @RequestMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("name","warmday"); // ָ��Model��ֵ
        model.addAttribute("url","http://www.baidu.com"); // ָ��Model��ֵ
        return ("/WEB-INF/view/say.jsp");
    }
}
