import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.issue_link import IssueLink  # noqa: E501
from openapi_server.models.link_issue_request_json_bean import LinkIssueRequestJsonBean  # noqa: E501
from openapi_server import util


def delete_issue_link(link_id):  # noqa: E501
    """Delete issue link

    Deletes an issue link.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  Browse project [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues in the link.  *  *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one of the projects containing issues in the link.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues. # noqa: E501

    :param link_id: The ID of the issue link.
    :type link_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_link(link_id):  # noqa: E501
    """Get issue link

    Returns an issue link.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the linked issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues. # noqa: E501

    :param link_id: The ID of the issue link.
    :type link_id: str

    :rtype: Union[IssueLink, Tuple[IssueLink, int], Tuple[IssueLink, int, Dict[str, str]]
    """
    return 'do some magic!'


def link_issues(link_issue_request_json_bean):  # noqa: E501
    """Create issue link

    Creates a link between two issues. Use this operation to indicate a relationship between two issues and optionally add a comment to the from (outward) issue. To use this resource the site must have [Issue Linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This resource returns nothing on the creation of an issue link. To obtain the ID of the issue link, use &#x60;https://your-domain.atlassian.net/rest/api/3/issue/[linked issue key]?fields&#x3D;issuelinks&#x60;.  If the link request duplicates a link, the response indicates that the issue link was created. If the request included a comment, the comment is added.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues to be linked,  *  *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) on the project containing the from (outward) issue,  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param link_issue_request_json_bean: The issue link request.
    :type link_issue_request_json_bean: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        link_issue_request_json_bean = LinkIssueRequestJsonBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
