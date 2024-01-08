import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_token_request import PostTokenRequest  # noqa: E501
from openapi_server.models.token import Token  # noqa: E501
from openapi_server.models.tokens import Tokens  # noqa: E501
from openapi_server import util


def delete_token(token_id):  # noqa: E501
    """Delete an access token by ID.

     # noqa: E501

    :param token_id: The access token ID.
    :type token_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_token(token_id):  # noqa: E501
    """Get a single access token by ID.

     # noqa: E501

    :param token_id: The access token ID.
    :type token_id: str

    :rtype: Union[Token, Tuple[Token, int], Tuple[Token, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tokens(show_all=None):  # noqa: E501
    """Returns a list of tokens in the account.

     # noqa: E501

    :param show_all: If set to true, and the authentication access token has the \&quot;Admin\&quot; role, personal access tokens for all members will be retrieved.
    :type show_all: bool

    :rtype: Union[Tokens, Tuple[Tokens, int], Tuple[Tokens, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_token(token_id, patch_delta):  # noqa: E501
    """Modify an access token by ID.

     # noqa: E501

    :param token_id: The access token ID.
    :type token_id: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[Token, Tuple[Token, int], Tuple[Token, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_token(token_body):  # noqa: E501
    """Create a new token.

     # noqa: E501

    :param token_body: Create a new access token.
    :type token_body: dict | bytes

    :rtype: Union[Token, Tuple[Token, int], Tuple[Token, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        token_body = PostTokenRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reset_token(token_id, expiry=None):  # noqa: E501
    """Reset an access token&#39;s secret key with an optional expiry time for the old key.

     # noqa: E501

    :param token_id: The access token ID.
    :type token_id: str
    :param expiry: An expiration time for the old token key, expressed as a Unix epoch time in milliseconds. By default, the token will expire immediately.
    :type expiry: int

    :rtype: Union[Token, Tuple[Token, int], Tuple[Token, int, Dict[str, str]]
    """
    return 'do some magic!'
