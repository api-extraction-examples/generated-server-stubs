from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_invite_type import BetaInviteType
from openapi_server import util

from openapi_server.models.beta_invite_type import BetaInviteType  # noqa: E501

class BetaTesterAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, email=None, first_name=None, invite_type=None, last_name=None):  # noqa: E501
        """BetaTesterAttributes - a model defined in OpenAPI

        :param email: The email of this BetaTesterAttributes.  # noqa: E501
        :type email: str
        :param first_name: The first_name of this BetaTesterAttributes.  # noqa: E501
        :type first_name: str
        :param invite_type: The invite_type of this BetaTesterAttributes.  # noqa: E501
        :type invite_type: BetaInviteType
        :param last_name: The last_name of this BetaTesterAttributes.  # noqa: E501
        :type last_name: str
        """
        self.openapi_types = {
            'email': str,
            'first_name': str,
            'invite_type': BetaInviteType,
            'last_name': str
        }

        self.attribute_map = {
            'email': 'email',
            'first_name': 'firstName',
            'invite_type': 'inviteType',
            'last_name': 'lastName'
        }

        self._email = email
        self._first_name = first_name
        self._invite_type = invite_type
        self._last_name = last_name

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTester_attributes of this BetaTesterAttributes.  # noqa: E501
        :rtype: BetaTesterAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def email(self) -> str:
        """Gets the email of this BetaTesterAttributes.


        :return: The email of this BetaTesterAttributes.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this BetaTesterAttributes.


        :param email: The email of this BetaTesterAttributes.
        :type email: str
        """

        self._email = email

    @property
    def first_name(self) -> str:
        """Gets the first_name of this BetaTesterAttributes.


        :return: The first_name of this BetaTesterAttributes.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this BetaTesterAttributes.


        :param first_name: The first_name of this BetaTesterAttributes.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def invite_type(self) -> BetaInviteType:
        """Gets the invite_type of this BetaTesterAttributes.


        :return: The invite_type of this BetaTesterAttributes.
        :rtype: BetaInviteType
        """
        return self._invite_type

    @invite_type.setter
    def invite_type(self, invite_type: BetaInviteType):
        """Sets the invite_type of this BetaTesterAttributes.


        :param invite_type: The invite_type of this BetaTesterAttributes.
        :type invite_type: BetaInviteType
        """

        self._invite_type = invite_type

    @property
    def last_name(self) -> str:
        """Gets the last_name of this BetaTesterAttributes.


        :return: The last_name of this BetaTesterAttributes.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this BetaTesterAttributes.


        :param last_name: The last_name of this BetaTesterAttributes.
        :type last_name: str
        """

        self._last_name = last_name
