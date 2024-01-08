from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.device_update_request_data_attributes import DeviceUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.device_update_request_data_attributes import DeviceUpdateRequestDataAttributes  # noqa: E501

class DeviceUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """DeviceUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this DeviceUpdateRequestData.  # noqa: E501
        :type attributes: DeviceUpdateRequestDataAttributes
        :param id: The id of this DeviceUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this DeviceUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': DeviceUpdateRequestDataAttributes,
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
    def from_dict(cls, dikt) -> 'DeviceUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeviceUpdateRequest_data of this DeviceUpdateRequestData.  # noqa: E501
        :rtype: DeviceUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> DeviceUpdateRequestDataAttributes:
        """Gets the attributes of this DeviceUpdateRequestData.


        :return: The attributes of this DeviceUpdateRequestData.
        :rtype: DeviceUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: DeviceUpdateRequestDataAttributes):
        """Sets the attributes of this DeviceUpdateRequestData.


        :param attributes: The attributes of this DeviceUpdateRequestData.
        :type attributes: DeviceUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this DeviceUpdateRequestData.


        :return: The id of this DeviceUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DeviceUpdateRequestData.


        :param id: The id of this DeviceUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this DeviceUpdateRequestData.


        :return: The type of this DeviceUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this DeviceUpdateRequestData.


        :param type: The type of this DeviceUpdateRequestData.
        :type type: str
        """
        allowed_values = ["devices"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
