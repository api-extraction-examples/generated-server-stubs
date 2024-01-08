import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.remote_issue_link import RemoteIssueLink  # noqa: E501
from openapi_server.models.remote_issue_link_identifies import RemoteIssueLinkIdentifies  # noqa: E501
from openapi_server.models.remote_issue_link_request import RemoteIssueLinkRequest  # noqa: E501
from openapi_server import util


def create_or_update_remote_issue_link(issue_id_or_key, remote_issue_link_request):  # noqa: E501
    """Create or update remote issue link

    Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param remote_issue_link_request: 
    :type remote_issue_link_request: dict | bytes

    :rtype: Union[RemoteIssueLinkIdentifies, Tuple[RemoteIssueLinkIdentifies, int], Tuple[RemoteIssueLinkIdentifies, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remote_issue_link_request = RemoteIssueLinkRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_remote_issue_link_by_global_id(issue_id_or_key, global_id):  # noqa: E501
    """Delete remote issue link by global ID

    Deletes the remote issue link from the issue using the link&#39;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param global_id: The global ID of a remote issue link.
    :type global_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_remote_issue_link_by_id(issue_id_or_key, link_id):  # noqa: E501
    """Delete remote issue link by ID

    Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param link_id: The ID of a remote issue link.
    :type link_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remote_issue_link_by_id(issue_id_or_key, link_id):  # noqa: E501
    """Get remote issue link by ID

    Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param link_id: The ID of the remote issue link.
    :type link_id: str

    :rtype: Union[RemoteIssueLink, Tuple[RemoteIssueLink, int], Tuple[RemoteIssueLink, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remote_issue_links(issue_id_or_key, global_id=None):  # noqa: E501
    """Get remote issue links

    Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param global_id: The global ID of the remote issue link.
    :type global_id: str

    :rtype: Union[RemoteIssueLink, Tuple[RemoteIssueLink, int], Tuple[RemoteIssueLink, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_remote_issue_link(issue_id_or_key, link_id, remote_issue_link_request):  # noqa: E501
    """Update remote issue link by ID

    Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param link_id: The ID of the remote issue link.
    :type link_id: str
    :param remote_issue_link_request: 
    :type remote_issue_link_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remote_issue_link_request = RemoteIssueLinkRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
