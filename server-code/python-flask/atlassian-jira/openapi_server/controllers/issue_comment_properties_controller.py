import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server import util


def delete_comment_property(comment_id, property_key):  # noqa: E501
    """Delete comment property

    Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group. # noqa: E501

    :param comment_id: The ID of the comment.
    :type comment_id: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_comment_property(comment_id, property_key):  # noqa: E501
    """Get comment property

    Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param comment_id: The ID of the comment.
    :type comment_id: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[EntityProperty, Tuple[EntityProperty, int], Tuple[EntityProperty, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_comment_property_keys(comment_id):  # noqa: E501
    """Get comment property keys

    Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param comment_id: The ID of the comment.
    :type comment_id: str

    :rtype: Union[PropertyKeys, Tuple[PropertyKeys, int], Tuple[PropertyKeys, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_comment_property(comment_id, property_key, body):  # noqa: E501
    """Set comment property

    Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group. # noqa: E501

    :param comment_id: The ID of the comment.
    :type comment_id: str
    :param property_key: The key of the property. The maximum length is 255 characters.
    :type property_key: str
    :param body: 
    :type body: 

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'