from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_create_request_data_attributes import BundleIdCreateRequestDataAttributes
from openapi_server import util

from openapi_server.models.bundle_id_create_request_data_attributes import BundleIdCreateRequestDataAttributes  # noqa: E501

class BundleIdCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, type=None):  # noqa: E501
        """BundleIdCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BundleIdCreateRequestData.  # noqa: E501
        :type attributes: BundleIdCreateRequestDataAttributes
        :param type: The type of this BundleIdCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BundleIdCreateRequestDataAttributes,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'type': 'type'
        }

        self._attributes = attributes
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCreateRequest_data of this BundleIdCreateRequestData.  # noqa: E501
        :rtype: BundleIdCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BundleIdCreateRequestDataAttributes:
        """Gets the attributes of this BundleIdCreateRequestData.


        :return: The attributes of this BundleIdCreateRequestData.
        :rtype: BundleIdCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BundleIdCreateRequestDataAttributes):
        """Sets the attributes of this BundleIdCreateRequestData.


        :param attributes: The attributes of this BundleIdCreateRequestData.
        :type attributes: BundleIdCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def type(self) -> str:
        """Gets the type of this BundleIdCreateRequestData.


        :return: The type of this BundleIdCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BundleIdCreateRequestData.


        :param type: The type of this BundleIdCreateRequestData.
        :type type: str
        """
        allowed_values = ["bundleIds"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
