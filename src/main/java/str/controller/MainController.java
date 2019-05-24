package str.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import str.model.Auto;
import str.model.PointsOfSale;

@Controller
public class MainController {
	
	private static List<PointsOfSale> points = new ArrayList<PointsOfSale>();
	
	private static List<Auto> autos = new ArrayList<Auto>();
	 
    static {
        points.add(new PointsOfSale("точка 1", "автомобили"));
        points.add(new PointsOfSale("точка 2", "автомобили"));
        
        autos.add(new Auto("Lada", "o723vn"));
        autos.add(new Auto("KIA", "o763gh"));
        autos.add(new Auto("SOLARIS", "o123vt"));
    }
 
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getMain(Model model) {
        model.addAttribute("points", points);
        return "main";
    }
    
    /**@RequestMapping(value = { "/addPoint" }, method = RequestMethod.GET)
    public String addPoint(Model model) {
 
    	PointsOfSale point = new PointsOfSale();
        model.addAttribute("point", point);
 
        return "addPoint";
    }
 
    @RequestMapping(value = { "/addPoint" }, method = RequestMethod.POST)
    public String addPoint(Model model, //
            @ModelAttribute("point") PointsOfSale _point) {
 
        String firstName = _point.getName();
 
        if (firstName != null && firstName.length()>0) {
        	PointsOfSale newPoint = new PointsOfSale(firstName, "");
            points.add(newPoint);
 
            return "redirect:/main";
        }
        String error = "First Name & Last Name is required!";
        model.addAttribute("errorMessage", error);
        return "addPoint";
    }*/
 
}