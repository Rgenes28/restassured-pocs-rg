package restassured.Utils;


import io.restassured.http.ContentType;
import restassured.models.UserValidate;

public class Constantes {
    public static final String BASE_URL = "https://reqres.in/api";
    public static final String LOGIN_ENDPOINT = "/login";
    public static final String USERS_ENDPOINT = "/users/2";
    public static final String HEADER_KEY = "x-api-key";
    public static final String HEADER_VALUE = "reqres-free-v1";
    public static final ContentType CONTENT_TYPE = ContentType.JSON;

    public static final UserValidate VALID_USER = new UserValidate("eve.holt@reqres.in", "cityslicka");


}
