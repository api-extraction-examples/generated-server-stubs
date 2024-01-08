import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def basic_auth_user_passwd_get(user, passwd):  # noqa: E501
    """Prompts the user for authorization using HTTP Basic Auth.

     # noqa: E501

    :param user: 
    :type user: str
    :param passwd: 
    :type passwd: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def bearer_get(authorization=None):  # noqa: E501
    """Prompts the user for authorization using bearer authentication.

     # noqa: E501

    :param authorization: 
    :type authorization: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def digest_auth_qop_user_passwd_algorithm_get(qop, user, passwd, algorithm):  # noqa: E501
    """Prompts the user for authorization using Digest Auth + Algorithm.

     # noqa: E501

    :param qop: auth or auth-int
    :type qop: str
    :param user: 
    :type user: str
    :param passwd: 
    :type passwd: str
    :param algorithm: MD5, SHA-256, SHA-512
    :type algorithm: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def digest_auth_qop_user_passwd_algorithm_stale_after_get(qop, user, passwd, algorithm, stale_after):  # noqa: E501
    """Prompts the user for authorization using Digest Auth + Algorithm.

    allow settings the stale_after argument.  # noqa: E501

    :param qop: auth or auth-int
    :type qop: str
    :param user: 
    :type user: str
    :param passwd: 
    :type passwd: str
    :param algorithm: MD5, SHA-256, SHA-512
    :type algorithm: str
    :param stale_after: 
    :type stale_after: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def digest_auth_qop_user_passwd_get(qop, user, passwd):  # noqa: E501
    """Prompts the user for authorization using Digest Auth.

     # noqa: E501

    :param qop: auth or auth-int
    :type qop: str
    :param user: 
    :type user: str
    :param passwd: 
    :type passwd: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def hidden_basic_auth_user_passwd_get(user, passwd):  # noqa: E501
    """Prompts the user for authorization using HTTP Basic Auth.

     # noqa: E501

    :param user: 
    :type user: str
    :param passwd: 
    :type passwd: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
