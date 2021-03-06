package std.libraryUi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UiLoanDateAndBooksList {

	private Integer year;
	private Integer month;
	private Integer day;
	private Integer daysLeft;
	private String booksTitle;

}
