from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_preview_update_request_data_attributes import AppPreviewUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.app_preview_update_request_data_attributes import AppPreviewUpdateRequestDataAttributes  # noqa: E501

class AppPreviewUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """AppPreviewUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this AppPreviewUpdateRequestData.  # noqa: E501
        :type attributes: AppPreviewUpdateRequestDataAttributes
        :param id: The id of this AppPreviewUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this AppPreviewUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppPreviewUpdateRequestDataAttributes,
            'id': str,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreviewUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreviewUpdateRequest_data of this AppPreviewUpdateRequestData.  # noqa: E501
        :rtype: AppPreviewUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppPreviewUpdateRequestDataAttributes:
        """Gets the attributes of this AppPreviewUpdateRequestData.


        :return: The attributes of this AppPreviewUpdateRequestData.
        :rtype: AppPreviewUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppPreviewUpdateRequestDataAttributes):
        """Sets the attributes of this AppPreviewUpdateRequestData.


        :param attributes: The attributes of this AppPreviewUpdateRequestData.
        :type attributes: AppPreviewUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppPreviewUpdateRequestData.


        :return: The id of this AppPreviewUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppPreviewUpdateRequestData.


        :param id: The id of this AppPreviewUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this AppPreviewUpdateRequestData.


        :return: The type of this AppPreviewUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppPreviewUpdateRequestData.


        :param type: The type of this AppPreviewUpdateRequestData.
        :type type: str
        """
        allowed_values = ["appPreviews"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
