from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app import App
from openapi_server.models.document_links import DocumentLinks
from openapi_server.models.user_invitation import UserInvitation
from openapi_server import util

from openapi_server.models.app import App  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501
from openapi_server.models.user_invitation import UserInvitation  # noqa: E501

class UserInvitationResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None):  # noqa: E501
        """UserInvitationResponse - a model defined in OpenAPI

        :param data: The data of this UserInvitationResponse.  # noqa: E501
        :type data: UserInvitation
        :param included: The included of this UserInvitationResponse.  # noqa: E501
        :type included: List[App]
        :param links: The links of this UserInvitationResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': UserInvitation,
            'included': List[App],
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'included': 'included',
            'links': 'links'
        }

        self._data = data
        self._included = included
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'UserInvitationResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserInvitationResponse of this UserInvitationResponse.  # noqa: E501
        :rtype: UserInvitationResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> UserInvitation:
        """Gets the data of this UserInvitationResponse.


        :return: The data of this UserInvitationResponse.
        :rtype: UserInvitation
        """
        return self._data

    @data.setter
    def data(self, data: UserInvitation):
        """Sets the data of this UserInvitationResponse.


        :param data: The data of this UserInvitationResponse.
        :type data: UserInvitation
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[App]:
        """Gets the included of this UserInvitationResponse.


        :return: The included of this UserInvitationResponse.
        :rtype: List[App]
        """
        return self._included

    @included.setter
    def included(self, included: List[App]):
        """Sets the included of this UserInvitationResponse.


        :param included: The included of this UserInvitationResponse.
        :type included: List[App]
        """

        self._included = included

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this UserInvitationResponse.


        :return: The links of this UserInvitationResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this UserInvitationResponse.


        :param links: The links of this UserInvitationResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
