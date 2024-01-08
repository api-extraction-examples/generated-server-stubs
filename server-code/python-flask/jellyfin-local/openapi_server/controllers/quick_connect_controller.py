import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.quick_connect_result import QuickConnectResult  # noqa: E501
from openapi_server.models.quick_connect_state import QuickConnectState  # noqa: E501
from openapi_server import util


def activate():  # noqa: E501
    """Temporarily activates quick connect for five minutes.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def authorize(code):  # noqa: E501
    """Authorizes a pending quick connect request.

     # noqa: E501

    :param code: Quick connect code to authorize.
    :type code: str

    :rtype: Union[bool, Tuple[bool, int], Tuple[bool, int, Dict[str, str]]
    """
    return 'do some magic!'


def available(status=None):  # noqa: E501
    """Enables or disables quick connect.

     # noqa: E501

    :param status: New MediaBrowser.Model.QuickConnect.QuickConnectState.
    :type status: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        status =  QuickConnectState.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def connect(secret):  # noqa: E501
    """Attempts to retrieve authentication information.

     # noqa: E501

    :param secret: Secret previously returned from the Initiate endpoint.
    :type secret: str

    :rtype: Union[QuickConnectResult, Tuple[QuickConnectResult, int], Tuple[QuickConnectResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def deauthorize():  # noqa: E501
    """Deauthorize all quick connect devices for the current user.

     # noqa: E501


    :rtype: Union[int, Tuple[int, int], Tuple[int, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_status():  # noqa: E501
    """Gets the current quick connect state.

     # noqa: E501


    :rtype: Union[QuickConnectState, Tuple[QuickConnectState, int], Tuple[QuickConnectState, int, Dict[str, str]]
    """
    return 'do some magic!'


def initiate():  # noqa: E501
    """Initiate a new quick connect request.

     # noqa: E501


    :rtype: Union[QuickConnectResult, Tuple[QuickConnectResult, int], Tuple[QuickConnectResult, int, Dict[str, str]]
    """
    return 'do some magic!'
