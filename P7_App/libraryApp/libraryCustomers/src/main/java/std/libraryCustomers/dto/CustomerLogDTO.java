package std.libraryCustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerLogDTO {

	private String customerEmail;
	private String customerPassword;
	private String customerAuthToken;
	private LibraryRoleDTO role;

}
