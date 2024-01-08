import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.authentication_info_query_result import AuthenticationInfoQueryResult  # noqa: E501
from openapi_server import util


def create_key(app):  # noqa: E501
    """Create a new api key.

     # noqa: E501

    :param app: Name of the app using the authentication key.
    :type app: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_keys():  # noqa: E501
    """Get all keys.

     # noqa: E501


    :rtype: Union[AuthenticationInfoQueryResult, Tuple[AuthenticationInfoQueryResult, int], Tuple[AuthenticationInfoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def revoke_key(key):  # noqa: E501
    """Remove an api key.

     # noqa: E501

    :param key: The access token to delete.
    :type key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
