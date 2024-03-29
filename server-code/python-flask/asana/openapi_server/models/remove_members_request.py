from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RemoveMembersRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, members=None):  # noqa: E501
        """RemoveMembersRequest - a model defined in OpenAPI

        :param members: The members of this RemoveMembersRequest.  # noqa: E501
        :type members: str
        """
        self.openapi_types = {
            'members': str
        }

        self.attribute_map = {
            'members': 'members'
        }

        self._members = members

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveMembersRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RemoveMembersRequest of this RemoveMembersRequest.  # noqa: E501
        :rtype: RemoveMembersRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def members(self) -> str:
        """Gets the members of this RemoveMembersRequest.

        An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :return: The members of this RemoveMembersRequest.
        :rtype: str
        """
        return self._members

    @members.setter
    def members(self, members: str):
        """Sets the members of this RemoveMembersRequest.

        An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :param members: The members of this RemoveMembersRequest.
        :type members: str
        """
        if members is None:
            raise ValueError("Invalid value for `members`, must not be `None`")  # noqa: E501

        self._members = members
