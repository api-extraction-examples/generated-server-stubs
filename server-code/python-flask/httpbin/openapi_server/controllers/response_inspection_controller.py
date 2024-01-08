import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def cache_get(if_modified_since=None, if_none_match=None):  # noqa: E501
    """Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.

     # noqa: E501

    :param if_modified_since: 
    :type if_modified_since: str
    :param if_none_match: 
    :type if_none_match: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def cache_value_get(value):  # noqa: E501
    """Sets a Cache-Control header for n seconds.

     # noqa: E501

    :param value: 
    :type value: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def etag_etag_get(etag, if_none_match=None, if_match=None):  # noqa: E501
    """Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.

     # noqa: E501

    :param etag: Automatically added
    :type etag: str
    :param if_none_match: 
    :type if_none_match: str
    :param if_match: 
    :type if_match: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def response_headers_get(freeform=None):  # noqa: E501
    """Returns a set of response headers from the query string.

     # noqa: E501

    :param freeform: 
    :type freeform: Dict[str, str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def response_headers_post(freeform=None):  # noqa: E501
    """Returns a set of response headers from the query string.

     # noqa: E501

    :param freeform: 
    :type freeform: Dict[str, str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
