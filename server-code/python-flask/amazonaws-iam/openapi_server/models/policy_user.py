from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PolicyUser(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, user_id=None):  # noqa: E501
        """PolicyUser - a model defined in OpenAPI

        :param user_name: The user_name of this PolicyUser.  # noqa: E501
        :type user_name: str
        :param user_id: The user_id of this PolicyUser.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'user_name': str,
            'user_id': str
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'user_id': 'UserId'
        }

        self._user_name = user_name
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'PolicyUser':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PolicyUser of this PolicyUser.  # noqa: E501
        :rtype: PolicyUser
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this PolicyUser.


        :return: The user_name of this PolicyUser.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this PolicyUser.


        :param user_name: The user_name of this PolicyUser.
        :type user_name: str
        """

        self._user_name = user_name

    @property
    def user_id(self) -> str:
        """Gets the user_id of this PolicyUser.


        :return: The user_id of this PolicyUser.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this PolicyUser.


        :param user_id: The user_id of this PolicyUser.
        :type user_id: str
        """

        self._user_id = user_id
