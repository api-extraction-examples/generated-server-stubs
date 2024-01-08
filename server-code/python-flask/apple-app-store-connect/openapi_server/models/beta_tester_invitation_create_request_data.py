from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_tester_invitation_create_request_data_relationships import BetaTesterInvitationCreateRequestDataRelationships
from openapi_server import util

from openapi_server.models.beta_tester_invitation_create_request_data_relationships import BetaTesterInvitationCreateRequestDataRelationships  # noqa: E501

class BetaTesterInvitationCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, relationships=None, type=None):  # noqa: E501
        """BetaTesterInvitationCreateRequestData - a model defined in OpenAPI

        :param relationships: The relationships of this BetaTesterInvitationCreateRequestData.  # noqa: E501
        :type relationships: BetaTesterInvitationCreateRequestDataRelationships
        :param type: The type of this BetaTesterInvitationCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'relationships': BetaTesterInvitationCreateRequestDataRelationships,
            'type': str
        }

        self.attribute_map = {
            'relationships': 'relationships',
            'type': 'type'
        }

        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterInvitationCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterInvitationCreateRequest_data of this BetaTesterInvitationCreateRequestData.  # noqa: E501
        :rtype: BetaTesterInvitationCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def relationships(self) -> BetaTesterInvitationCreateRequestDataRelationships:
        """Gets the relationships of this BetaTesterInvitationCreateRequestData.


        :return: The relationships of this BetaTesterInvitationCreateRequestData.
        :rtype: BetaTesterInvitationCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BetaTesterInvitationCreateRequestDataRelationships):
        """Sets the relationships of this BetaTesterInvitationCreateRequestData.


        :param relationships: The relationships of this BetaTesterInvitationCreateRequestData.
        :type relationships: BetaTesterInvitationCreateRequestDataRelationships
        """
        if relationships is None:
            raise ValueError("Invalid value for `relationships`, must not be `None`")  # noqa: E501

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BetaTesterInvitationCreateRequestData.


        :return: The type of this BetaTesterInvitationCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaTesterInvitationCreateRequestData.


        :param type: The type of this BetaTesterInvitationCreateRequestData.
        :type type: str
        """
        allowed_values = ["betaTesterInvitations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
