import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.transfer import Transfer  # noqa: E501
from openapi_server import util


def trasnfer(authorization, body):  # noqa: E501
    """trasnfer

    Transfer money between two accounts # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param body: Transfer details including ammount, sender and receiver
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Transfer.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
