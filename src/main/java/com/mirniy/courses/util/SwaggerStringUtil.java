package com.mirniy.courses.util;

public class SwaggerStringUtil {

    public static final String ADD_COURSE_DESCR =
            "Метод фиксирует время передачи курса и добавляет в хранилище.";
    public static final String ADD_COURSES_DESCR =
            "Метод добавляет массив курсов в хранилище.";
    public static final String GET_COURSE_DESCR =
            "Метод возвращает последний установленный курс.";
    public static final String GET_MAX_FIVE_COURSES_DESCR =
            "Метод возвращает массив пяти последних самых высоких курса.";
    public static final String GET_THREE_EXTREMUM_COURSES_DESCR =
            "Метод возвращает массив трех последних наивысших пиков курса.";

    public static final String ADD_COURSE_REQ =
            "{\n" +
                    "    \"currencyId\": \"EUR\",\n" +
                    "    \"currencyVal\": 96.4557\n" +
                    "}";
    public static final String ADD_COURSE_RES =
            "{\n" +
                    "    \"errCode\": 0,\n" +
                    "    \"errMsg\": \"SUCCESS\"\n" +
                    "}";
    public static final String ADD_COURSE_ERR =
            "{\n" +
                    "    \"errCode\": 1,\n" +
                    "    \"errMsg\": \"JSON parse error: Cannot deserialize value of type " +
                    "`com.mirniy.courses.model.Currency` from String \"RUB\": " +
                    "not one of the values accepted for Enum class: [EUR, USD]\"\n" +
                    "}";

    public static final String ADD_COURSES_REQ =
            "[\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 92.8722,\n" +
                    "        \"regTime\": \"2024-02-07T11:31:42.201\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 92.8742,\n" +
                    "        \"regTime\": \"2024-02-07T12:31:44.122\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"EUR\",\n" +
                    "        \"currencyVal\": 99.9282,\n" +
                    "        \"regTime\": \"2024-02-07T13:02:22.114\"\n" +
                    "    }\n" +
                    "]";

    public static final String ADD_COURSES_RES =
            "{\n" +
                    "    \"errCode\": 0,\n" +
                    "    \"errMsg\": \"SUCCESS\"\n" +
                    "}";

    public static final String ADD_COURSES_ERR =
            "{\n" +
                    "    \"errCode\": 1,\n" +
                    "    \"errMsg\": \"JSON parse error: Cannot deserialize value of type " +
                    "`com.mirniy.courses.model.Currency` from String \"RUB\": " +
                    "not one of the values accepted for Enum class: [EUR, USD]\"\n" +
                    "}";

    public static final String GET_COURSE_RES =
            "{\n" +
                    "    \"currencyId\": \"USD\",\n" +
                    "    \"currencyVal\": 96.1522,\n" +
                    "    \"regTime\": \"2024-02-07T13:44:42.201\"\n" +
                    "}";

    public static final String GET_COURSE_ERR =
            "{\n" +
                    "    \"errCode\": 1,\n" +
                    "    \"errMsg\": \"Cannot invoke \\\"java.util.List.stream()\\\" because the return value " +
                    "of \\\"java.util.Map.get(Object)\\\" is null\"\n" +
                    "}";

    public static final String GET_MAX_FIVE_COURSES_RES =
            "[\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 96.1522,\n" +
                    "        \"regTime\": \"2024-02-07T13:44:42.201\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 95.9987,\n" +
                    "        \"regTime\": \"2024-02-07T18:55:10.201\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 94.8742,\n" +
                    "        \"regTime\": \"2024-02-07T12:31:44.122\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 93.4542,\n" +
                    "        \"regTime\": \"2024-02-07T12:36:44.122\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 93.4523,\n" +
                    "        \"regTime\": \"2024-02-07T17:32:10.201\"\n" +
                    "    }\n" +
                    "]";

    public static final String GET_MAX_FIVE_COURSES_ERR =
            "{\n" +
                    "    \"errCode\": 1,\n" +
                    "    \"errMsg\": \"Cannot invoke \\\"java.util.List.stream()\\\" because the return value " +
                    "of \\\"java.util.Map.get(Object)\\\" is null\"\n" +
                    "}";

    public static final String GET_THREE_EXTREMUM_COURSES_RES =
            "[\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 96.1522,\n" +
                    "        \"regTime\": \"2024-02-07T13:44:42.201\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 93.4542,\n" +
                    "        \"regTime\": \"2024-02-07T12:36:44.122\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"currencyId\": \"USD\",\n" +
                    "        \"currencyVal\": 94.8742,\n" +
                    "        \"regTime\": \"2024-02-07T12:31:44.122\"\n" +
                    "    }\n" +
                    "]";


    public static final String GET_THREE_EXTREMUM_COURSES_ERR =
            "{\n" +
                    "    \"errCode\": 1,\n" +
                    "    \"errMsg\": \"Cannot invoke \\\"java.util.List.stream()\\\" because the return value " +
                    "of \\\"java.util.Map.get(Object)\\\" is null\"\n" +
                    "}";
}
