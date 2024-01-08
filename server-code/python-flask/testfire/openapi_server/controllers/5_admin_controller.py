import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.change_password import ChangePassword  # noqa: E501
from openapi_server.models.new_user import NewUser  # noqa: E501
from openapi_server import util


def add_user(authorization, body):  # noqa: E501
    """add_user

    Add new user # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param body: Details of a new user including first name, last name, desired username and a password
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = NewUser.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def change_password(authorization, body):  # noqa: E501
    """change_password

    Change user password # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param body: Information about the user password to be changed including id and new password
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = ChangePassword.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
