import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.login import Login  # noqa: E501
from openapi_server import util


def check_login(authorization):  # noqa: E501
    """Check if any user is logged in

    If a user is loggedin the username will be returned # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def login(body):  # noqa: E501
    """Login method

    After a successful login a token is returned. This is a Bearer token. To authenticate with it use the Authorization header and set value to Bearer empty space and the token value. # noqa: E501

    :param body: Username and password combination to allow users to log-in
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Login.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
