from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_update_request_data_attributes import BundleIdUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.bundle_id_update_request_data_attributes import BundleIdUpdateRequestDataAttributes  # noqa: E501

class BundleIdUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """BundleIdUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BundleIdUpdateRequestData.  # noqa: E501
        :type attributes: BundleIdUpdateRequestDataAttributes
        :param id: The id of this BundleIdUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this BundleIdUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BundleIdUpdateRequestDataAttributes,
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
    def from_dict(cls, dikt) -> 'BundleIdUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdUpdateRequest_data of this BundleIdUpdateRequestData.  # noqa: E501
        :rtype: BundleIdUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BundleIdUpdateRequestDataAttributes:
        """Gets the attributes of this BundleIdUpdateRequestData.


        :return: The attributes of this BundleIdUpdateRequestData.
        :rtype: BundleIdUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BundleIdUpdateRequestDataAttributes):
        """Sets the attributes of this BundleIdUpdateRequestData.


        :param attributes: The attributes of this BundleIdUpdateRequestData.
        :type attributes: BundleIdUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BundleIdUpdateRequestData.


        :return: The id of this BundleIdUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BundleIdUpdateRequestData.


        :param id: The id of this BundleIdUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this BundleIdUpdateRequestData.


        :return: The type of this BundleIdUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BundleIdUpdateRequestData.


        :param type: The type of this BundleIdUpdateRequestData.
        :type type: str
        """
        allowed_values = ["bundleIds"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
