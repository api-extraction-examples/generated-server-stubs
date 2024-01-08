from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccessToken(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, access_token=None, created_at=None, id=None, user_email=None, user_id=None):  # noqa: E501
        """AccessToken - a model defined in OpenAPI

        :param access_token: The access_token of this AccessToken.  # noqa: E501
        :type access_token: str
        :param created_at: The created_at of this AccessToken.  # noqa: E501
        :type created_at: str
        :param id: The id of this AccessToken.  # noqa: E501
        :type id: str
        :param user_email: The user_email of this AccessToken.  # noqa: E501
        :type user_email: str
        :param user_id: The user_id of this AccessToken.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'access_token': str,
            'created_at': str,
            'id': str,
            'user_email': str,
            'user_id': str
        }

        self.attribute_map = {
            'access_token': 'access_token',
            'created_at': 'created_at',
            'id': 'id',
            'user_email': 'user_email',
            'user_id': 'user_id'
        }

        self._access_token = access_token
        self._created_at = created_at
        self._id = id
        self._user_email = user_email
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'AccessToken':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The accessToken of this AccessToken.  # noqa: E501
        :rtype: AccessToken
        """
        return util.deserialize_model(dikt, cls)

    @property
    def access_token(self) -> str:
        """Gets the access_token of this AccessToken.


        :return: The access_token of this AccessToken.
        :rtype: str
        """
        return self._access_token

    @access_token.setter
    def access_token(self, access_token: str):
        """Sets the access_token of this AccessToken.


        :param access_token: The access_token of this AccessToken.
        :type access_token: str
        """

        self._access_token = access_token

    @property
    def created_at(self) -> str:
        """Gets the created_at of this AccessToken.


        :return: The created_at of this AccessToken.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this AccessToken.


        :param created_at: The created_at of this AccessToken.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def id(self) -> str:
        """Gets the id of this AccessToken.


        :return: The id of this AccessToken.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AccessToken.


        :param id: The id of this AccessToken.
        :type id: str
        """

        self._id = id

    @property
    def user_email(self) -> str:
        """Gets the user_email of this AccessToken.


        :return: The user_email of this AccessToken.
        :rtype: str
        """
        return self._user_email

    @user_email.setter
    def user_email(self, user_email: str):
        """Sets the user_email of this AccessToken.


        :param user_email: The user_email of this AccessToken.
        :type user_email: str
        """

        self._user_email = user_email

    @property
    def user_id(self) -> str:
        """Gets the user_id of this AccessToken.


        :return: The user_id of this AccessToken.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this AccessToken.


        :param user_id: The user_id of this AccessToken.
        :type user_id: str
        """

        self._user_id = user_id