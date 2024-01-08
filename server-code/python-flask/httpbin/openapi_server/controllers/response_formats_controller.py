import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def brotli_get():  # noqa: E501
    """Returns Brotli-encoded data.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def deflate_get():  # noqa: E501
    """Returns Deflate-encoded data.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def deny_get():  # noqa: E501
    """Returns page denied by robots.txt rules.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def encoding_utf8_get():  # noqa: E501
    """Returns a UTF-8 encoded body.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def gzip_get():  # noqa: E501
    """Returns GZip-encoded data.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def html_get():  # noqa: E501
    """Returns a simple HTML document.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def json_get():  # noqa: E501
    """Returns a simple JSON document.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def robots_txt_get():  # noqa: E501
    """Returns some robots.txt rules.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def xml_get():  # noqa: E501
    """Returns a simple XML document.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
