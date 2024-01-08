import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.redirect_to_put_request import RedirectToPutRequest  # noqa: E501
from openapi_server import util


def absolute_redirect_nget(n):  # noqa: E501
    """Absolutely 302 Redirects n times.

     # noqa: E501

    :param n: 
    :type n: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redirect_nget(n):  # noqa: E501
    """302 Redirects n times.

     # noqa: E501

    :param n: 
    :type n: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redirect_to_delete():  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redirect_to_get(url, status_code=None):  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501

    :param url: 
    :type url: str
    :param status_code: 
    :type status_code: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redirect_to_patch():  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redirect_to_post(redirect_to_put_request):  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501

    :param redirect_to_put_request: 
    :type redirect_to_put_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        redirect_to_put_request = RedirectToPutRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def redirect_to_put(redirect_to_put_request):  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501

    :param redirect_to_put_request: 
    :type redirect_to_put_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        redirect_to_put_request = RedirectToPutRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def redirect_to_trace():  # noqa: E501
    """302/3XX Redirects to the given URL.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def relative_redirect_nget(n):  # noqa: E501
    """Relatively 302 Redirects n times.

     # noqa: E501

    :param n: 
    :type n: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
