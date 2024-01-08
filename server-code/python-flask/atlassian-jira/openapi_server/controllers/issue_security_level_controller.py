import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.page_bean_issue_security_level_member import PageBeanIssueSecurityLevelMember  # noqa: E501
from openapi_server.models.security_level import SecurityLevel  # noqa: E501
from openapi_server import util


def get_issue_security_level(id):  # noqa: E501
    """Get issue security level

    Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param id: The ID of the issue security level.
    :type id: str

    :rtype: Union[SecurityLevel, Tuple[SecurityLevel, int], Tuple[SecurityLevel, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_security_level_members(issue_security_scheme_id, start_at=None, max_results=None, issue_security_level_id=None, expand=None):  # noqa: E501
    """Get issue security level members

    Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_security_scheme_id: The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
    :type issue_security_scheme_id: int
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param issue_security_level_id: The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: &#x60;issueSecurityLevelId&#x3D;10000&amp;issueSecurityLevelId&#x3D;10001&#x60;.
    :type issue_security_level_id: List[int]
    :param expand: Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.
    :type expand: str

    :rtype: Union[PageBeanIssueSecurityLevelMember, Tuple[PageBeanIssueSecurityLevelMember, int], Tuple[PageBeanIssueSecurityLevelMember, int, Dict[str, str]]
    """
    return 'do some magic!'
