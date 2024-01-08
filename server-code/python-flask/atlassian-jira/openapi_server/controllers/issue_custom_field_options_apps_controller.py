import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.issue_field_option import IssueFieldOption  # noqa: E501
from openapi_server.models.issue_field_option_create_bean import IssueFieldOptionCreateBean  # noqa: E501
from openapi_server.models.page_bean_issue_field_option import PageBeanIssueFieldOption  # noqa: E501
from openapi_server.models.task_progress_bean_remove_option_from_issues_result import TaskProgressBeanRemoveOptionFromIssuesResult  # noqa: E501
from openapi_server import util


def create_issue_field_option(field_key, issue_field_option_create_bean):  # noqa: E501
    """Create issue field option

    Creates an option for a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param issue_field_option_create_bean: 
    :type issue_field_option_create_bean: dict | bytes

    :rtype: Union[IssueFieldOption, Tuple[IssueFieldOption, int], Tuple[IssueFieldOption, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_field_option_create_bean = IssueFieldOptionCreateBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_issue_field_option(field_key, option_id):  # noqa: E501
    """Delete issue field option

    Deletes an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param option_id: The ID of the option to be deleted.
    :type option_id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_issue_field_options(field_key, start_at=None, max_results=None):  # noqa: E501
    """Get all issue field options

    Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanIssueFieldOption, Tuple[PageBeanIssueFieldOption, int], Tuple[PageBeanIssueFieldOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_field_option(field_key, option_id):  # noqa: E501
    """Get issue field option

    Returns an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param option_id: The ID of the option to be returned.
    :type option_id: int

    :rtype: Union[IssueFieldOption, Tuple[IssueFieldOption, int], Tuple[IssueFieldOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_selectable_issue_field_options(field_key, start_at=None, max_results=None, project_id=None):  # noqa: E501
    """Get selectable issue field options

    Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param project_id: Filters the results to options that are only available in the specified project.
    :type project_id: int

    :rtype: Union[PageBeanIssueFieldOption, Tuple[PageBeanIssueFieldOption, int], Tuple[PageBeanIssueFieldOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_visible_issue_field_options(field_key, start_at=None, max_results=None, project_id=None):  # noqa: E501
    """Get visible issue field options

    Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param project_id: Filters the results to options that are only available in the specified project.
    :type project_id: int

    :rtype: Union[PageBeanIssueFieldOption, Tuple[PageBeanIssueFieldOption, int], Tuple[PageBeanIssueFieldOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def replace_issue_field_option(field_key, option_id, replace_with=None, jql=None, override_screen_security=None, override_editable_flag=None):  # noqa: E501
    """Replace issue field option

    Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.  Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This is an [asynchronous operation](#async). The response object contains a link to the long-running task.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param option_id: The ID of the option to be deselected.
    :type option_id: int
    :param replace_with: The ID of the option that will replace the currently selected option.
    :type replace_with: int
    :param jql: A JQL query that specifies the issues to be updated. For example, *project&#x3D;10000*.
    :type jql: str
    :param override_screen_security: Whether screen security is overridden to enable hidden fields to be edited. Available to Connect and Forge app users with admin permission.
    :type override_screen_security: bool
    :param override_editable_flag: Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    :type override_editable_flag: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_issue_field_option(field_key, option_id, issue_field_option):  # noqa: E501
    """Update issue field option

    Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field. # noqa: E501

    :param field_key: The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60;
    :type field_key: str
    :param option_id: The ID of the option to be updated.
    :type option_id: int
    :param issue_field_option: 
    :type issue_field_option: dict | bytes

    :rtype: Union[IssueFieldOption, Tuple[IssueFieldOption, int], Tuple[IssueFieldOption, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_field_option = IssueFieldOption.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'