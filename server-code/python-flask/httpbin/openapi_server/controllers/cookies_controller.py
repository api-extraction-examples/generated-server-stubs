import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def cookies_delete_get(freeform=None):  # noqa: E501
    """Deletes cookie(s) as provided by the query string and redirects to cookie list.

     # noqa: E501

    :param freeform: 
    :type freeform: Dict[str, str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def cookies_get():  # noqa: E501
    """Returns cookie data.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def cookies_set_get(freeform=None):  # noqa: E501
    """Sets cookie(s) as provided by the query string and redirects to cookie list.

     # noqa: E501

    :param freeform: 
    :type freeform: Dict[str, str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def cookies_set_name_value_get(name, value):  # noqa: E501
    """Sets a cookie and redirects to cookie list.

     # noqa: E501

    :param name: 
    :type name: str
    :param value: 
    :type value: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
