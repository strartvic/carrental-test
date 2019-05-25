package str.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import str.model.Auto;
import str.model.PointOfSale;

@Controller
public class MainController {
	
	private static List<PointOfSale> points = new ArrayList<PointOfSale>();
	
	private static List<Auto> autos = new ArrayList<Auto>();
	 
    static {
        points.add(new PointOfSale("Ленина 101"));
        points.add(new PointOfSale("Парк Победы 45"));
        
        autos.add(new Auto("Lada", "o723vn"));
        autos.add(new Auto("KIA", "o763gh"));
        autos.add(new Auto("SOLARIS", "o123vt"));
    }
 
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getMainMenu(Model model) {
        model.addAttribute("points", points);
        return "main";
    }
    
    @RequestMapping(value =  "/add-Point" , method = RequestMethod.GET)
    public String addPointPage() {
        return "addPointPage";
    }
 
    @RequestMapping(value= "/add-Point", method=RequestMethod.POST)
    public String addPoint(@RequestParam(value="title") String title) {
    	points.add(new PointOfSale(title));
    	return "redirect:/";
    }
    
    @RequestMapping(value="delete/{name}", method=RequestMethod.GET)
    public String deletePoint(@PathVariable String name) {

        return "redirect:/";
    }
}