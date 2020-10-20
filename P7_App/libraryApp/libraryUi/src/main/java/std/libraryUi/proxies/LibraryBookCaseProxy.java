package std.libraryUi.proxies;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import std.libraryUi.beans.BookKindsBean;
import std.libraryUi.beans.BooksBean;

@FeignClient(name = "libraryBookCase", url = "localhost:9001")
public interface LibraryBookCaseProxy {

	@GetMapping(value = "/books")
	public List<BooksBean> books();

	@GetMapping(value = "/kinds")
	public List<BookKindsBean> kinds();

	@GetMapping(value = "/buildingFiltered")
	public List<BooksBean> booksBuildingFiltered(
			@RequestParam(name = "libraryBuilding") Integer libraryBuilding);

	@GetMapping(value ="/kindsFiltered")
	public List<BooksBean>booksKindsFiltered(
			@RequestParam(name = "kinds") List<String> kinds);

	@GetMapping(value = "/buildingAndKindsFiltered")
	public List<BooksBean> booksBuildingAndKindsFiltered(
			@RequestParam(name = "libraryBuilding") Integer libraryBuilding,
			@RequestParam(name = "kinds") List<String> kinds);


}