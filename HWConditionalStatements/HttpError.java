package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpError {

    private enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed");

        private int ErrorNumber;
        private String ErrorName;

        public int getErrorNumber() {
            return ErrorNumber;
        }

        public String getErrorName() {
            return ErrorName;
        }

        HTTPError(int errorNumber, String errorName) {
            this.ErrorNumber = errorNumber;
            this.ErrorName = errorName;
        }
    }

    public static void main(String[] args) throws IOException {


        System.out.println("Please, enter error number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int errorNumber = Integer.parseInt(br.readLine());

        System.out.println(getErrorName(errorNumber));


    }

    public static String getErrorName(int errorNumber) throws IOException {

        switch (errorNumber) {
            case 400:
                return HTTPError.BAD_REQUEST.getErrorName();
            case 401:
                return HTTPError.UNAUTHORIZED.getErrorName();
            case 402:
                return HTTPError.PAYMENT_REQUIRED.getErrorName();
            case 403:
                return HTTPError.FORBIDDEN.getErrorName();
            case 404:
                return HTTPError.NOT_FOUND.getErrorName();
            case 405:
                return HTTPError.METHOD_NOT_ALLOWED.getErrorName();
            default:
                return null;
        }
    }

}

