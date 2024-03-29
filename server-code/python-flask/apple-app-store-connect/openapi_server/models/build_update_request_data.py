from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.build_update_request_data_attributes import BuildUpdateRequestDataAttributes
from openapi_server.models.build_update_request_data_relationships import BuildUpdateRequestDataRelationships
from openapi_server import util

from openapi_server.models.build_update_request_data_attributes import BuildUpdateRequestDataAttributes  # noqa: E501
from openapi_server.models.build_update_request_data_relationships import BuildUpdateRequestDataRelationships  # noqa: E501

class BuildUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, relationships=None, type=None):  # noqa: E501
        """BuildUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BuildUpdateRequestData.  # noqa: E501
        :type attributes: BuildUpdateRequestDataAttributes
        :param id: The id of this BuildUpdateRequestData.  # noqa: E501
        :type id: str
        :param relationships: The relationships of this BuildUpdateRequestData.  # noqa: E501
        :type relationships: BuildUpdateRequestDataRelationships
        :param type: The type of this BuildUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BuildUpdateRequestDataAttributes,
            'id': str,
            'relationships': BuildUpdateRequestDataRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BuildUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BuildUpdateRequest_data of this BuildUpdateRequestData.  # noqa: E501
        :rtype: BuildUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BuildUpdateRequestDataAttributes:
        """Gets the attributes of this BuildUpdateRequestData.


        :return: The attributes of this BuildUpdateRequestData.
        :rtype: BuildUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BuildUpdateRequestDataAttributes):
        """Sets the attributes of this BuildUpdateRequestData.


        :param attributes: The attributes of this BuildUpdateRequestData.
        :type attributes: BuildUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BuildUpdateRequestData.


        :return: The id of this BuildUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BuildUpdateRequestData.


        :param id: The id of this BuildUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def relationships(self) -> BuildUpdateRequestDataRelationships:
        """Gets the relationships of this BuildUpdateRequestData.


        :return: The relationships of this BuildUpdateRequestData.
        :rtype: BuildUpdateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BuildUpdateRequestDataRelationships):
        """Sets the relationships of this BuildUpdateRequestData.


        :param relationships: The relationships of this BuildUpdateRequestData.
        :type relationships: BuildUpdateRequestDataRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BuildUpdateRequestData.


        :return: The type of this BuildUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BuildUpdateRequestData.


        :param type: The type of this BuildUpdateRequestData.
        :type type: str
        """
        allowed_values = ["builds"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
