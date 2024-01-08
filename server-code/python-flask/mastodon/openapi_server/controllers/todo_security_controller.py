import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_v1_accounts_post_request import ApiV1AccountsPostRequest  # noqa: E501
from openapi_server import util


def api_v1_accounts_post(api_v1_accounts_post_request=None):  # noqa: E501
    """api_v1_accounts_post

    Creates a user and account records. Returns an account access token for the app that initiated the request. The app should save this token for later, and should wait for the user to confirm their account by clicking a link in their email inbox. # noqa: E501

    :param api_v1_accounts_post_request: 
    :type api_v1_accounts_post_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_post_request = ApiV1AccountsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
