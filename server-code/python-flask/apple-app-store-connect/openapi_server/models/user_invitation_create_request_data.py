from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_invitation_create_request_data_attributes import UserInvitationCreateRequestDataAttributes
from openapi_server.models.user_invitation_create_request_data_relationships import UserInvitationCreateRequestDataRelationships
from openapi_server import util

from openapi_server.models.user_invitation_create_request_data_attributes import UserInvitationCreateRequestDataAttributes  # noqa: E501
from openapi_server.models.user_invitation_create_request_data_relationships import UserInvitationCreateRequestDataRelationships  # noqa: E501

class UserInvitationCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, relationships=None, type=None):  # noqa: E501
        """UserInvitationCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this UserInvitationCreateRequestData.  # noqa: E501
        :type attributes: UserInvitationCreateRequestDataAttributes
        :param relationships: The relationships of this UserInvitationCreateRequestData.  # noqa: E501
        :type relationships: UserInvitationCreateRequestDataRelationships
        :param type: The type of this UserInvitationCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': UserInvitationCreateRequestDataAttributes,
            'relationships': UserInvitationCreateRequestDataRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'UserInvitationCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserInvitationCreateRequest_data of this UserInvitationCreateRequestData.  # noqa: E501
        :rtype: UserInvitationCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> UserInvitationCreateRequestDataAttributes:
        """Gets the attributes of this UserInvitationCreateRequestData.


        :return: The attributes of this UserInvitationCreateRequestData.
        :rtype: UserInvitationCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: UserInvitationCreateRequestDataAttributes):
        """Sets the attributes of this UserInvitationCreateRequestData.


        :param attributes: The attributes of this UserInvitationCreateRequestData.
        :type attributes: UserInvitationCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def relationships(self) -> UserInvitationCreateRequestDataRelationships:
        """Gets the relationships of this UserInvitationCreateRequestData.


        :return: The relationships of this UserInvitationCreateRequestData.
        :rtype: UserInvitationCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: UserInvitationCreateRequestDataRelationships):
        """Sets the relationships of this UserInvitationCreateRequestData.


        :param relationships: The relationships of this UserInvitationCreateRequestData.
        :type relationships: UserInvitationCreateRequestDataRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this UserInvitationCreateRequestData.


        :return: The type of this UserInvitationCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this UserInvitationCreateRequestData.


        :param type: The type of this UserInvitationCreateRequestData.
        :type type: str
        """
        allowed_values = ["userInvitations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type