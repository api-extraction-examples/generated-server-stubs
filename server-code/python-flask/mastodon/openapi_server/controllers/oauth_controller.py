import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.oauth_revoke_post_request import OauthRevokePostRequest  # noqa: E501
from openapi_server.models.oauth_token_post200_response import OauthTokenPost200Response  # noqa: E501
from openapi_server.models.oauth_token_post_request import OauthTokenPostRequest  # noqa: E501
from openapi_server import util


def oauth_authorize_get(response_type, client_id, redirect_uri, scope=None, force_login=None):  # noqa: E501
    """oauth_authorize_get

    Displays an authorization form to the user. If approved, it will create and return an authorization code, then redirect to the desired redirect_uri, or show the authorization code if urn:ietf:wg:oauth:2.0:oob was requested. The authorization code can be used while requesting a token to obtain access to user-level methods. # noqa: E501

    :param response_type: Should be set equal to code.
    :type response_type: str
    :param client_id: Client ID, obtained during app registration.
    :type client_id: str
    :param redirect_uri: Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the authorization code will be shown instead. Must match one of the redirect URIs declared during app registration.
    :type redirect_uri: str
    :param scope: List of requested OAuth scopes, separated by spaces (or by pluses, if using query parameters). Must be a subset of scopes declared during app registration. If not provided, defaults to read.
    :type scope: str
    :param force_login: Added in 2.6.0. Forces the user to re-login, which is necessary for authorizing with multiple accounts from the same instance.
    :type force_login: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def oauth_revoke_post(oauth_revoke_post_request=None):  # noqa: E501
    """oauth_revoke_post

    Revoke an access token to make it no longer valid for use. # noqa: E501

    :param oauth_revoke_post_request: 
    :type oauth_revoke_post_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        oauth_revoke_post_request = OauthRevokePostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def oauth_token_post(oauth_token_post_request=None):  # noqa: E501
    """oauth_token_post

    Returns an access token, to be used during API calls that are not public. # noqa: E501

    :param oauth_token_post_request: 
    :type oauth_token_post_request: dict | bytes

    :rtype: Union[OauthTokenPost200Response, Tuple[OauthTokenPost200Response, int], Tuple[OauthTokenPost200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        oauth_token_post_request = OauthTokenPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
