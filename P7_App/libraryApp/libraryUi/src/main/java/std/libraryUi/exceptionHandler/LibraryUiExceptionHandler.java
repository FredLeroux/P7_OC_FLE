package std.libraryUi.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import std.libraryUi.errorDecoder.exceptions.ChronoUnitNotImplementedException;
import std.libraryUi.errorDecoder.exceptions.LoanNotFoundException;

@RestControllerAdvice
public class LibraryUiExceptionHandler {

	@ExceptionHandler(value = LoanNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public ModelAndView postponeLoanNotFoundError() {
		ModelAndView model = new ModelAndView("/errorPageTrigger");
		model.addObject("errorCode", HttpStatus.NOT_FOUND.value());
		return model;
	}

	@ExceptionHandler(value = ChronoUnitNotImplementedException.class)
	@ResponseStatus(code=HttpStatus.NOT_IMPLEMENTED)
	public ModelAndView postponeChronoUnitError() {
		ModelAndView model = new ModelAndView("/errorPageTrigger");
		model.addObject("errorCode", HttpStatus.NOT_IMPLEMENTED.value());
		return model;
	}


	private ModelAndView errorModel(Integer httpStatusCode) {
		ModelAndView model = new ModelAndView("/errorPageTrigger");
		model.addObject("errorCode", HttpStatus.NOT_IMPLEMENTED.value());
		return model;
	}
}
