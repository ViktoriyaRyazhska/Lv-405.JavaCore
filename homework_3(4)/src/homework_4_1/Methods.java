package homework_4_1;

class Methods_4_1 {
	
	enum HTTPError {
		BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound;
	}
	
	static void errorName(short hter) {
				
		switch(hter) {
		case 400:
			System.out.println("Помилка №" + hter + ": " + HTTPError.BadRequest);
			break;
		case 401:
			System.out.println("Помилка №" + hter + ": " + HTTPError.Unauthorized);
			break;
		case 402:
			System.out.println("Помилка №" + hter + ": " + HTTPError.PaymentRequired);				break;
		case 403:
			System.out.println("Помилка №" + hter + ": " + HTTPError.Forbidden);
			break;
		case 404:
			System.out.println(HTTPError.NotFound);
			break;
		default:
			System.out.println("Цього номеру немає в базі даних, виберіть і введіть номер із поданих вище");
		}
	}
}
