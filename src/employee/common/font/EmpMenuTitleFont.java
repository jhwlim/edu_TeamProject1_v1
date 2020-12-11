package employee.common.font;

import java.awt.Font;

public class EmpMenuTitleFont extends Font {

	static final String FONT_TYPE = "맑은 고딕";
	static final int FONT_STYLE = Font.CENTER_BASELINE;
	static final int FONT_SIZE = 26;
	
	public EmpMenuTitleFont() {
		super(FONT_TYPE, FONT_STYLE, FONT_SIZE);
	}
}
