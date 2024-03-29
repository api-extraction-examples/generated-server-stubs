from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.resource_links import ResourceLinks
from openapi_server.models.user_invitation_attributes import UserInvitationAttributes
from openapi_server.models.user_relationships import UserRelationships
from openapi_server import util

from openapi_server.models.resource_links import ResourceLinks  # noqa: E501
from openapi_server.models.user_invitation_attributes import UserInvitationAttributes  # noqa: E501
from openapi_server.models.user_relationships import UserRelationships  # noqa: E501

class UserInvitation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """UserInvitation - a model defined in OpenAPI

        :param attributes: The attributes of this UserInvitation.  # noqa: E501
        :type attributes: UserInvitationAttributes
        :param id: The id of this UserInvitation.  # noqa: E501
        :type id: str
        :param links: The links of this UserInvitation.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this UserInvitation.  # noqa: E501
        :type relationships: UserRelationships
        :param type: The type of this UserInvitation.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': UserInvitationAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': UserRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'UserInvitation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserInvitation of this UserInvitation.  # noqa: E501
        :rtype: UserInvitation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> UserInvitationAttributes:
        """Gets the attributes of this UserInvitation.


        :return: The attributes of this UserInvitation.
        :rtype: UserInvitationAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: UserInvitationAttributes):
        """Sets the attributes of this UserInvitation.


        :param attributes: The attributes of this UserInvitation.
        :type attributes: UserInvitationAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this UserInvitation.


        :return: The id of this UserInvitation.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this UserInvitation.


        :param id: The id of this UserInvitation.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this UserInvitation.


        :return: The links of this UserInvitation.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this UserInvitation.


        :param links: The links of this UserInvitation.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> UserRelationships:
        """Gets the relationships of this UserInvitation.


        :return: The relationships of this UserInvitation.
        :rtype: UserRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: UserRelationships):
        """Sets the relationships of this UserInvitation.


        :param relationships: The relationships of this UserInvitation.
        :type relationships: UserRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this UserInvitation.


        :return: The type of this UserInvitation.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this UserInvitation.


        :param type: The type of this UserInvitation.
        :type type: str
        """
        allowed_values = ["userInvitations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
