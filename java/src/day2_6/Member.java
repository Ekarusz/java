package day2_6;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
	private String username;
	private String password;
	private String email;
}
