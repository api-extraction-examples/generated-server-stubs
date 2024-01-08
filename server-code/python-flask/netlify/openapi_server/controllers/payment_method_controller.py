import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.payment_method import PaymentMethod  # noqa: E501
from openapi_server import util


def list_payment_methods_for_user():  # noqa: E501
    """list_payment_methods_for_user

     # noqa: E501


    :rtype: Union[List[PaymentMethod], Tuple[List[PaymentMethod], int], Tuple[List[PaymentMethod], int, Dict[str, str]]
    """
    return 'do some magic!'
