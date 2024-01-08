from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Token(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, access_token=None, created_at=None, scope=None, token_type=None):  # noqa: E501
        """Token - a model defined in OpenAPI

        :param access_token: The access_token of this Token.  # noqa: E501
        :type access_token: str
        :param created_at: The created_at of this Token.  # noqa: E501
        :type created_at: int
        :param scope: The scope of this Token.  # noqa: E501
        :type scope: str
        :param token_type: The token_type of this Token.  # noqa: E501
        :type token_type: str
        """
        self.openapi_types = {
            'access_token': str,
            'created_at': int,
            'scope': str,
            'token_type': str
        }

        self.attribute_map = {
            'access_token': 'access_token',
            'created_at': 'created_at',
            'scope': 'scope',
            'token_type': 'token_type'
        }

        self._access_token = access_token
        self._created_at = created_at
        self._scope = scope
        self._token_type = token_type

    @classmethod
    def from_dict(cls, dikt) -> 'Token':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Token of this Token.  # noqa: E501
        :rtype: Token
        """
        return util.deserialize_model(dikt, cls)

    @property
    def access_token(self) -> str:
        """Gets the access_token of this Token.

        An OAuth token to be used for authorization.  # noqa: E501

        :return: The access_token of this Token.
        :rtype: str
        """
        return self._access_token

    @access_token.setter
    def access_token(self, access_token: str):
        """Sets the access_token of this Token.

        An OAuth token to be used for authorization.  # noqa: E501

        :param access_token: The access_token of this Token.
        :type access_token: str
        """

        self._access_token = access_token

    @property
    def created_at(self) -> int:
        """Gets the created_at of this Token.

        When the token was generated. UNIX Timestamp.  # noqa: E501

        :return: The created_at of this Token.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: int):
        """Sets the created_at of this Token.

        When the token was generated. UNIX Timestamp.  # noqa: E501

        :param created_at: The created_at of this Token.
        :type created_at: int
        """

        self._created_at = created_at

    @property
    def scope(self) -> str:
        """Gets the scope of this Token.

        The OAuth scopes granted by this token, space-separated.  # noqa: E501

        :return: The scope of this Token.
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope: str):
        """Sets the scope of this Token.

        The OAuth scopes granted by this token, space-separated.  # noqa: E501

        :param scope: The scope of this Token.
        :type scope: str
        """

        self._scope = scope

    @property
    def token_type(self) -> str:
        """Gets the token_type of this Token.

        The OAuth token type. Mastodon uses `Bearer` tokens.  # noqa: E501

        :return: The token_type of this Token.
        :rtype: str
        """
        return self._token_type

    @token_type.setter
    def token_type(self, token_type: str):
        """Sets the token_type of this Token.

        The OAuth token type. Mastodon uses `Bearer` tokens.  # noqa: E501

        :param token_type: The token_type of this Token.
        :type token_type: str
        """

        self._token_type = token_type
