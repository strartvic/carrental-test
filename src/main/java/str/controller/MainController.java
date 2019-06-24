package str.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import str.model.Auto;
import str.model.PointOfSale;
import str.service.CarrentalService;

@Controller
public class MainController {

	private CarrentalService carrental = new CarrentalService();

	private PointOfSale currentPoint;

	private Auto currentAuto;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMainMenu(Model model) {
		model.addAttribute("points", carrental.getAll());
		return "main";
	}

	@RequestMapping(value = "/add-Point", method = RequestMethod.GET)
	public String addPointPage() {
		return "addPointPage";
	}

	@RequestMapping(value = "/add-Point", method = RequestMethod.POST)
	public String addPoint(@RequestParam(value = "title") String title) {
		carrental.add(new PointOfSale(title));
		return "redirect:/";
	}

	@RequestMapping(value = "delete-point/{name}", method = RequestMethod.GET)
	public String deletePoint(@PathVariable String name) {
		carrental.delete(carrental.get(name));
		return "redirect:/";
	}

	@RequestMapping(value = "point-page/{name}", method = RequestMethod.GET)
	public String getPointPage(Model model, @PathVariable String name) {
		model.addAttribute("name", name);
		currentPoint = carrental.get(name);
		List<Auto> autos = carrental.getAutos(currentPoint);
		model.addAttribute("autos", autos);
		return "pointPage";
	}

	@RequestMapping(value = "/add-auto", method = RequestMethod.GET)
	public String addAutoPage() {
		return "addAutoPage";
	}

	@RequestMapping(value = "/add-auto", method = RequestMethod.POST)
	public String addAuto(@RequestParam(value = "carModel") String carModel,
			@RequestParam(value = "number") String number) {
		carrental.addAuto(new Auto(carModel, number, currentPoint.getName()));
		return "redirect:/";
	}

	@RequestMapping(value = "delete-auto/{carModel}", method = RequestMethod.GET)
	public String getDeleteAuto(@PathVariable String carModel) {
		carrental.deleteAuto(carrental.getAuto(currentPoint, carModel));
		return "redirect:/";
	}

	@RequestMapping(value = "/rent-auto/{carModel}", method = RequestMethod.GET)
	public String addRentAutoPage(@PathVariable String carModel) {
		currentAuto = carrental.getAuto(currentPoint, carModel);
		return "rentAutoPage";
	}

	@RequestMapping(value = "/rent-auto/{carModel}", method = RequestMethod.POST)
	public String addRentAuto(@PathVariable String carModel, @RequestParam(value = "renter") String renter,
			@RequestParam(value = "dateBegin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateBegin,
			@RequestParam(value = "dateEnd") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateEnd) {
		currentAuto.addToHistory(dateBegin, dateEnd, renter);
		return "redirect:/";
	}

	@RequestMapping(value = "/history-auto/{carModel}", method = RequestMethod.GET)
	public String addHistoryAutoPage(Model model, @PathVariable String carModel) {
		currentAuto = carrental.getAuto(currentPoint, carModel);
		model.addAttribute("name", carModel);
		model.addAttribute("history", currentAuto.getHistory());

		return "historyPage";
	}
}