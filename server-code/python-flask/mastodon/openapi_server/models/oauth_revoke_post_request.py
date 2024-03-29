from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class OauthRevokePostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client_id=None, client_secret=None, token=None):  # noqa: E501
        """OauthRevokePostRequest - a model defined in OpenAPI

        :param client_id: The client_id of this OauthRevokePostRequest.  # noqa: E501
        :type client_id: str
        :param client_secret: The client_secret of this OauthRevokePostRequest.  # noqa: E501
        :type client_secret: str
        :param token: The token of this OauthRevokePostRequest.  # noqa: E501
        :type token: str
        """
        self.openapi_types = {
            'client_id': str,
            'client_secret': str,
            'token': str
        }

        self.attribute_map = {
            'client_id': 'client_id',
            'client_secret': 'client_secret',
            'token': 'token'
        }

        self._client_id = client_id
        self._client_secret = client_secret
        self._token = token

    @classmethod
    def from_dict(cls, dikt) -> 'OauthRevokePostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _oauth_revoke_post_request of this OauthRevokePostRequest.  # noqa: E501
        :rtype: OauthRevokePostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client_id(self) -> str:
        """Gets the client_id of this OauthRevokePostRequest.

        Client ID, obtained during app registration  # noqa: E501

        :return: The client_id of this OauthRevokePostRequest.
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id: str):
        """Sets the client_id of this OauthRevokePostRequest.

        Client ID, obtained during app registration  # noqa: E501

        :param client_id: The client_id of this OauthRevokePostRequest.
        :type client_id: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def client_secret(self) -> str:
        """Gets the client_secret of this OauthRevokePostRequest.

        Client secret, obtained during app registration  # noqa: E501

        :return: The client_secret of this OauthRevokePostRequest.
        :rtype: str
        """
        return self._client_secret

    @client_secret.setter
    def client_secret(self, client_secret: str):
        """Sets the client_secret of this OauthRevokePostRequest.

        Client secret, obtained during app registration  # noqa: E501

        :param client_secret: The client_secret of this OauthRevokePostRequest.
        :type client_secret: str
        """
        if client_secret is None:
            raise ValueError("Invalid value for `client_secret`, must not be `None`")  # noqa: E501

        self._client_secret = client_secret

    @property
    def token(self) -> str:
        """Gets the token of this OauthRevokePostRequest.

        The previously obtained token, to be invalidated  # noqa: E501

        :return: The token of this OauthRevokePostRequest.
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token: str):
        """Sets the token of this OauthRevokePostRequest.

        The previously obtained token, to be invalidated  # noqa: E501

        :param token: The token of this OauthRevokePostRequest.
        :type token: str
        """
        if token is None:
            raise ValueError("Invalid value for `token`, must not be `None`")  # noqa: E501

        self._token = token
