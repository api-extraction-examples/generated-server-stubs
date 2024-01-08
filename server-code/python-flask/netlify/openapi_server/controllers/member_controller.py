import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_add_member_setup import AccountAddMemberSetup  # noqa: E501
from openapi_server.models.account_update_member_setup import AccountUpdateMemberSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.member import Member  # noqa: E501
from openapi_server import util


def add_member_to_account(account_slug, account_add_member_setup):  # noqa: E501
    """add_member_to_account

     # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param account_add_member_setup: 
    :type account_add_member_setup: dict | bytes

    :rtype: Union[List[Member], Tuple[List[Member], int], Tuple[List[Member], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        account_add_member_setup = AccountAddMemberSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_account_member(account_slug, member_id):  # noqa: E501
    """get_account_member

     # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param member_id: 
    :type member_id: str

    :rtype: Union[Member, Tuple[Member, int], Tuple[Member, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_members_for_account(account_slug):  # noqa: E501
    """list_members_for_account

     # noqa: E501

    :param account_slug: 
    :type account_slug: str

    :rtype: Union[List[Member], Tuple[List[Member], int], Tuple[List[Member], int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_account_member(account_slug, member_id):  # noqa: E501
    """remove_account_member

     # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param member_id: 
    :type member_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_account_member(account_slug, member_id, account_update_member_setup):  # noqa: E501
    """update_account_member

     # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param member_id: 
    :type member_id: str
    :param account_update_member_setup: 
    :type account_update_member_setup: dict | bytes

    :rtype: Union[Member, Tuple[Member, int], Tuple[Member, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        account_update_member_setup = AccountUpdateMemberSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
