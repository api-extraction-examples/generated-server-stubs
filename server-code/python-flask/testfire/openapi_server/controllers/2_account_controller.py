import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.dates import Dates  # noqa: E501
from openapi_server import util


def get_account(authorization):  # noqa: E501
    """get_account

    Returns a list of all the accounts owned by the user # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_account_balance(authorization, account_no):  # noqa: E501
    """get_account_balance

    Returns details about a specific account # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param account_no: Account id
    :type account_no: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_transactions(authorization, account_no, body):  # noqa: E501
    """get_transactions

    Return transactions between 2 specific dates # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param account_no: Account id
    :type account_no: str
    :param body: A start date and an end date
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Dates.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def show_last_ten_transactions(authorization, account_no):  # noqa: E501
    """show_last_ten_transactions

    Returns the last 10 transactions attached to an account # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param account_no: Account id
    :type account_no: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
