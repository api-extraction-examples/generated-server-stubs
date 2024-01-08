from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class BetaTesterInvitation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, links=None, type=None):  # noqa: E501
        """BetaTesterInvitation - a model defined in OpenAPI

        :param id: The id of this BetaTesterInvitation.  # noqa: E501
        :type id: str
        :param links: The links of this BetaTesterInvitation.  # noqa: E501
        :type links: ResourceLinks
        :param type: The type of this BetaTesterInvitation.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'id': str,
            'links': ResourceLinks,
            'type': str
        }

        self.attribute_map = {
            'id': 'id',
            'links': 'links',
            'type': 'type'
        }

        self._id = id
        self._links = links
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterInvitation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterInvitation of this BetaTesterInvitation.  # noqa: E501
        :rtype: BetaTesterInvitation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this BetaTesterInvitation.


        :return: The id of this BetaTesterInvitation.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaTesterInvitation.


        :param id: The id of this BetaTesterInvitation.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this BetaTesterInvitation.


        :return: The links of this BetaTesterInvitation.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this BetaTesterInvitation.


        :param links: The links of this BetaTesterInvitation.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def type(self) -> str:
        """Gets the type of this BetaTesterInvitation.


        :return: The type of this BetaTesterInvitation.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaTesterInvitation.


        :param type: The type of this BetaTesterInvitation.
        :type type: str
        """
        allowed_values = ["betaTesterInvitations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
