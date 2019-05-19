package Lesson_4_HW;

public enum HttpError {
    BadRequest("Bad Request"), Unauthorized("Unauthorized"), PaymentRequired("Payment Required"), Forbidden("Forbidden"),
    NotFound("Not Found"), MethodNotAllowed("Method Not Allowed"), NotAcceptable("Not Acceptable"),
    RequestTimeout("Request Timeout"), ProxyAuthenticationRequired("Proxy Authentication Required");

    String error;

    HttpError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
