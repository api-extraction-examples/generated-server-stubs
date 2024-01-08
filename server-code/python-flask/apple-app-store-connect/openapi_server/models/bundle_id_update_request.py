from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_update_request_data import BundleIdUpdateRequestData
from openapi_server import util

from openapi_server.models.bundle_id_update_request_data import BundleIdUpdateRequestData  # noqa: E501

class BundleIdUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BundleIdUpdateRequest - a model defined in OpenAPI

        :param data: The data of this BundleIdUpdateRequest.  # noqa: E501
        :type data: BundleIdUpdateRequestData
        """
        self.openapi_types = {
            'data': BundleIdUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdUpdateRequest of this BundleIdUpdateRequest.  # noqa: E501
        :rtype: BundleIdUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BundleIdUpdateRequestData:
        """Gets the data of this BundleIdUpdateRequest.


        :return: The data of this BundleIdUpdateRequest.
        :rtype: BundleIdUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: BundleIdUpdateRequestData):
        """Sets the data of this BundleIdUpdateRequest.


        :param data: The data of this BundleIdUpdateRequest.
        :type data: BundleIdUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data