from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_capability_update_request_data import BundleIdCapabilityUpdateRequestData
from openapi_server import util

from openapi_server.models.bundle_id_capability_update_request_data import BundleIdCapabilityUpdateRequestData  # noqa: E501

class BundleIdCapabilityUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BundleIdCapabilityUpdateRequest - a model defined in OpenAPI

        :param data: The data of this BundleIdCapabilityUpdateRequest.  # noqa: E501
        :type data: BundleIdCapabilityUpdateRequestData
        """
        self.openapi_types = {
            'data': BundleIdCapabilityUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCapabilityUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCapabilityUpdateRequest of this BundleIdCapabilityUpdateRequest.  # noqa: E501
        :rtype: BundleIdCapabilityUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BundleIdCapabilityUpdateRequestData:
        """Gets the data of this BundleIdCapabilityUpdateRequest.


        :return: The data of this BundleIdCapabilityUpdateRequest.
        :rtype: BundleIdCapabilityUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: BundleIdCapabilityUpdateRequestData):
        """Sets the data of this BundleIdCapabilityUpdateRequest.


        :param data: The data of this BundleIdCapabilityUpdateRequest.
        :type data: BundleIdCapabilityUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
