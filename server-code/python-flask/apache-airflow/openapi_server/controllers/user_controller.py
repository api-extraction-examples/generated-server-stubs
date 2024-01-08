import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_collection import UserCollection  # noqa: E501
from openapi_server.models.user_collection_item import UserCollectionItem  # noqa: E501
from openapi_server import util


def delete_user(username):  # noqa: E501
    """Delete a user

    Delete a user with a specific username.  *New in version 2.2.0*  # noqa: E501

    :param username: The username of the user.  *New in version 2.1.0* 
    :type username: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user(username):  # noqa: E501
    """Get a user

    Get a user with a specific username.  *New in version 2.1.0*  # noqa: E501

    :param username: The username of the user.  *New in version 2.1.0* 
    :type username: str

    :rtype: Union[UserCollectionItem, Tuple[UserCollectionItem, int], Tuple[UserCollectionItem, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users(limit=None, offset=None, order_by=None):  # noqa: E501
    """List users

    Get a list of users.  *New in version 2.1.0*  # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[UserCollection, Tuple[UserCollection, int], Tuple[UserCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_user(username, user, update_mask=None):  # noqa: E501
    """Update a user

    Update fields for a user.  *New in version 2.2.0*  # noqa: E501

    :param username: The username of the user.  *New in version 2.1.0* 
    :type username: str
    :param user: 
    :type user: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[UserCollectionItem, Tuple[UserCollectionItem, int], Tuple[UserCollectionItem, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user = User.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_user(user):  # noqa: E501
    """Create a user

    Create a new user with unique username and email.  *New in version 2.2.0*  # noqa: E501

    :param user: 
    :type user: dict | bytes

    :rtype: Union[User, Tuple[User, int], Tuple[User, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user = User.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
