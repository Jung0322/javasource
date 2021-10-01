package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//테이블 모양과 똑같이 작성
public class DeptDTO {
	private int deptNo;
	private String dname;
	private String loc;
		
}
