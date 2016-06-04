package cn.cloudtop.strawberry.rest;

import java.util.List;

/**
 * Created by jackie on 16-4-26
 */
public class ValidResponse extends RestResponse {

    private static final int Field_Valid_Error = 100901;

    private String paramName;
    private List<FieldValidError> fieldErrors;

    public ValidResponse(String paramName, List<FieldValidError> fieldErrors) {
        super(Field_Valid_Error, "param valid error,detail see fieldErrors.");
        this.paramName = paramName;
        this.fieldErrors = fieldErrors;
    }

    public String getParamName() {
        return paramName;
    }

    public List<FieldValidError> getFieldErrors() {
        return fieldErrors;
    }
}
