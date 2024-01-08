from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_preview_set_create_request_data_attributes import AppPreviewSetCreateRequestDataAttributes
from openapi_server.models.app_preview_set_create_request_data_relationships import AppPreviewSetCreateRequestDataRelationships
from openapi_server import util

from openapi_server.models.app_preview_set_create_request_data_attributes import AppPreviewSetCreateRequestDataAttributes  # noqa: E501
from openapi_server.models.app_preview_set_create_request_data_relationships import AppPreviewSetCreateRequestDataRelationships  # noqa: E501

class AppPreviewSetCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, relationships=None, type=None):  # noqa: E501
        """AppPreviewSetCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this AppPreviewSetCreateRequestData.  # noqa: E501
        :type attributes: AppPreviewSetCreateRequestDataAttributes
        :param relationships: The relationships of this AppPreviewSetCreateRequestData.  # noqa: E501
        :type relationships: AppPreviewSetCreateRequestDataRelationships
        :param type: The type of this AppPreviewSetCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppPreviewSetCreateRequestDataAttributes,
            'relationships': AppPreviewSetCreateRequestDataRelationships,
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
    def from_dict(cls, dikt) -> 'AppPreviewSetCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreviewSetCreateRequest_data of this AppPreviewSetCreateRequestData.  # noqa: E501
        :rtype: AppPreviewSetCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppPreviewSetCreateRequestDataAttributes:
        """Gets the attributes of this AppPreviewSetCreateRequestData.


        :return: The attributes of this AppPreviewSetCreateRequestData.
        :rtype: AppPreviewSetCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppPreviewSetCreateRequestDataAttributes):
        """Sets the attributes of this AppPreviewSetCreateRequestData.


        :param attributes: The attributes of this AppPreviewSetCreateRequestData.
        :type attributes: AppPreviewSetCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def relationships(self) -> AppPreviewSetCreateRequestDataRelationships:
        """Gets the relationships of this AppPreviewSetCreateRequestData.


        :return: The relationships of this AppPreviewSetCreateRequestData.
        :rtype: AppPreviewSetCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppPreviewSetCreateRequestDataRelationships):
        """Sets the relationships of this AppPreviewSetCreateRequestData.


        :param relationships: The relationships of this AppPreviewSetCreateRequestData.
        :type relationships: AppPreviewSetCreateRequestDataRelationships
        """
        if relationships is None:
            raise ValueError("Invalid value for `relationships`, must not be `None`")  # noqa: E501

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppPreviewSetCreateRequestData.


        :return: The type of this AppPreviewSetCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppPreviewSetCreateRequestData.


        :param type: The type of this AppPreviewSetCreateRequestData.
        :type type: str
        """
        allowed_values = ["appPreviewSets"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type