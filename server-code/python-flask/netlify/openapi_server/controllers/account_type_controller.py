import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_type import AccountType  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def list_account_types_for_user():  # noqa: E501
    """list_account_types_for_user

     # noqa: E501


    :rtype: Union[List[AccountType], Tuple[List[AccountType], int], Tuple[List[AccountType], int, Dict[str, str]]
    """
    return 'do some magic!'
