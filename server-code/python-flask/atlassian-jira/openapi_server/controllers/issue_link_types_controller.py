import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.issue_link_type import IssueLinkType  # noqa: E501
from openapi_server.models.issue_link_types import IssueLinkTypes  # noqa: E501
from openapi_server import util


def create_issue_link_type(issue_link_type):  # noqa: E501
    """Create issue link type

    Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#39;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_link_type: 
    :type issue_link_type: dict | bytes

    :rtype: Union[IssueLinkType, Tuple[IssueLinkType, int], Tuple[IssueLinkType, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_link_type = IssueLinkType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_issue_link_type(issue_link_type_id):  # noqa: E501
    """Delete issue link type

    Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_link_type_id: The ID of the issue link type.
    :type issue_link_type_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_link_type(issue_link_type_id):  # noqa: E501
    """Get issue link type

    Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site. # noqa: E501

    :param issue_link_type_id: The ID of the issue link type.
    :type issue_link_type_id: str

    :rtype: Union[IssueLinkType, Tuple[IssueLinkType, int], Tuple[IssueLinkType, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_link_types():  # noqa: E501
    """Get issue link types

    Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site. # noqa: E501


    :rtype: Union[IssueLinkTypes, Tuple[IssueLinkTypes, int], Tuple[IssueLinkTypes, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_issue_link_type(issue_link_type_id, issue_link_type):  # noqa: E501
    """Update issue link type

    Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_link_type_id: The ID of the issue link type.
    :type issue_link_type_id: str
    :param issue_link_type: 
    :type issue_link_type: dict | bytes

    :rtype: Union[IssueLinkType, Tuple[IssueLinkType, int], Tuple[IssueLinkType, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_link_type = IssueLinkType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
