package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class WorkspaceConstants {


    public static final String DROPDOWN_PROFILE = "xpath://*[@class='cl-rotate-90 cl-topbar-options-toggler']";

    public static final String WORKSPACE_MANAGER = "xpath://img[@class='cl-mr-2' and @src='/assets/ui-icons/three-dots-icon.svg']";
    public static final String BUTTON_NEW_WORSKPACES = "xpath://button[@class='cl-btn cl-btn-outline-primary cl-d-none-print']";
    public static final String INPUT_WORKSPACE_NAME = "xpath://input[@formcontrolname='name']";
    public static final String BUTTON_CREATE = "xpath://button[text()=' Create ']";
    public static final String BUTTON_SETTING = "xpath://*[@class='cl-btn cl-btn-primary cl-ml-3 cl-d-print-none']";
    public static final String INPUT_WORKSPACE_NAME_EDIT ="xpath://*[@class='cl-form-control ng-untouched ng-pristine ng-valid']";
    public static final String NAME_WORKSPACE = "xpath://span[contains(text(),'%s')]";
}
