package day2_5;

import java.time.*;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuestBook {
	private Long gno;
	private String content;
	private String writer;
	private LocalDateTime writeTime;
}
