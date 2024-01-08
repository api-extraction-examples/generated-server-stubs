import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_membership import AccountMembership  # noqa: E501
from openapi_server.models.account_setup import AccountSetup  # noqa: E501
from openapi_server.models.account_update_setup import AccountUpdateSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def cancel_account(account_id):  # noqa: E501
    """cancel_account

     # noqa: E501

    :param account_id: 
    :type account_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_account(account_setup):  # noqa: E501
    """create_account

     # noqa: E501

    :param account_setup: 
    :type account_setup: dict | bytes

    :rtype: Union[AccountMembership, Tuple[AccountMembership, int], Tuple[AccountMembership, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        account_setup = AccountSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_account(account_id):  # noqa: E501
    """get_account

     # noqa: E501

    :param account_id: 
    :type account_id: str

    :rtype: Union[List[AccountMembership], Tuple[List[AccountMembership], int], Tuple[List[AccountMembership], int, Dict[str, str]]
    """
    return 'do some magic!'


def list_accounts_for_user():  # noqa: E501
    """list_accounts_for_user

     # noqa: E501


    :rtype: Union[List[AccountMembership], Tuple[List[AccountMembership], int], Tuple[List[AccountMembership], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_account(account_id, account_update_setup=None):  # noqa: E501
    """update_account

     # noqa: E501

    :param account_id: 
    :type account_id: str
    :param account_update_setup: 
    :type account_update_setup: dict | bytes

    :rtype: Union[AccountMembership, Tuple[AccountMembership, int], Tuple[AccountMembership, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        account_update_setup = AccountUpdateSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
