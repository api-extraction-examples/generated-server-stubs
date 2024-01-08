import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.avatar import Avatar  # noqa: E501
from openapi_server.models.issue_type_create_bean import IssueTypeCreateBean  # noqa: E501
from openapi_server.models.issue_type_details import IssueTypeDetails  # noqa: E501
from openapi_server.models.issue_type_update_bean import IssueTypeUpdateBean  # noqa: E501
from openapi_server import util


def create_issue_type(issue_type_create_bean):  # noqa: E501
    """Create issue type

    Creates an issue type and adds it to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_create_bean: 
    :type issue_type_create_bean: dict | bytes

    :rtype: Union[IssueTypeDetails, Tuple[IssueTypeDetails, int], Tuple[IssueTypeDetails, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_create_bean = IssueTypeCreateBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_issue_type_avatar(id, size, body, x=None, y=None):  # noqa: E501
    """Load issue type avatar

    Loads an avatar for the issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST \\ --user email@example.com:&lt;api_token&gt; \\ --header &#39;X-Atlassian-Token: no-check&#39; \\ --header &#39;Content-Type: image/&lt; image_type&gt;&#39; \\ --data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; \\ --url &#39;https://your-domain.atlassian.net/rest/api/3/issuetype/{issueTypeId}&#39;This&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar, use [ Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue type.
    :type id: str
    :param size: The length of each side of the crop region.
    :type size: int
    :param body: 
    :type body: 
    :param x: The X coordinate of the top-left corner of the crop region.
    :type x: int
    :param y: The Y coordinate of the top-left corner of the crop region.
    :type y: int

    :rtype: Union[Avatar, Tuple[Avatar, int], Tuple[Avatar, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_issue_type(id, alternative_issue_type_id=None):  # noqa: E501
    """Delete issue type

    Deletes the issue type. If the issue type is in use, all uses are updated with the alternative issue type (&#x60;alternativeIssueTypeId&#x60;). A list of alternative issue types are obtained from the [Get alternative issue types](#api-rest-api-3-issuetype-id-alternatives-get) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue type.
    :type id: str
    :param alternative_issue_type_id: The ID of the replacement issue type.
    :type alternative_issue_type_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_alternative_issue_types(id):  # noqa: E501
    """Get alternative issue types

    Returns a list of issue types that can be used to replace the issue type. The alternative issue types are those assigned to the same workflow scheme, field configuration scheme, and screen scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param id: The ID of the issue type.
    :type id: str

    :rtype: Union[List[IssueTypeDetails], Tuple[List[IssueTypeDetails], int], Tuple[List[IssueTypeDetails], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_all_types():  # noqa: E501
    """Get all issue types for user

    Returns all issue types.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issue types are only returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), all issue types are returned.  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, the issue types associated with the projects the user has permission to browse are returned. # noqa: E501


    :rtype: Union[List[IssueTypeDetails], Tuple[List[IssueTypeDetails], int], Tuple[List[IssueTypeDetails], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type(id):  # noqa: E501
    """Get issue type

    Returns an issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in a project the issue type is associated with or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue type.
    :type id: str

    :rtype: Union[IssueTypeDetails, Tuple[IssueTypeDetails, int], Tuple[IssueTypeDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_types_for_project(project_id, level=None):  # noqa: E501
    """Get issue types for project

    Returns issue types for a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in the relevant project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: int
    :param level: The level of the issue type to filter by. Use:   *  &#x60;-1&#x60; for Subtask.  *  &#x60;0&#x60; for Base.  *  &#x60;1&#x60; for Epic.
    :type level: int

    :rtype: Union[List[IssueTypeDetails], Tuple[List[IssueTypeDetails], int], Tuple[List[IssueTypeDetails], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_issue_type(id, issue_type_update_bean):  # noqa: E501
    """Update issue type

    Updates the issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue type.
    :type id: str
    :param issue_type_update_bean: 
    :type issue_type_update_bean: dict | bytes

    :rtype: Union[IssueTypeDetails, Tuple[IssueTypeDetails, int], Tuple[IssueTypeDetails, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_update_bean = IssueTypeUpdateBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
