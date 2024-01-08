import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bulk_issue_property_update_request import BulkIssuePropertyUpdateRequest  # noqa: E501
from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.issue_entity_properties import IssueEntityProperties  # noqa: E501
from openapi_server.models.issue_filter_for_bulk_property_delete import IssueFilterForBulkPropertyDelete  # noqa: E501
from openapi_server.models.multi_issue_entity_properties import MultiIssueEntityProperties  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server import util


def bulk_delete_issue_property(property_key, issue_filter_for_bulk_property_delete):  # noqa: E501
    """Bulk delete issue property

    Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.  The criteria the filter used to identify eligible issues are:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.  If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [ project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue. # noqa: E501

    :param property_key: The key of the property.
    :type property_key: str
    :param issue_filter_for_bulk_property_delete: 
    :type issue_filter_for_bulk_property_delete: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_filter_for_bulk_property_delete = IssueFilterForBulkPropertyDelete.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bulk_set_issue_properties_by_issue(multi_issue_entity_properties):  # noqa: E501
    """Bulk set issue properties by issue

    Sets or updates entity property values on issues. Up to 10 entity properties can be specified for each issue and up to 100 issues included in the request.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON.  This operation is:   *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  *  non-transactional. Updating some entities may fail. Such information will available in the task result.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param multi_issue_entity_properties: Details of the issue properties to be set or updated. Note that if an issue is not found, it is ignored.
    :type multi_issue_entity_properties: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        multi_issue_entity_properties = MultiIssueEntityProperties.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bulk_set_issue_property(property_key, bulk_issue_property_update_request):  # noqa: E501
    """Bulk set issue property

    Sets a property value on multiple issues.  The value set can be a constant or determined by a [Jira expression](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/). Expressions must be computable with constant complexity when applied to a set of issues. Expressions must also comply with the [restrictions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions) that apply to all Jira expressions.  The issues to be updated can be specified by a filter.  The filter identifies issues eligible for update using these criteria:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  *  &#x60;hasProperty&#x60;:           *  If *true*, only issues with the property are eligible.      *  If *false*, only issues without the property are eligible.  If more than one criteria is specified, they are joined with the logical *AND*: only issues that satisfy all criteria are eligible.  If an invalid combination of criteria is provided, an error is returned. For example, specifying a &#x60;currentValue&#x60; and &#x60;hasProperty&#x60; as *false* would not match any issues (because without the property the property cannot have a value).  The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either all eligible issues are updated or, when errors occur, none are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue. # noqa: E501

    :param property_key: The key of the property. The maximum length is 255 characters.
    :type property_key: str
    :param bulk_issue_property_update_request: 
    :type bulk_issue_property_update_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bulk_issue_property_update_request = BulkIssuePropertyUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bulk_set_issues_properties_list(issue_entity_properties):  # noqa: E501
    """Bulk set issues properties by list

    Sets or updates a list of entity property values on issues. A list of up to 10 entity properties can be specified along with up to 10,000 issues on which to set or update that list of entity properties.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.  This operation is:   *  transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_entity_properties: Issue properties to be set or updated with values.
    :type issue_entity_properties: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_entity_properties = IssueEntityProperties.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_issue_property(issue_id_or_key, property_key):  # noqa: E501
    """Delete issue property

    Deletes an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The key or ID of the issue.
    :type issue_id_or_key: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_property(issue_id_or_key, property_key):  # noqa: E501
    """Get issue property

    Returns the key and value of an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The key or ID of the issue.
    :type issue_id_or_key: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[EntityProperty, Tuple[EntityProperty, int], Tuple[EntityProperty, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_property_keys(issue_id_or_key):  # noqa: E501
    """Get issue property keys

    Returns the URLs and keys of an issue&#39;s properties.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Property details are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The key or ID of the issue.
    :type issue_id_or_key: str

    :rtype: Union[PropertyKeys, Tuple[PropertyKeys, int], Tuple[PropertyKeys, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_issue_property(issue_id_or_key, property_key, body):  # noqa: E501
    """Set issue property

    Sets the value of an issue&#39;s property. Use this resource to store custom data against an issue.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param property_key: The key of the issue property. The maximum length is 255 characters.
    :type property_key: str
    :param body: 
    :type body: 

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
