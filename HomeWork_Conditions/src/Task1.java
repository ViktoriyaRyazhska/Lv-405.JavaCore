package soft.serve;


public class Task1 {

	private double firstFloatNmbr;
	private double secondFloatNmbr;
	private double thirdFloatNmbr;

	private int firstIntNmbr;
	private int secondIntNmbr;
	private int thirdIntNmbr;

	private int startOfRange;
	private int endOfRange;

	public Task1() {
	}

	public void setFirstFloatNmbr(double firstFloatNmbr) {
		this.firstFloatNmbr = firstFloatNmbr;
	}

	public void setSecondFloatNmbr(double secondFloatNmbr) {
		this.secondFloatNmbr = secondFloatNmbr;
	}

	public void setThirdFloatNmbr(double thirdFloatNmbr) {
		this.thirdFloatNmbr = thirdFloatNmbr;
	}

	public void setFirstIntNmbr(int firstIntNmbr) {
		this.firstIntNmbr = firstIntNmbr;
	}

	public void setSecondIntNmbr(int secondIntNmbr) {
		this.secondIntNmbr = secondIntNmbr;
	}

	public void setThirdIntNmbr(int thirdIntNmbr) {
		this.thirdIntNmbr = thirdIntNmbr;
	}

	public void setStartOfRange(int startOfRange) {
		this.startOfRange = startOfRange;
	}

	public void setEndOfRange(int endOfRange) {
		this.endOfRange = endOfRange;
	}

	public int getStartOfRange() {
		return startOfRange;
	}

	public int getEndOfRange() {
		return endOfRange;
	}



	public boolean belong(double firstFloatNmbr, double secondFloatNmbr, double thirdFloatNmbr) {
		return (firstFloatNmbr >= startOfRange && endOfRange >= firstFloatNmbr)
				&& (secondFloatNmbr >= startOfRange && endOfRange >= secondFloatNmbr)
				&& (thirdFloatNmbr >= startOfRange && endOfRange >= thirdFloatNmbr);
	}

	public String fromTrueFalseToYesNo() {
		return belong(firstFloatNmbr, secondFloatNmbr, thirdFloatNmbr) == true ? "Yes" : "No";
	}

	public int getMin() {
		if ((this.firstIntNmbr <= this.secondIntNmbr) && (this.firstIntNmbr <= this.thirdIntNmbr)) {
			return this.firstIntNmbr;
		}
		if (this.secondIntNmbr <= this.thirdIntNmbr) {
			return this.secondIntNmbr;
		} else {
			return this.thirdIntNmbr;
		}
	}

	public int getMax() {
		if ((this.firstIntNmbr >= this.secondIntNmbr) && (this.firstIntNmbr >= this.thirdIntNmbr)) {
			return this.firstIntNmbr;
		}
		if (this.secondIntNmbr >= this.thirdIntNmbr) {
			return this.secondIntNmbr;
		} else {
			return this.thirdIntNmbr;
		}
	}

	public enum HTTPError {
		BAD_REQUEST("Bad Request"), 
		UNAUTHORIZED("Unauthorized"), 
		INTERNAL_SERVER_ERROR("Internal Server Error"),
		NOT_IMPLEMENTED("Not Implemented");

		String errorName;

		HTTPError(String errorName) {
			this.errorName = errorName;
		}

	}

	public String getErrorName(int errorCode) {
		switch (errorCode) {
		case 400:
			return HTTPError.BAD_REQUEST.errorName;
		case 401:
			return HTTPError.UNAUTHORIZED.errorName;
		case 500:
			return HTTPError.INTERNAL_SERVER_ERROR.errorName;
		case 501:
			return HTTPError.NOT_IMPLEMENTED.errorName;
		default:
			return "Enter this codes 400, 401, 500, 501";
		}
	}

}
